package org.example.parserlexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class VisitorDriver {
    public static void start() throws IOException {
        CharStream xml = CharStreams.fromFileName("src/main/resources/input.xml");
        XMLLexer lexer = new XMLLexer(xml);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XMLParser parser = new XMLParser(tokens);
        ParseTree tree = parser.document();
        NewVisitor visitor = new NewVisitor();
        String result = visitor.visit(tree);
        System.out.println(visitor.sb.toString());
    }
}
