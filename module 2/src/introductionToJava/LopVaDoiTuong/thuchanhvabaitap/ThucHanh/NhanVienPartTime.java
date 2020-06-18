package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

import java.util.Scanner;

public class NhanVienPartTime extends NhanVien {

    private int gioLamViec;

    public NhanVienPartTime(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    protected String loaiNhanVien() {
        return "loai nhan viên thời vụ";

    }

    @Override
    public void tinhLuong() {
        luong=Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO*gioLamViec;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số lượng nhân viên: ");
        int tongNhanVien = Integer.parseInt(scanner.nextLine());

        // Khai báo mảng các nhân viên
        NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
        for (int i = 0; i < tongNhanVien; i++) {
            // Khai báo từng loại nhân viên, và kêu người dùng nhập thông tin nhân viên
            System.out.print("Tên nhân viên " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Là nhân viên (1-Toàn thời gian; 2-Bán thời gian): ");
            int laNhanVien = Integer.parseInt(scanner.nextLine());
            if (laNhanVien == 1) {
                // Nhân viên toàn thời gian
                System.out.print("Chức vụ nhân viên (1-Sếp; 2-Lính): ");
                int chucVu = Integer.parseInt(scanner.nextLine());
                System.out.print("Ngày làm thêm (nếu có): ");
                int ngayLamThem = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
            } else {
                System.out.print("Giờ làm: ");
                int gioLamViec = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienPartTime(ten, gioLamViec);
            }
        }

        System.out.println("\nKết quả tính lương\n");

        // Tính lương và xuất thông tin nhân viên
        for (NhanVien nhanVien : mangNhanVien) {
            nhanVien.tinhLuong();
            nhanVien.xuatThongTin();
        }
    }
    }

