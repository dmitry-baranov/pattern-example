package com.dmitrii.structured.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{

    private String name;
    private List<FileSystemItem> fileSystemItems;

    public Folder(String name){
        this.name = name;
        this.fileSystemItems = new ArrayList<>();
    }

    @Override
    public int calculateSize() {
        int size = 0;
        for(FileSystemItem item: fileSystemItems){
            size += item.calculateSize();
        }
        return size;
    }

    public void add(FileSystemItem fileSystemItem){
        fileSystemItems.add(fileSystemItem);
    }

    public void display() {
        System.out.println("+ Folder: " + name);
        for (FileSystemItem item : fileSystemItems) {
            item.display();
        }
    }
}
