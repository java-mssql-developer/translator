package org.example.parserlexer;

import org.antlr.v4.misc.OrderedHashMap;

import java.util.Map;

public class NewVisitor extends XMLParserBaseVisitor<String>{

    StringBuilder sb = new StringBuilder();
    int mode = 0; // 0-start, 1-enter, 2-exit

    @Override
    public String visitElement(XMLParser.ElementContext ctx) {
        String name = ctx.Name(0).getText();
        XMLParser.ContentContext tmp = ctx.content();
        if (mode==2) {
            sb.append(",\n");
        }
        mode = 1;
        boolean isLeaf = tmp==null || tmp.isEmpty() || tmp.element().isEmpty();
        if (isLeaf) {
            if (tmp==null) {
                sb.append("{\""+name+"\": null}");
            }
            else {
                sb.append("{\""+name+"\": \""+ctx.content().getText()+"\"}");
            }
        }
        else {
            sb.append("{\""+name+"\": [");
        }
        visitChildren(ctx);
        mode = 2;
        if (!isLeaf) {
            sb.append("]}");
        }
        return sb.toString();
    }
    @Override
    public String visitDocument(XMLParser.DocumentContext ctx) {
        visitChildren(ctx);
        return "{"+sb.toString().substring(0, sb.length()-1)+"}";
    }

    @Override
    public String visitAttribute(XMLParser.AttributeContext ctx) {
        return "";
    }

    @Override
    public String visitContent(XMLParser.ContentContext ctx) {
        visitChildren(ctx);
        return "";
    }

    @Override
    public String visitChardata(XMLParser.ChardataContext ctx) {
        return "";
    }

}
