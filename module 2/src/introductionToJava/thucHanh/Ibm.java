import java.util.Scanner;

public class Ibm     {
    public static float height,weight;
    public static double ibmCheck(float weightx,float heightx){
        double bmi;
        bmi = weightx / Math.pow(heightx, 2);
        return bmi;
    }
    public static void phanloai(double bmi){
        if (bmi < 18)
            System.out.printf("Underweight");
        else if (bmi < 25.0)
            System.out.printf("Normal");
        else if (bmi < 30.0)
            System.out.printf("Overweight");
        else
            System.out.printf("Obese");
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Height");
        height=scanner.nextFloat();
        System.out.println("Enter Weight");
        weight=scanner.nextFloat();
       double ibmman= ibmCheck(weight,height);
        System.out.println("Ibm here :"+ibmman);
        phanloai(ibmman);
    }
}
