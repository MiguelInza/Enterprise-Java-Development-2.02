package com.miguel.EnterpriseJavaDevelopment202.classes;

public class JavaKeywords {
    private static final String[] JAVA_KEYWORDS = {
            "abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized",
            "boolean", "do", "if", "private", "this",
            "break", "double", "implements", "protected", "throw",
            "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient",
            "catch", "extends", "int", "short", "try",
            "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile",
            "const", "float", "native", "super", "while"
    };
    public static boolean containsKeyword(String str) {
        str = str.toLowerCase();
        for (String keyword : JAVA_KEYWORDS) {
            if (str.contains(" " + keyword + " ") ||
                    str.startsWith(keyword + " ") ||
                    str.endsWith(" " + keyword) ||
                    str.equals(keyword)) {
                return true;
            }
        }
        return false;
    }
}

