package com.example.templatedesignpattern.templatefile;

public abstract class FileProcessor {

    public final void processFile(){
        open();
        extract();
        process();
        close();
    }

    protected abstract void open();
    protected abstract void extract();
    protected abstract void process();

    protected void close(){
        System.out.println("closing files");
    }

}
