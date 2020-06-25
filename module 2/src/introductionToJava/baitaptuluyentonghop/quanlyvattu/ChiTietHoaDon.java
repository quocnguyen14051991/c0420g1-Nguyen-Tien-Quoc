package introductionToJava.baitaptuluyentonghop.quanlyvattu;

public class ChiTietHoaDon {
    private String maVt;
    private float soLuong;
    private int donGia;
    private float vat;//% thuế
    private boolean trangThai;// 1 khách mua 2 khách trả

    public ChiTietHoaDon(String maVt, float soLuong, int donGia, float vat, boolean trangThai) {
        this.maVt = maVt;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.vat = vat;
        this.trangThai = trangThai;
    }

    public ChiTietHoaDon() {
    }

    public String getMaVt() {
        return maVt;
    }

    public void setMaVt(String maVt) {
        this.maVt = maVt;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
