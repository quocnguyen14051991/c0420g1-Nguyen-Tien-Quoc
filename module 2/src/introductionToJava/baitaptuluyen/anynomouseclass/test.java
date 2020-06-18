package introductionToJava.baitaptuluyen.anynomouseclass;

public class test {
    public static void main(String[] args) {
  Age age=new Age() {
      @Override
      public void getAge() {
          System.out.println("cc");
      }
  }; // tạo subclass cho interface hoặc astract class
        // subclass là 1 class implement interface và khơi tạo class đó cùng 1 lúc
age.getAge();
    }
}
