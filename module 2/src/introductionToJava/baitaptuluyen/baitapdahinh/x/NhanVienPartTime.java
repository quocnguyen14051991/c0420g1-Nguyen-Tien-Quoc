package introductionToJava.baitaptuluyen.baitapdahinh.x;

public class NhanVienPartTime extends NhanVien {
    int sogiolamviec;

    public NhanVienPartTime(String name, int sogiolamviec) {
        super(name);
        this.sogiolamviec = sogiolamviec;
    }

    @Override
    public void tinhluong() {
        long luong=sogiolamviec*NhanVien.LUONGNHANVIENPARTIMEMOIGIO;
        this.setLuong(luong);
    }

    @Override
    public String loainhanvien() {
        return "NHAN VIEN PART TIME";
    }
}
