package introductionToJava.baitaptuluyentonghop.quanlyvattu;

public class HoaDon<E> {
    private String soHoaDon;
    private String ngayLapHoaDon;
    private char loai;//x xuat , N:nhập
    // danh sách chi tiết hóa đơn
    // pointer con trỏ liên kết đến nút
    DanhSachChiTietHoaDon<E> danhSachChiTietHoaDon;
    HoaDon next;

    public HoaDon(String soHoaDon, String ngayLapHoaDon, char loai) {
        this.soHoaDon = soHoaDon;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.loai = loai;
        this.next=null;
    }

    public HoaDon() {
    }
}
