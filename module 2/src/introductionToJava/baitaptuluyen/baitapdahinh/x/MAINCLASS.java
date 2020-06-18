package introductionToJava.baitaptuluyen.baitapdahinh.x;

import java.util.Scanner;

public class MAINCLASS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhap tong so luong nhan vien");
        int tongSoNhanVien=Integer.parseInt(input.nextLine());
        NhanVien[] nhanViens=new NhanVien[tongSoNhanVien];
        for (int i = 0; i <nhanViens.length ; i++) {
            System.out.println("nhap ten nhan vien"+(i+1));
            String name=input.nextLine();
            System.out.print("Loai nhân viên (1-Toàn thời gian; 2-Bán thời gian): ");
            int loaiNhanVien=Integer.parseInt(input.nextLine());
            if(loaiNhanVien==1){
                System.out.println("nhap chuc vu (1 sep/2 linh");
                int chucvu=Integer.parseInt(input.nextLine());
                System.out.println("ngay lam them neu co");
                int ngaylamthem=Integer.parseInt(input.nextLine());
                nhanViens[i]=new NhanVienFullTime(name,chucvu,ngaylamthem);
            }else {
                System.out.println("so gio lam viec");
                int sogiolamviec=Integer.parseInt(input.nextLine());
                nhanViens[i]=new NhanVienPartTime(name,sogiolamviec);
            }

        }
        for (NhanVien nhanvien1:nhanViens
             ) {
            if(nhanvien1 instanceof NhanVienFullTime){
                nhanvien1.tinhluong();
                nhanvien1.xuatThongTin();
            }else {
                nhanvien1.tinhluong();
                nhanvien1.xuatThongTin();
            }
        }
    }
}
