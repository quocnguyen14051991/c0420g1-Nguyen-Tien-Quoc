package introductionToJava.Baitaptuluyen;

public class HinhTron implements HinhHoc {
    protected String ten;
    protected float bankinh;
    HinhTron(float bankinh){
        this.ten="hinhtron";
        this.bankinh=bankinh;
    }
    @Override
    public void nhapBanKinh(float bankinh) {
        this.bankinh=bankinh;
    }

    @Override
    public float tinhChuVi() {
        return 2 * PI * bankinh;
    }

    @Override
    public float tinhDienTich() {
        return PI * bankinh * bankinh;
    }

    @Override
    public void xuatThongTin() {
        System.out.println(ten);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());

    }

    public static void main(String[] args) {
//        HinhTron hinhTron =new HinhTron(10);
        HinhHoc hinhHoc =new HinhHoc() {
            @Override
            public void nhapBanKinh(float bankinh) {

            }

            @Override
            public float tinhChuVi() {
                return 0;
            }

            @Override
            public float tinhDienTich() {
                return 0;
            }

            @Override
            public void xuatThongTin() {

            }
        };

    }
}
