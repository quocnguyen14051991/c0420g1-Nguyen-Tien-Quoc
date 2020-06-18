package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    double width,height;
    public LopHinhChuNhat() {

    }
    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return (this.height + this.width) * 2;
    }
    public double getPerimeter(){
        return  (this.width+this.height)*2;
    }
    public String display(){
        return "Hình Chử Nhật có Width"+this.width+"Độ cao"+this.height;
    }

    @Override
    public String toString() {
        return "Width"+this.width+"Height"+this.height;
    }

    public static void main(String[] args) {
        double width,height;
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter width:");
        width=input.nextDouble();
        System.out.printf("Enter height:");
        height=input.nextDouble();
        LopHinhChuNhat lopHinhChuNhat=new LopHinhChuNhat(width,height);
        double S=lopHinhChuNhat.getArea();
        double p=lopHinhChuNhat.getPerimeter();
        String show=lopHinhChuNhat.display();
        System.out.printf("Dien Tich"+S+"\n");
        System.out.printf("Chu vi"+p+"\n");
        System.out.printf(lopHinhChuNhat.toString());


    }


}

