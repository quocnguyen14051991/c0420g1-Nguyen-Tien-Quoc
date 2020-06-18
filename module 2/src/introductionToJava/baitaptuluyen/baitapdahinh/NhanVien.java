package introductionToJava.baitaptuluyen.baitapdahinh;

public class NhanVien {
    protected String name;
    protected long luong;

    public NhanVien() {
    }

    public NhanVien(String name) {
        this.name = name;
    }

    public NhanVien(String name, long luong) {
        this.name = name;
        this.luong = luong;
    }
    protected String loaiNhanVien(){
        return " ";
    }
    public void tinhLuong(){

    }
    public void xuatThongTin() {
        System.out.println("===== Nhân viên: " + this.name + " =====");
        System.out.println("- Loại nhân viên: " + this.loaiNhanVien());
        System.out.println("- Lương: " + this.luong + " VND");
    }
}
