package introductionToJava.xulyngoailevadebug.thuchanh.classtudinhnghiaexception;

public class Test {
    public static void main(String[] args) throws CustomException {
   testException("null not");
    }
    private static void testException(String text) throws CustomException{
        if(text==null){
            throw new CustomException("Test null rồi");
        }
        else {
            System.out.println("Text"+text);
        }
    }
}
