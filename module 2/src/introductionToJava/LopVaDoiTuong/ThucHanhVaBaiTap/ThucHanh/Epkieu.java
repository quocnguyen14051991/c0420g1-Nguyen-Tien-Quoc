package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.ThucHanh;

public class Epkieu {
    public static void main(String[] args) {
        // chuyển double sang int
        int value=(int) 32.89;
        System.out.println(""+value);
        int b=(int) Math.round(6.79);
        System.out.println(+b);
        Double valuex=7.99;
        int i=valuex.intValue();
        System.out.println(+i);
    }
}
