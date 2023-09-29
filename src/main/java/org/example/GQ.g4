/*
    Grammar for GlebQuery-Language
    a.b.c->a.b(title)
*/

parser grammar GQ;

options { tokenVocab=GQLexer; }

start : left STRELKA right;
left : ASTRING DOT ASTRING DOT ASTRING;
right : ASTRING DOT ASTRING LPARENTHESIS ASTRING RPARENTHESIS;
