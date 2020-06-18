package introductionToJava.baitapstackvaqueue.chuyendoithapphansangnhiphan;

import java.util.Scanner;

public class MyStack<E> {
    public static final int INITIAL_SIZE=16;
    private E[] elements;
    private int size=0;
    public MyStack(){
        elements= (E[]) new Object[INITIAL_SIZE];
    }
    public void ensureCapacity(){
        if(size>=elements.length){
            E[] newElements=(E[]) new Object[elements.length*2+1];
            System.arraycopy(elements,0,newElements,0,size);
            elements=newElements;
        }
    }
    public void push(E e){
        ensureCapacity();
        elements[size++]=e;
    }
    public E pop(){
        if(size==0){
            throw new IndexOutOfBoundsException("stack is empty");
        }
        E e=elements[size-1];
        elements[size-1]=null;
        size--;
        return e;
    }
    public boolean isEmpy(){
        if(size==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
     MyStack<Integer> stack= new MyStack<>();
        System.out.println("nhap vao 1 so thap phan");
        n=input.nextInt();
        while (n>0){
            int bynary= (int) (n % 2);
            n /= 2;
            stack.push((int) bynary);
        }
//        1/2=0
        while (!stack.isEmpy()){
            System.out.print(stack.pop());
        }
    }
}
