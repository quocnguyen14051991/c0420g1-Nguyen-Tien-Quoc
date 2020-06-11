package introductionToJava.kethuabaitap;

import introductionToJava.accessmodifier.ThucHah.AccessModifier;

public class TestProtected extends AccessModifier {
    protected void smg(){
        System.out.println("Hi hi");
    }

    public static void main(String[] args) {
        TestProtected testProtected=new TestProtected();
        testProtected.msg();
    }
}
