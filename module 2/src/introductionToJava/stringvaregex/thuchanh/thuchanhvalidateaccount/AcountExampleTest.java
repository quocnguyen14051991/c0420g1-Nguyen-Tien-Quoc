package introductionToJava.stringvaregex.thuchanh.thuchanhvalidateaccount;

public class AcountExampleTest {
    private static  AcountExample acountExample;
    public static final String[] validAccount=new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAcount=new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        acountExample =new AcountExample();
        for (String account:validAccount) {
            boolean isvalid=acountExample.validate(account);
            System.out.println("Account is"+account+"is valid:"+isvalid);
        }
        for (String account:invalidAcount) {
            boolean isvalid =acountExample.validate(account);
            System.out.println("Account is"+account+"is valid:"+isvalid);
        }
    }
}
