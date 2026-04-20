package com.example.exceptionconcepts.throwsconcepts;
//Throws-->
import java.io.*;

class TestClass {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}