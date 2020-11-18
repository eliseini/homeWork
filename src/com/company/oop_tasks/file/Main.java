package com.company.oop_tasks.file;


import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
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

//#2 Работает не верно
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\company\\oop_tasks\\file\\Text2.txt"))) {
            int lines = 0;
            String line=bufferedReader.readLine();
            int blockCount=bufferedReader.readLine().split(" ").length;
            while (bufferedReader.readLine() != null) {
                if (bufferedReader.readLine() != null) {
                    lines++;

                    System.out.println(lines + " - " + line.length() + " - " + blockCount);
                }else {
                    break;
                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }
////#3
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
//#4 не получилось записать строки с А и а
//        try (FileWriter fileWriter = new FileWriter("src\\com\\company\\oop_tasks\\file\\Text3.txt");
//             InputStream inStream = new FileInputStream("src\\com\\company\\oop_tasks\\file\\Text3.txt");
//
//             FileWriter fileWriter2 = new FileWriter("src\\com\\company\\oop_tasks\\file\\Text2.txt")) {
//            Scanner sc = new Scanner(System.in);
//            String str;
//
//            while (true) {
//                str = sc.nextLine();
//                if (!str.equals("")) {
//                    fileWriter.write(str + "\n");
//
//                    try (Scanner s = new Scanner(inStream).useDelimiter("\\A")){
//                        String result = s.hasNextLine() ? s.nextLine() : str+"\n";
//
//                            fileWriter2.write(result);
//
//                    }
//                } else {
//                    break;
//                }
//            }
//
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





