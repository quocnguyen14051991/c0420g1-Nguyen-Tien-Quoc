package introductionToJava.baitapstackvaqueue.kiemtradaungoactrongbieuthucsudungstack;

import java.util.Scanner;
import java.util.Stack;

public class Stackx {
    public static void main(String[] args) {
            System.out.print("nhap chuoi");
            Scanner input = new Scanner(System.in);
            String inputEx= input.nextLine();
            Stack stack = new Stack<>();// khoi tao stack
            for (int i = 0; i < inputEx.length(); i++) {
                stack.push(inputEx.charAt(i));
            }
            int count = 0;
            String check;
            while (!stack.isEmpty()) {
                check = stack.lastElement().toString();
                if (check.equals("(")) {
                    count--;
                } else if (check.equals(")")) {
                    count++;
                }
                if (count<0) { break;}
                stack.pop();
            }
            System.out.println("Your Expression is "+(count==0));
        }
    }

