package introductionToJava.baitaptuluyentonghop.quanlyvattu;

public class VatTu {
    private int maVt;
    private String tenVt;
    private String dvt;
    private float soLuongTon;

    public VatTu() {
    }

    public VatTu(int maVt, String tenVt, String dvt, float soLuongTon) {
        this.maVt = maVt;
        this.tenVt = tenVt;
        this.dvt = dvt;
        this.soLuongTon = soLuongTon;
    }

    public int getMaVt() {
        return maVt;
    }

    public void setMaVt(int maVt) {
        this.maVt = maVt;
    }

    public String getTenVt() {
        return tenVt;
    }

    public void setTenVt(String tenVt) {
        this.tenVt = tenVt;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public float getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(float soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    @Override
    public String toString() {
        return "VatTu : " +"\n"+
                "maVt=" + maVt +
                ", tenVt='" + tenVt + '\'' +
                ", dvt='" + dvt + '\'' +
                ", soLuongTon=" + soLuongTon ;
    }
}
