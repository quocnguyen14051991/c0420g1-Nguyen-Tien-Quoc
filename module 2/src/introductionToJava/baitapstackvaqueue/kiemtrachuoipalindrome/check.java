package introductionToJava.baitapstackvaqueue.kiemtrachuoipalindrome;

import java.util.*;

public class check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Text:");
        String inputText = input.nextLine();
        inputText = inputText.toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack= new Stack<Character>();
        for (int i = 0; i < inputText.length(); i++) {
            queue.add(inputText.charAt(i));
        }
        String str = "";
        while(!queue.isEmpty()) {
            str = queue.remove()+str;
        }
        if (str.equals(inputText)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
