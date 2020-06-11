package introductionToJava.thucHanh;
import java.util.Scanner;
public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        boolean check=false;
        String[] students={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input=new Scanner(System.in);
        System.out.printf("Nhap ten ban muon tim kiem \n");
        String input_name=input.nextLine();
        for (int i = 0; i <students.length ; i++) {
            if(students[i].equals(input_name)){
                System.out.printf("positon of the student in the list "+input_name+"is"+i);
                check=true;
                break;
            }
            }
        if(check==false){
            System.out.printf("not foun"+" "+input_name+" "+"in the list");
        }
    }
}
