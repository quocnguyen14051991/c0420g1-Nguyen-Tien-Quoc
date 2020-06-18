package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

public class Count extends Animal {
    static int  count=0;
    int id;
    public int getId(){
        return this.id;
    }
    Count(int id){
        this.id=id;
//        count++;
//        System.out.println(count);
    }
    public static void xxx(Count count1){
        count++;
       int dem= count1.getId();
        System.out.println(count);
        System.out.println(dem);
    }

    public static void main(String[] args) {
        Count count=new Count(3);
        count.xxx(count);
        Count count1=new Count(5);
        Count.xxx(count1);
        Count x=new Count(3);
        x.eat();


    }

}
