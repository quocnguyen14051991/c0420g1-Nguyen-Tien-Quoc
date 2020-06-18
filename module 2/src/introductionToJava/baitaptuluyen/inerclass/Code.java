package introductionToJava.baitaptuluyen.inerclass;

public  class Code {
    public static class innerClass {
        private int age;
        public void show() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Code.innerClass innerClass=new Code.innerClass();
//        innerClass innerClass = new innerClass();
        innerClass.show();
        KeThua keThua = new KeThua();
        keThua.show();
    }
}

