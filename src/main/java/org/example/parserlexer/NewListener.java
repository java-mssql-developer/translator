package org.example.parserlexer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class NewListener extends XMLParserBaseListener {
    StringBuilder sb= new StringBuilder();
    int mode = 0; // 0 - start, 1 - enter, 2- exit
    public StringBuilder getJson(){
        return sb;
    }
    @Override public void enterElement(XMLParser.ElementContext ctx) {
        StringBuilder attributeSb = new StringBuilder();
        int i = 0;
        while (ctx.attribute(i)!=null){
            if (ctx.attribute(i).STRING().getText()!=null)
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
            if (ctx.content()!=null)
                sb.append(" \""+ctx.content().getText()+"\"");
            else
                sb.append("null");
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
}
