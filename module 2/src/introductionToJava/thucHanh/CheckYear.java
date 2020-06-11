package introductionToJava.thucHanh;

import java.util.Scanner;

public class CheckYear {
    private static int year,month,day,ngay;
    public static boolean Checkis(int year){
        boolean check;
        if((year%4==0&&year%100!=0)||year%400==0){
            check=true;
        }
        else{
            check=false;
        }
        return check;
       }

    public static int CheckDay(int month,int year){
        int dayinmonth=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                dayinmonth=31;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:{
                dayinmonth=30;
                break;
            }
            case 2:{
                if(Checkis(year)){
                    dayinmonth=29;
                }else {
                    dayinmonth=28;
                }
                break;
            }
        }
        return dayinmonth;
    }
    public static void main(String[] args) {
        boolean check=false;
        System.out.println("Tinh so ngay trong thang");
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("Enter Year");
            year=scanner.nextInt();
            if(year<1900||year>4000){
                System.out.println("Nhap nam trong khoang >1900 va nho <4000");
                continue;
            }
            check=true;
        }while (!check);
        check=false;
        do{

            System.out.println("Enter Month");
            month=scanner.nextInt();
            if(month>13||month<1){
                System.out.println("Thang nam trong khoang 1-12");
                continue;
            }
            check=true;

        }while (!check);
        check=false;
        do {
            System.out.println("Enter Day");
            day=scanner.nextInt();
            if(day>31||day<1){
                System.out.println("Day <31 and > 1");
                continue;
            }
            check=true;
        }while (!check);
         ngay= CheckDay(month,year);
        System.out.println("Ngay Trong Thang"+ngay);
    }
}
