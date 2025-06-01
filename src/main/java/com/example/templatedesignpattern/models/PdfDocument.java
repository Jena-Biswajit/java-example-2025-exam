package com.example.templatedesignpattern.models;

import com.example.templatedesignpattern.templatefile.FileProcessor;

public class PdfDocument extends FileProcessor {
    @Override
    protected void open(){
        System.out.println("opening of pdf file");
    }
    @Override
    protected void extract(){
        System.out.println("extracting of pdf file");
    }
    @Override
    protected void process(){
        System.out.println("processing of pdf file");
    }
    @Override
    protected void close(){
        System.out.println("closing of pdf file");
    }
}
