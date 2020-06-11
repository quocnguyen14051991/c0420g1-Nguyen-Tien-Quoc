package introductionToJava.baiTap;
import java.util.Scanner;
public class HienThiCacLoaiHinh {
    public void print_rectangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf(" " + "*");
            }
            System.out.printf("\n");
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("\n");
        }
    }

    public void print_Square_Triangle_Botton_Left(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" " + "*");
            }
            System.out.printf("\n");
        }
        for (int i = 0; i <2; i++) {
            System.out.printf("\n");
        }
    }

    public void print_Square_Triangle_Top_Left(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.printf(" " +"*");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    public void print_tamgiaccan(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j >= n + 1) {
                    System.out.printf(" " + "*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    public void menu() {
        System.out.printf("\t\t\t\t\t\tMenu \n");
        System.out.printf("1.In Hình Vuông   \n");
        System.out.printf("2.In Tam Giác Vuông\n");
        System.out.printf("3.In Tam Giác Vuông \n");
        System.out.printf("4.In Tam Giác Cân \n");
        System.out.printf("5.Exit \n");
    }

    public static void main(String[] args) {
        int n, choose;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter n=");
        n = input.nextInt();
        HienThiCacLoaiHinh show = new HienThiCacLoaiHinh();
        show.menu();
        while (true) {
            System.out.printf("Choose Chức Năng : \n ");
            choose = input.nextInt();
            switch (choose) {
                case 1: {
                    show.print_rectangle(n);
                    show.menu();
                    break;
                }
                case 2: {
                    show.print_Square_Triangle_Botton_Left(n);
                    show.menu();
                    break;
                }
                case 3: {
                    show.print_Square_Triangle_Top_Left(n);
                    show.menu();
                    break;
                }
                case 4: {
                    show.print_tamgiaccan(n);
                    show.menu();
                    break;
                }
                case 5:{
                    System.exit(0);
                }
                default: {
                    System.out.printf("Không Có Chức Năng Này \n");
                    break;
                }
            }
        }
    }
}
