package introductionToJava.iotextfile.thuchanh;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static String PATH="src/introductionToJava/abstractvainterface/a";

    public static void main(String[] args) {
       File dirx =new File(PATH);
       // tạo thư mục nếu đường dẫn ko tồn tại
       dirx.mkdir();
        File dir = new File(PATH,"txt12.txt");
        try {
            if(dir.createNewFile())
            {
                System.out.println("File is create");
            }else {
                System.out.println("file is alrealy exits");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(dir.isDirectory()){
            String[] dicContent=dir.list();
            for (int i = 0; i <dicContent.length ; i++) {
                System.out.println(dicContent[i]);
            }
        }
        System.out.println(dir.getName());
    }
}
