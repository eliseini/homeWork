package com.company.oop_tasks.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;

public class Main {
    public static void main(String[] args) {

try (FileReader fileReader=new FileReader("src\\com\\company\\oop_tasks\\file\\Text1.text");
     FileWriter fileWriter=new FileWriter("src\\com\\company\\oop_tasks\\file\\Text2.text")){
    int myText;
    while((myText= fileReader.read())!=-1){
        System.out.print((char)myText);
//        myText= fileReader.read();
        int result=myText;

        fileWriter.write((char)myText);

    }
    } catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}

    }
}
