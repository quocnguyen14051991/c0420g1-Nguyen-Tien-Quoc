package introductionToJava.baitaptuluyen.taomotexceptiontheoymuon;

public class Test {
    public static void chia2so(int a,int b) throws MyException {
        try {
            int c=a/b;
            System.out.println("ket qua"+c);
        }catch (Exception e){
            throw new MyException("loi chia cho 0");
        }
    }
    public static void main(String[] args) throws MyException {
      chia2so(3,0);

    }
}
