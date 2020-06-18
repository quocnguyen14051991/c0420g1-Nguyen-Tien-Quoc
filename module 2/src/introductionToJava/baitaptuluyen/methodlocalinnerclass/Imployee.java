package introductionToJava.baitaptuluyen.methodlocalinnerclass;

public class Imployee {
    public void luong(){
        class Worker{
            private int name;
            public void luong(){
                System.out.println("luong cong nhan");
            }
        }
        Worker worker=new Worker();
        worker.luong();
    }

    public static void main(String[] args) {
        Imployee em=new Imployee();
        em.luong();
    }
}
