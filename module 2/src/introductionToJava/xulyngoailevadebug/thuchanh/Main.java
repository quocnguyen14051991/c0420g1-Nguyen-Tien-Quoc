package introductionToJava.xulyngoailevadebug.thuchanh;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static int nhapTuoiNhanVien() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int tuoi = scanner.nextInt();
        if (tuoi < 0) throw new IOException("tuổi không được nhỏ hơn 0.");
        return tuoi;
    }

    public static void main(String[] args) {
       try {
           int tuoi=nhapTuoiNhanVien();
           System.out.println("tuoi da nhap"+tuoi);
       }catch (IOException e){
           System.out.println("tuooir nhap vao"+e.getMessage());
       }
    }
}
