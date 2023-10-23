package org.example;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.parserlexer.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //ListenerDriver.start();
        VisitorDriver.start();
    }
}