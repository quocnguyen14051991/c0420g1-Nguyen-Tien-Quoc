package introductionToJava.baitaptuluyen.baitapdahinh.x;

public abstract class NhanVien {
    public static final int NHANVIENSEP=1;
    public static final int NHANVIENLINH=2;
    public static final long LUONGNHANVIENSEP=20000000;
    public static final long LUONGNHANVIENLINH=10000000;
    public static final long LUONGNHANVIENLAMTHEMMOINGAY=800000;
    public static final long  LUONGNHANVIENPARTIMEMOIGIO=100000;

   private String name;
   private long luong;

    public String getName() {
        return name;
    }

    public long getLuong() {
        return luong;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public NhanVien(String name, long luong) {
        this.name = name;
        this.luong = luong;
    }

    public NhanVien() {
    }
    public NhanVien(String name){
        this.name=name;
    }

    public abstract void tinhluong();
    public abstract String loainhanvien();
    public void xuatThongTin() {
        System.out.println("===== Nhân viên: " + this.name + " =====");
        System.out.println("- Loại nhân viên: " + this.loainhanvien());
        System.out.println("- Lương: " + this.getLuong()+ " VND");
    }

}
