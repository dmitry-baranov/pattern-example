package com.dmitrii.structured.composite;

public class TextFile extends File{
    public TextFile(String name, int size){
        super(name, size);
    }

    @Override
    public int calculateSize() {
        return this.size;
    }

    @Override
    public void display() {
        System.out.println("- Text File: " + name);
    }
}
