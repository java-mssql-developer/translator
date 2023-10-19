package org.example;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.parserlexer.NewListener;
import org.example.parserlexer.XMLLexer;
import org.example.parserlexer.XMLParser;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream xml = CharStreams.fromFileName("src/main/resources/input.xml");
        XMLLexer lexer = new XMLLexer(xml);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XMLParser parser = new XMLParser(tokens);
        ParseTree tree = parser.document();
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        NewListener listener = new NewListener();
        walker.walk(listener, tree);
        System.out.println(listener.getJson().toString());
    }
}