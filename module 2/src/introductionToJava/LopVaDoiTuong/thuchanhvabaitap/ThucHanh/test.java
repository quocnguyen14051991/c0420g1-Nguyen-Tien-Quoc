package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

 class test {
    int id;
    String name;
    public void show(){
        System.out.printf(""+this.name);
    }

    public static void main(String[] args) {

    }
}
class hell extends test{
    @Override
    public void show() {
        super.show();
    }
}

