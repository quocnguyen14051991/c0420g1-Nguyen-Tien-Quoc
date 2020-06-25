package introductionToJava.baitaptuluyentonghop.quanlyvattu;

import introductionToJava.baitaptuluyen.codeinterfacevaabstracclass.Interface2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("==============Quan ly Vat Tu============");
        System.out.println("1.===Thêm Vật Tư===");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int choose;
        List<VatTu> listVt = new ArrayList<>();
        DanhSachVatTu<VatTu> danhSachVatTu = new DanhSachVatTu(listVt);
        menu();
        while (!check) {
            System.out.println("Chọn Chức năng");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1: {
                    System.out.println("nhập mã vật tư:");
                    int mavt = Integer.parseInt(input.nextLine());
                    System.out.println("nhập tên vật tư");
                    String tenvt = input.nextLine();
                    System.out.println("nhập đơn vị tính");
                    String donvitinh = input.nextLine();
                    System.out.println("số lượng tồn");
                    float slton = Float.parseFloat(input.nextLine());
                    danhSachVatTu.addNew(new VatTu(mavt, tenvt, donvitinh, slton));
                    break;
                }
                case 2:{
                    System.out.println("Thông tin hóa đơn");
                    danhSachVatTu.show();
                    break;
                }
            }
        }

    }
}
