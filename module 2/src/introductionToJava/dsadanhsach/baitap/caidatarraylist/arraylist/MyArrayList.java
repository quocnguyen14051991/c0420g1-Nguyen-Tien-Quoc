package introductionToJava.dsadanhsach.baitap.caidatarraylist.arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * property size chi ra so luong phan tu trong arraylist
     */
    private int size=0;
    public static final int DEFAULT_CAPACITY=10;
    /**
     * khai bao mang chua doi tuong.use chua cac phan tu
     */
    Object elements[];

    public MyArrayList() {
        elements=new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity){
        if(capacity>=0){
            elements=new Object[capacity];
        }
        else {
            throw  new IllegalArgumentException("capacitys"+capacity);
        }
    }

    /**
     * phuong thuc tra ve so luong phan tu
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * phuong thuc clear arraylist
     */
    public void clear(){
        size=0;
        for (int i = 0; i <elements.length ; i++) {
            elements[i]=null;
        }

    }

    /** phuong thuc add 1 phan tu vao myarraylist
     *
     * @param element
     * @return
     */
    public boolean add(E element){
        if(elements.length==size)
        {
            this.ensureCapacity(5);
        }
        elements[size]=element;
        size++;
        return true;
    }

    /** phuong thuc tang kich thuoc cua mang
     *
     * @param minCapacity
     */
    private void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSize=this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("minCapacity"+minCapacity);
        }

    }

    /** them vao arraylist tai 1 vi tri
     *
     * @param element
     * @param index
     */
    public void add(E element,int index){
        if(index>elements.length){
            throw new IllegalArgumentException("index"+index);
        }else if(elements.length==size){
            this.ensureCapacity(5);
        }

        if(elements[index]==null){
            elements[index]=element;
            size++;
        }else {
            for (int i = size+1; i >=index ; i--) {
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }
    /**
     phuong thuc lay element

     */
    public E get(int index){
        return (E) elements[index];
    }

    /** phuong thuc indexof tra ve vi tri cua element trong mang
     *
     * @param element
     * @return
     */
    public int indexOf(E element){
        int index=-1;
        for (int i = 0; i <size ; i++) {
            if(this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    /** kiem tra phan tu co ton tai trong mang hay ko
     *
     * @param element
     * @return
     */
    public boolean contains(E element){
        return this.indexOf(element)>=0;
    }
    /**phuong thuc tao ra 1 ban sao cua myarraylist

     */
    public MyArrayList<E> clone(){
        MyArrayList<E> v=new MyArrayList<>();
        v.elements=Arrays.copyOf(this.elements,this.size);
        v.size=this.size;
        return v;
    }
    public E remove(int index){
        if(index<0||index>elements.length){
            throw new IllegalArgumentException("index"+index);
        }
        E element= (E) elements[index];
        for (int i = index; i <size-1 ; i++) {
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }


}

