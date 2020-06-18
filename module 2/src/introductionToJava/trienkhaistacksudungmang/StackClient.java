package introductionToJava.trienkhaistacksudungmang;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack =new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.show();
        System.out.println("1.Size of stack affter push operations="+stack.size());
        System.out.println("2.pop element from stack :");
        while (!stack.isEmpty()){
            System.out.printf("%d",stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
        stack.show();
    }
}
