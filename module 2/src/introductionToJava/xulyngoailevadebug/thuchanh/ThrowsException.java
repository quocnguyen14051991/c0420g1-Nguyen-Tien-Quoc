package introductionToJava.xulyngoailevadebug.thuchanh;

import java.io.FileOutputStream;
import java.io.IOException;

public class ThrowsException {
    public static void main(String[] args) throws IOException {
        try {
            ghiFile();
        }catch (IOException e){
            e.getMessage();
        }
        //Khi gọi phương thức ghiFile() phải xử lý exception
//        try {
//            ghiFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    public static void ghiFile() throws IOException{
        // ném ngoại lệ cho class khác xx lý
        FileOutputStream outputStream;
        outputStream =new FileOutputStream("");
        outputStream.write(65);
        outputStream.close();
    }
}
