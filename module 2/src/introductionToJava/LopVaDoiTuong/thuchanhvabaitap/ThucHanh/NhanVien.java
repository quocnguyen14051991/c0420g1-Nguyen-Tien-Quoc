package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

public class NhanVien {
    protected String ten;
    protected long luong;
    public NhanVien(){

    }
    public NhanVien(String ten){
        this.ten=ten;
    }
    protected String loaiNhanVien(){
        return "";
//        lớp con override lại pt này
    }
    public void tinhLuong(){
        //        lớp con override lại pt này để thể hiện đa hìh

    }
    public void xuatThongTin() {
        System.out.println("===== Nhân viên: " + this.ten + " =====");
        System.out.println("- Loại nhân viên: " + this.loaiNhanVien());
        System.out.println("- Lương: " + this.luong + " VND");
    }
}
