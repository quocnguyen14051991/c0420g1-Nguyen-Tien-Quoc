package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

public class NhanVienFullTime extends NhanVien{
    private int ngayLamThem;//ngày làm thêm của nhân viên
    private int loaiChucVu;// chức vụ là lính hay sếp

    public NhanVienFullTime(int ngayLamThem, int loaiChucVu) {
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        if(loaiChucVu==Configs.NHAN_VIEN_LINH){
            return "lính toàn thời gian"+(ngayLamThem>0?"có ngày làm thêm":""+this.ngayLamThem);
        }else {
            return "Sếp toàn thời gian"+(ngayLamThem>0?"có ngày làm thêm":""+this.ngayLamThem);
        }
    }

    @Override
    public void tinhLuong() {
        if(loaiChucVu==Configs.NHAN_VIEN_LINH){
            luong=Configs.LUONG_NHAN_VIEN_FULLTIME_LINH+ngayLamThem*Configs.LUONG_LAM_THEM_MOI_NGAY;
        }else if(loaiChucVu==Configs.NHAN_VIEN_SEP){
            luong=Configs.LUONG_NHAN_VIEN_FULLTIME_SEP+ngayLamThem*Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
