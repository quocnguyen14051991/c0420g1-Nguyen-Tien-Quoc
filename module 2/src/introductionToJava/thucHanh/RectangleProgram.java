package introductionToJava.thucHanh;

import java.util.Scanner;

public class RectangleProgram {

    public static void main(String[] args) {
       float width;
        float height;
      float erea;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width:"+"\n");
        width=scanner.nextFloat();
        System.out.println("Enter Height:" +"\n");
        height=scanner.nextFloat();
        erea=width*height;
        System.out.println("This is Erea ="+erea);



    }
}
