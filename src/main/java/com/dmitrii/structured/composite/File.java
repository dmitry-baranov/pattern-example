package com.dmitrii.structured.composite;

public abstract class File implements FileSystemItem{
    protected String name;
    protected int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
}
