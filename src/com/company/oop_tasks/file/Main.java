package com.company.oop_tasks.file;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
////ClassWork

//try (FileReader fileReader=new FileReader("src\\com\\company\\oop_tasks\\file\\Text1.text");
//     FileWriter fileWriter=new FileWriter("src\\com\\company\\oop_tasks\\file\\Text2.text")){
//    int myText;
//    while((myText= fileReader.read())!=-1){
//        System.out.print((char)myText);
//
//        int result=myText;
//
//        fileWriter.write((char)myText);
//
//    }
//    } catch (FileNotFoundException e) {
//    e.printStackTrace();
//} catch (IOException e) {
//    e.printStackTrace();
//}

////        HomeWork

//#1
//        try (FileWriter fileWriter = new FileWriter("src\\com\\company\\oop_tasks\\file\\Text2.txt");
//        FileReader fileReader=new FileReader("src\\com\\company\\oop_tasks\\file\\Text2.txt")) {
//            Scanner sc = new Scanner(System.in);
//
//            while (true) {
//                String str = sc.nextLine();
//                if (!str.equals("")) {
//                    fileWriter.write(str+"\n");
//                }else{
//                    break;
//                }
//
//
//            }
//        }catch (IOException e)
//
//        {
//            e.printStackTrace();
//        }

//#2 не получилось посчитать символы и слова
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\company\\oop_tasks\\file\\Text2.txt"))) {
//            int lines = 0;
//            while (bufferedReader.lines() != null) {
//                lines++;
//                System.out.println(lines + " - " + bufferedReader.readLine());
//
//                break;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//#3
//        try(FileWriter fileWriter=new FileWriter("src\\com\\company\\oop_tasks\\file\\Text1.txt")){
//
//            int sum=0;
//            for (int i = 1; i <=10 ; i++) {
//
//                fileWriter.write(i+"\n");
//                sum+=i;
//
//            }fileWriter.write("\n Сумма всех чисел "+sum);
//        }
//#4 не получилось перезаписать
//        try (FileWriter fileWriter = new FileWriter("src\\com\\company\\oop_tasks\\file\\Text3.txt");
////             FileReader fileReader = new  FileReader("src\\com\\company\\oop_tasks\\file\\Text2.txt");
//             FileWriter fileWriter2 = new FileWriter("src\\com\\company\\oop_tasks\\file\\Text2.txt")) {
//            Scanner sc = new Scanner(System.in);
//            String str;
//                      while (true) {
//                str = sc.nextLine();
//                if (!str.equals("")) {
//                    fileWriter.write(str+"\n");
//                }else {
//                    break;
//
//                }
//                }
//
//            while (true){
//                if(str.lines().equals("a")){
//                    fileWriter2.write(str);
//                }else {
//                    break;
//
//                }
//            }
//            } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
//#5
//        try(FileReader fileReader = new  FileReader("src\\com\\company\\oop_tasks\\file\\Text1.txt");
//            FileWriter fileWriter=new FileWriter("src\\com\\company\\oop_tasks\\file\\Text1.txt")){
//
//            int sum=0;
//            for (int i = 1; i <=10 ; i++) {
//
//                if(i%2!=0){
//                    fileWriter.write(i+" \n");
//                }
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//#6

    }
}




