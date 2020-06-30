package introductionToJava.iotextfile.baitap;

import java.io.*;

public class Copy_File  {
    public static final String PATH="src/A/txt12.txt";
    public static final String PATH1="src/A/txt1.txt";
    public static void main(String[] args)  {
        InputStream inputStream =null;
        OutputStream outputStream =null;
        try {
            inputStream=new FileInputStream(PATH);
            outputStream=new FileOutputStream(PATH1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int ch;
        while (true){
            try {
                if ((ch=inputStream.read())==-1) break;
                System.out.print((char)ch);
                outputStream.write(ch);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        try {
//            inputStream=new FileInputStream(PATH) ;
//            outputStream=new FileOutputStream(PATH1);
//            int lenght;
//            byte[] buffer=new byte[1024];
//            while ((lenght=inputStream.read(buffer))>0){
//                outputStream.write(buffer,0,lenght);
//            }
//            System.out.println("Copy done");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            inputStream.close();
//            outputStream.close();
//        }

    }

}
