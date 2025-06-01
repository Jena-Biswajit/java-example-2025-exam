package com.example.templatedesignpattern.app;

import com.example.templatedesignpattern.models.PdfDocument;
import com.example.templatedesignpattern.models.WordDocument;
import com.example.templatedesignpattern.templatefile.FileProcessor;

public class App1 {
    public static void main(String[] args) {
        FileProcessor pdf = new PdfDocument();
        pdf.processFile();

        System.out.println("-----------------");

        FileProcessor word = new WordDocument();
        word.processFile();
    }
}
