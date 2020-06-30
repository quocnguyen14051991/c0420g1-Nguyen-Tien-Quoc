package introductionToJava.stringvaregex.baitap.validatesodienthoai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhone {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Input phone");
            String phone=sc.nextLine();
            //^[0-9]{10}$
            //^[0-9]{3}-[0-9]{3}-[0-9]{4}$
            //^[0-9]{3}.[0-9]{3}.[0-9]{4}$
            //^[0-9]{3}-[0-9]{3}-[0-9]{4} [e|ext][0-9]{4}$
            //(e|ext)hoặc e hoặc ext () 1 cụm
            // \\ cần phải có gì đó
            // ^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$
            //
            Pattern p =Pattern.compile("^\\([0-9]{2}\\)-\\([0-9]{10}\\)");
            if(p.matcher(phone).find()){
                System.out.println("phone is oke");
                break;
            }else {
                System.err.println("phone not ok");
            }
        }

    }
}
