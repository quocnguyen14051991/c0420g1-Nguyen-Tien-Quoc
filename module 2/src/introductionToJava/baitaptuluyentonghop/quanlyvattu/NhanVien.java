package introductionToJava.baitaptuluyentonghop.quanlyvattu;

public class NhanVien {
    private int maNv;
    private String ho;
    private String ten;
    private String phai;
    NhanVien left;
    NhanVien right;

    public NhanVien() {
    }

    public NhanVien(int maNv, String ho, String ten, String phai) {
        this.maNv = maNv;
        this.ho = ho;
        this.ten = ten;
        this.phai = phai;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    @Override
    public String toString() {
        return "NhanVien" +
                " " +
                "maNv='" + maNv + '\'' +
                ", ho='" + ho + '\'' +
                ", ten='" + ten + '\'' +
                ", phai='" + phai + '\'' ;
    }
}
