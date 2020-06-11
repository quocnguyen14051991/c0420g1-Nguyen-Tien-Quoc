package introductionToJava.baiTap;

import java.util.Scanner;

public class DocChuThanhSo {
    public void docso(int num){
        int dv=num%10;
        num=num/10;
        int chuc=num%10;
        int tram=num/10;
        switch (tram){
            case 1:{
                System.out.printf("One ");
                break;
            }
            case 2:{
                System.out.printf("Two ");
                break;
            }
            case 3:{
                System.out.printf("Three ");
                break;
            }
            case 4:{
                System.out.printf("Four ");
                break;
            }
            case 5:{
                System.out.printf("Five ");
                break;
            }
            case 6:{
                System.out.printf("Six ");
                break;
            }
            case 7:{
                System.out.printf("Seven ");
                break;
            }
            case 8:{
                System.out.printf("Eight ");
                break;
            }
            case 9:{
                System.out.printf("Night ");
            }
        }
        System.out.printf("Hundress and");
        switch (chuc){
            case 1:{
                switch (dv){
                    case 0:{
                        System.out.printf("Ten");
                        break;
                    }
                    case 1:{
                        System.out.printf("Eleven");
                        break;
                    }
                    case 2:{
                        System.out.printf("Twelve");
                        break;
                    }
                    case 3:{
                        System.out.printf("Thirteen");
                        break;
                    }
                    case 4:{
                        System.out.printf("Fourteen");
                        break;
                    }
                    case 5:{
                        System.out.printf("Fifteen");
                        break;
                    }
                    case 6:{
                        System.out.printf("Sixteen");
                        break;
                    }
                    case 7:{
                        System.out.printf("Seventeen");
                        break;
                    }
                    case 8:{
                        System.out.printf("Eighteen");
                        break;
                    }
                    case 9:{
                        System.out.printf("Nighteen");
                        break;
                    }
                }
                break;
            }
            case 2:{
                System.out.printf(" "+"Twenty");
                break;
            }
            case 3:{
                System.out.printf(" "+"Thirty");
                break;
            }
            case 4:{
                System.out.printf(" "+"Fourty");
                break;
            }
            case 5:{
                System.out.printf(" "+"Fifty");
                break;
            }
            case 6:{
                System.out.printf(" "+"Sixty");
                break;
            }
            case 7:{
                System.out.printf(" "+"Seventy");
                break;
            }
            case 8:{
                System.out.printf(" "+"Eighty");
                break;
            }
            case 9:{
                System.out.printf(" "+"Nighty");
                break;
            }
        }
        switch (dv){
            case 1:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"One");
                }
                break;
            }
            case 2:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"Two");
                }
                break;
            }
            case 3:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"Three");
                }
                break;
            }
            case 4:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"Four");
                }
                break;
            }
            case 5:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"Five");
                }
                break;
            }
            case 6:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"Six");
                }
                break;
            }
            case 7:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"Seven");
                }
                break;
            }
            case 8:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"Eight");
                }
                break;
            }
            case 9:{
                if(chuc==1){
                    System.out.printf("");
                }else {
                    System.out.printf(" "+"Night");
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        int so;
        boolean check=false;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("nhap n");
            so=scanner.nextInt();
            if(so>999||so<100)
            {
                System.out.printf("So ban nhap ko dung 3 chu so");
                continue;
            }
            check=true;
        }while (!check);
        DocChuThanhSo docChuThanhSo= new DocChuThanhSo();
        docChuThanhSo.docso(so);
    }
}
