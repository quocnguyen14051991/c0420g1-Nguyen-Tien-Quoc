package introductionToJava.baitaptuluyen.wrappervaautoboxing;

public class Wrapper {
    public static void main(String[] args) {
        int x=10;
        Integer y=new Integer(10);
        int z=x+y;//autoboxing ,cụ thể là unboxing ,tức là chuyển đổi từ Interger sang int
        System.out.println(y);
        System.out.println(z);
        //wraper class có tác dụng j có 2 cách để chuyển đổi kiểu String thành kiểu int
       int z1= Integer.valueOf("45");// tự động convert kiểu string thành kiểu int
        int z2=Integer.parseInt("50");
        System.out.println(z1);
        // ngoài ra wraper class dùng trong cấu trúc dữ liệu sau này sẻ đc học
        // tương tự có thẻ dùng long
        Long.valueOf("56");
        Boolean.valueOf("56");
        String xxx=String.valueOf(366);
        System.out.println(xxx);
        // ngoài ra
        Integer k=10;//boxing tự động chuyển int thành integer;
        // tương đương
        k=new Integer(10);
        int x1=10;
        int x2=10;
        Integer x3=10;
        System.out.println(x1==x2);// true
        System.out.println(x1==x3); // true
        Integer k1=new Integer(10);
        Integer k2=new Integer(10);

        System.out.println(k1==k2);// false do khác địa chỉ ô nhó trên heap
        int k3=10;
        System.out.println(k1.intValue());
        System.out.println(k1==k3);// true do java tự động unbox kiểu k1=int cho nên ra giá trị true
        // để so sánh    2 đối tượng wrapper trong java thì dùng hàm equals
        System.out.println(k1.equals(k2));
        String str1="hello";
        String str2="hello";
        System.out.println(str1.equals(str2));// gọi phương thức equals từ str1 kiểm tra giá trị str1== str2 return về true


    }
}
