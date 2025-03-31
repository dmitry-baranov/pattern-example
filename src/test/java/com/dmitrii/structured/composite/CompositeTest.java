package com.dmitrii.structured.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompositeTest {

    @Test
    public void compositeTest(){
        FileSystemItem photo = new ImageFile("vacation.jpg", 20);
        FileSystemItem notes = new TextFile("notes.txt", 50);
        FileSystemItem script = new TextFile("deploy.sh", 100);
        FileSystemItem diagram = new ImageFile("architecture.png", 200);

        Folder root = new Folder("root");
        Folder docs = new Folder("documents");
        Folder images = new Folder("images");
        Folder scripts = new Folder("scripts");

        docs.add(notes);

        images.add(photo);
        images.add(diagram);

        scripts.add(script);

        root.add(docs);
        root.add(images);
        root.add(scripts);

        Assertions.assertEquals(50, docs.calculateSize());
        Assertions.assertEquals(220, images.calculateSize());
        Assertions.assertEquals(100, scripts.calculateSize());
        Assertions.assertEquals(370, root.calculateSize());
    }

}