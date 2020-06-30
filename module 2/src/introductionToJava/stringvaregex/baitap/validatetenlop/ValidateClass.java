package introductionToJava.stringvaregex.baitap.validatetenlop;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String P1="^[CAP]{1}[0-9]{4}[GHIKLM]$";
        String P2="^[^%^&#]*$";
        Pattern pattern=Pattern.compile(P1);
        Pattern pattern1=Pattern.compile(P2);
        while (true){
            System.out.println("Enter Name:");
            String name=scanner.nextLine();
            if(pattern.matcher(name).find()&&pattern1.matcher(name).find()){
                System.out.println("is ok");
                break;
            }else {
                System.out.println("is not ok");
            }
        }
    }
}
