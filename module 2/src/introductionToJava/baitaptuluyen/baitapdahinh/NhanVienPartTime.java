package introductionToJava.baitaptuluyen.baitapdahinh;

public class NhanVienPartTime extends NhanVien implements Config{
    private int gioLamViec;

    public NhanVienPartTime(String name,int gioLamViec) {
        this.name=name;
        this.gioLamViec = gioLamViec;
    }

    @Override
    protected String loaiNhanVien() {
        return "Nhan vien partime";
    }

    @Override
    public void tinhLuong() {
       this.luong=gioLamViec*Config.LUONGNHANVIENPARTIMEMOIGIO;
    }

}
