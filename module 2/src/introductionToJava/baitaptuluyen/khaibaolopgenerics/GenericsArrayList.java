package introductionToJava.baitaptuluyen.khaibaolopgenerics;

public class GenericsArrayList<T> {
    private static final int INITIAL_SIZE=16;
    private T[] elements;
    private int size=0;
    public GenericsArrayList(){
        this.elements= (T[]) new Object[INITIAL_SIZE];
    }
    public void EnsureCapcity(){
        if(size>=elements.length){
            T[] newArr= (T[]) new Object[INITIAL_SIZE*2+1];
            System.arraycopy(elements,0,newArr,0,size);
            elements=newArr;
        }
    }
    public void add(T e){
        this.EnsureCapcity();
        this.elements[size++]=e;
    }
}
