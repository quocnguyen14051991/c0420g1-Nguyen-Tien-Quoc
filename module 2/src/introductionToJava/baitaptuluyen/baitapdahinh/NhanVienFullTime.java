package introductionToJava.baitaptuluyen.baitapdahinh;

public class NhanVienFullTime extends NhanVien implements Config {
    private int ngayLamthem;
    private int loaiChucVu;

    public NhanVienFullTime(int ngayLamthem, int loaiChucVu) {
        this.ngayLamthem = ngayLamthem;
        this.loaiChucVu = loaiChucVu;
    }

    public NhanVienFullTime(String name, int ngayLamthem, int loaiChucVu) {
        super(name);
        this.ngayLamthem = ngayLamthem;
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    protected String loaiNhanVien() {
        if(loaiChucVu==Config.NHANVIENLINH
        ){
            return "linh full time"+(ngayLamthem>0?"(co ngay lam them":" ");
        }else {
            return "sep full time"+(ngayLamthem>0?"(co ngay lam them":" ");
        }
    }

    @Override
    public void tinhLuong() {
        if(loaiChucVu==Config.NHANVIENLINH){
            this.luong=Config.LUONGNHANVIENFULLTIMELINH+ngayLamthem*Config.LUONGNHANVIENLAMTHEMMOINGAY;
        }else {
            this.luong=Config.LUONGNHANVIENFULLTIMESEP+ngayLamthem*Config.LUONGNHANVIENLAMTHEMMOINGAY;
        }
    }
}
