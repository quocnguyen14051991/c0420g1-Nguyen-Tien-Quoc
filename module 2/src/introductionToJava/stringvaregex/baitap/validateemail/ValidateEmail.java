package introductionToJava.stringvaregex.baitap.validateemail;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        //. bất kỳ 1 ký tự  nào
        // * ít nhất là 0 lần(0 hoặc nhiều lần)
        //+ ít nhất 1 lần( 1 hoặc nhiều lần)
        //? xuất hiện 0 hoac 1 lan
        //"^.*[A-Z]+.*$" bắt đầu bằng 1 ký tự bất kỳ (có thể ko có ký tự nào) tiếp theo là ít nhất 1 ký tự viết hoa sau đó ký tự bất kỳ nào
       //"^.*[a-z]+.*$
        //"^.*[0-9]+.*$"
        //"^.*[%$^&*#$@!()]+.*$"
        //^[0-9a-zA-Z]{9,31}$
        //acc:
        //pass:// tách ra dễ hown
        //^[0-9a-zA-Z]{8,31}$
        //^[0-9a-zA-Z]*[0-9]+[0-9a-zA-Z]*
        //^[0-9a-zA-Z]*[a-z]+[0-9a-zA-Z]*]
        //chia cho 5.5 (hoặc)
        //^[0-9]+$
        //^[0-9]+.[05][0]*
        //Email:
        String Email="";

        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter Email");
            Email=scanner.nextLine();
            Pattern pattern =Pattern.compile("^[0-9]+.[05][0]*$");
            Pattern pattern1 =Pattern.compile("^[0-9]+$");
            if(pattern.matcher(Email).find()||pattern1.matcher(Email).find()){
                System.out.println("is ok");
                break;
            }else {
                System.err.println("is not ok");
            }

        }
    }
}
