package introductionToJava.baiTap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static boolean check(int n){
        int uoc=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                uoc++;
            }
        }
        if(uoc==2){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.printf("Các Sô nguyên tố nhỏ hơn 100 là \n");
        for (int i = 2; i <100 ; i++) {
            if(check(i)){
                System.out.println(" "+i);
            }
        }
    }
}
