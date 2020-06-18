package introductionToJava.baitaptuluyen.outerclass;

public class Code {
 sub sub1=new sub();
 public void show(){
     sub1.show();
 }
    public static void main(String[] args) {
        Code code=new Code();
        code.show();
    }
}
//outer class khai baos ben canh public class
// trong moi class phai co duy nhat 1 public class
 class sub{
public void show(){
    System.out.println("helo java");
}
}
