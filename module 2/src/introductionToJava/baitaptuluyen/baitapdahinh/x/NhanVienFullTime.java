package introductionToJava.baitaptuluyen.baitapdahinh.x;

public class NhanVienFullTime extends NhanVien {
    int chucVu;
    int ngayLamThem;

    public NhanVienFullTime(String name, int chucVu, int ngayLamThem) {
        super(name);
        this.chucVu = chucVu;
        this.ngayLamThem = ngayLamThem;
    }



    @Override
    public void tinhluong() {
        if(chucVu==NhanVien.NHANVIENSEP){
            long luong=NhanVien.LUONGNHANVIENSEP+ngayLamThem*NhanVien.LUONGNHANVIENLAMTHEMMOINGAY;
            this.setLuong(luong);
        }else {
            long luong=NhanVien.LUONGNHANVIENLINH+ngayLamThem*NhanVien.LUONGNHANVIENLAMTHEMMOINGAY;
            this.setLuong(luong);
        }
    }

    @Override
    public String loainhanvien() {
       if(NhanVien.NHANVIENSEP==1){
           return "sep full time"+" "+(ngayLamThem>0?"co ngay lam them:"+" " +this.ngayLamThem:"0 co ngay lam them ");
       }else {
           return "linh full time"+" "+(ngayLamThem>0?"co ngy lam them:"+" "+this.ngayLamThem:"0 co ngay lam them");
       }
    }
}
