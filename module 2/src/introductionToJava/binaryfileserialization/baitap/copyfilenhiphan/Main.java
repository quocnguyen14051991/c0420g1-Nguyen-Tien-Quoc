package introductionToJava.binaryfileserialization.baitap.copyfilenhiphan;

import introductionToJava.baitaptuluyen.trycatchbatloiexception.Sub;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Soucre File");
        String sourcePath=scanner.nextLine();
        System.out.println("Enter Destination file:");
        String destFile=scanner.nextLine();
        File path1=new File(sourcePath);
        File path2=new File(destFile);
        copyFile(path1,path2);
        System.out.println("copy done");
    }

    public static void copyFile(File sourceFile, File destFile)  {
        int size=0;
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(destFile);
            byte[] data = new byte[1024];
            int lenght=is.read(data);
            System.out.println("Number Byte:"+lenght);
            String result=new String(data,0,lenght);
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           if(os!=null){
               try {
                   os.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }

//        while (true) {
//            c = is.read(buffer);
//            if (c == -1) {
//                break;
//            }
//            System.out.println("Number byte Copy:"+c);
//            os.write(buffer,0,c);
//        }
    }
}
