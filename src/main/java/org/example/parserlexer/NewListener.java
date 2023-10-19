package org.example.parserlexer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class NewListener extends XMLParserBaseListener {
    StringBuilder sb= new StringBuilder();
    int mode = 0; // 0 - start, 1 - enter, 2- exit
    @Override public void enterElement(XMLParser.ElementContext ctx) {
        StringBuilder attributeSb = new StringBuilder();
        int i = 0;
        while (ctx.attribute(i)!=null){
            attributeSb.append(" "+ctx.attribute(i).Name().toString()+ctx.attribute(i).STRING().getText().replaceAll("\"","'"));
            i++;
        }
        String element = ctx.Name(0).toString();
        if (mode==2) {
            sb.append(",\n");
        }
        mode = 1;
        if (attributeSb.toString().equals("")) {
            sb.append("{\"" + element + "\": ");
        }else {
            sb.append("{\"" + element +" "+attributeSb+ "\": ");
        }
        boolean isLeaf=true;
        XMLParser.ContentContext tmp = ctx.content();
        isLeaf = tmp == null || tmp.element() == null || tmp.element().isEmpty();
        if (isLeaf) {
            sb.append(" \""+ctx.content().getText()+"\"");
        }
        else {
            sb.append("[\n  ");
        }
    }
    @Override public void exitElement(XMLParser.ElementContext ctx) {
        boolean isLeaf=true;
        XMLParser.ContentContext tmp = ctx.content();
        isLeaf = tmp == null || tmp.element() == null || tmp.element().isEmpty();
        if (isLeaf) {
            sb.append("}");
        }
        else {
            isLeaf = false;
        }
        if (!isLeaf) {
            sb.append("]}");
        }
        mode = 2;
    }
    @Override public void exitDocument(XMLParser.DocumentContext ctx) {
        System.out.println("");
        sb.append("\n");
        System.out.println("-------------------RESULT-------------------\n");
        System.out.println(sb.toString());
        System.out.println("---------------------------------------------");
    }
}
