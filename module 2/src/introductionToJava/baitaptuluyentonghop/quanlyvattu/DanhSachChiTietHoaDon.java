package introductionToJava.baitaptuluyentonghop.quanlyvattu;

import java.util.List;

public class DanhSachChiTietHoaDon<E> {
List<E> listChiTietHoaDon;

    public DanhSachChiTietHoaDon() {
    }

    public DanhSachChiTietHoaDon(List<E> listChiTietHoaDon) {
        this.listChiTietHoaDon = listChiTietHoaDon;
    }
}
