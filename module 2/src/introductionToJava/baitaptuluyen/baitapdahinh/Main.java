package introductionToJava.baitaptuluyen.baitapdahinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so luong nhan vien");
        int tongNhanVien = Integer.parseInt(input.nextLine());
        NhanVien[] nhanVien = new NhanVien[tongNhanVien];
        for (int i = 0; i < nhanVien.length; i++) {
            System.out.println("ten nhan vien" + (i + 1) + " :");
            String ten = input.nextLine();
            System.out.print("Là nhân viên (1-Toàn thời gian; 2-Bán thời gian): ");
            int laNhanVien = Integer.parseInt(input.nextLine());
            if (laNhanVien == 1) {
                // nhan vien fulltime
                System.out.println("nhap chuc vu (1-sep /2 linh");
                int chucVu = Integer.parseInt(input.nextLine());
                System.out.print("Ngày làm thêm (nếu có): ");
                int ngayLamThem = Integer.parseInt(input.nextLine());
                nhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);

            } else {
                System.out.println("gio lam");
                int gioLamViec = Integer.parseInt(input.nextLine());
                nhanVien[i] = new NhanVienPartTime(ten, gioLamViec);
            }
        }
        System.out.println("\nKết quả tính lương\n");
        for (NhanVien nhanvien1 : nhanVien
        ) {
            if (nhanvien1 instanceof NhanVienPartTime) {
                nhanvien1.tinhLuong();
                nhanvien1.xuatThongTin();
            } else if (nhanvien1 instanceof NhanVienFullTime) {
                nhanvien1.tinhLuong();
                nhanvien1.xuatThongTin();
            }
        }
    }
}
