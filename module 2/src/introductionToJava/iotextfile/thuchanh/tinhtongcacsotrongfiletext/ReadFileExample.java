package introductionToJava.iotextfile.thuchanh.tinhtongcacsotrongfiletext;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
public void readFileText(String filePath){
    try {
        File file =new File(filePath);
        if(!file.exists()){
            throw new FileNotFoundException("Not Found File");
        }
        BufferedReader bufferedReader =new BufferedReader(new FileReader(file));
        String line="";
        int sum=0;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
            sum+=Integer.parseInt(line);
        }
        bufferedReader.close();
        System.out.println("sum"+sum);
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    } catch (IOException e) {
        e.printStackTrace();
    }catch (Exception e){
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn:");
        Scanner scanner=new Scanner(System.in);
        String Path=scanner.nextLine();
        ReadFileExample readFileExample =new ReadFileExample();
        readFileExample.readFileText(Path);
    }
}
