package org.example.parserlexer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class NewListener extends XMLParserBaseListener {
    StringBuilder sb= new StringBuilder();
    int mode = 0; // 0 - start, 1 - enter, 2- exit
    @Override public void enterDocument(XMLParser.DocumentContext ctx) {
        sb.append("{\n  ");
    }

    @Override public void enterElement(XMLParser.ElementContext ctx) {
        String element = ctx.Name(0).toString();
        if (mode==2) {
            System.out.print(",");
            sb.append(",\n");
        }
        mode = 1;
        System.out.println("\"" + element + "\": ");
        sb.append("\"" + element + "\": ");
        boolean isLeaf=true;
        XMLParser.ContentContext tmp = ctx.content();
        if (tmp==null) {
            isLeaf = true;
        }
        else {
            List<XMLParser.ElementContext> tmp2 = tmp.element();
            if (tmp2==null) {
                isLeaf = true;
            }
            else {
                if (tmp2.isEmpty()) {
                    isLeaf = true;
                }
                else {
                    isLeaf = false;
                }
            }
        }

        if (isLeaf) {
            System.out.print("\" final node \"");
            //sb.append("\" final node \"");
            sb.append(" \""+ctx.content().getText()+"\"");
        }
        else {
            System.out.print("{");
            sb.append("{\n  ");
        }
        // N. Wirth Algorithms plus Data structures = Programs
        // oblasti vidimosti realizujutsja s pomoshju vspomogatelnih stekov
        // pridumat' filtrazju, chtobi tolko te uzli obsledovat', kotorije v query ukazani javno
        // ostavit tolko te, kotorije javno perechislenni
        // parser xml (jest), parser QG (poka net) i engine
        // snachala parsitsja QG, potom xml, potom engine
        // SAX -> listener
        // DOM -> visitor
        //
    }
    // sdelat' GIT
    @Override public void exitElement(XMLParser.ElementContext ctx) {
        String element = ctx.Name(0).toString();
        boolean isLeaf=true;
        XMLParser.ContentContext tmp = ctx.content();
        if (tmp==null) {
            isLeaf = true;
        }
        else {
            List<XMLParser.ElementContext> tmp2 = tmp.element();
            if (tmp2==null) {
                isLeaf = true;
            }
            else {
                if (tmp2.isEmpty()) {
                    isLeaf = true;
                }
                else {
                    isLeaf = false;
                }
            }
        }
        if (!isLeaf) {
            System.out.println("}");
            sb.append("}");
        }
        mode = 2;
    }
    @Override public void enterContent(XMLParser.ContentContext ctx) {

    }
    @Override public void exitContent(XMLParser.ContentContext ctx) {

    }
    @Override public void enterAttribute(XMLParser.AttributeContext ctx) {
    }
    @Override public void exitDocument(XMLParser.DocumentContext ctx) {
        System.out.println("");
        sb.append("\n}");
        System.out.println("-------------------RESULT--------------------");
        System.out.println(sb.toString());
        System.out.println("---------------------------------------------");
    }
}
