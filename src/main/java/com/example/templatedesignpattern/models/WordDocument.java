package com.example.templatedesignpattern.models;

import com.example.templatedesignpattern.templatefile.FileProcessor;

public class WordDocument extends FileProcessor {

    @Override
    protected void open(){
        System.out.println("opening of word document");
    }

    @Override
    protected void extract() {
        System.out.println("extracting document");
    }

    @Override
    protected void process() {
        System.out.println("processing document");
    }

    @Override
    protected void close() {
        System.out.println("closing document");
    }
}
