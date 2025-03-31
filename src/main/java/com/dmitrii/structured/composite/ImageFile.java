package com.dmitrii.structured.composite;

public class ImageFile extends File{
    public ImageFile(String name, int size){
        super(name, size);
    }

    @Override
    public int calculateSize() {
        return this.size;
    }

    @Override
    public void display() {
        System.out.println("- Image File: " + name);
    }
}
