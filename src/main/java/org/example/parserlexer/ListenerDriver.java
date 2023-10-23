package org.example.parserlexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class ListenerDriver {
    public static void start() throws IOException {
        CharStream xml = CharStreams.fromFileName("src/main/resources/input.xml");
        XMLLexer lexer = new XMLLexer(xml);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XMLParser parser = new XMLParser(tokens);
        ParseTree tree = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        NewListener listener = new NewListener();
        walker.walk(listener, tree);
        System.out.println(listener.getJson().toString());
    }
}
