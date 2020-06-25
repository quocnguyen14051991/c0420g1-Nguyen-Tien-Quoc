package introductionToJava.javacollectionframework.baitap.b;

public class Produce implements Comparable<Produce> {
    public static int autoId;
    private int id;
    private String name;
    private float price;

    public Produce(int id, String name, float price) {
        this.id = autoId++;
        this.name = name;
        this.price = price;
    }

    public Produce() {
    }

    public Produce(int id, String name) {
        this.id = autoId++;
        this.name = name;
    }

    public Produce(String name, float price) {
        this.id = autoId++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void show() {

        System.out.println("ID :" + this.id);
        System.out.println("Name :" + this.name);
        System.out.println("Price :" + this.price);
        System.out.println("=====================================");
    }

    @Override
    public int compareTo(Produce produce) {
        if (this.getPrice() > produce.getPrice()) {
            return 1;
        } else if (this.getPrice() < produce.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
    // nếu bằng tuổi sắp xếp theo tên..

}
