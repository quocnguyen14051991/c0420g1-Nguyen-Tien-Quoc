package introductionToJava.binaryfileserialization.baitap.quanlysanphamluurafilenhiphan;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Produce implements Serializable, Comparable<Produce> {
    public static int autoId;
    private int id;
    private String name;
    private String produceName;
    private double price;

    public Produce() {
    }

    public Produce(String name, String produceName, double price) {
        this.id = autoId++;
        this.name = name;
        this.produceName = produceName;
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

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produce)) return false;
        Produce produce = (Produce) o;
        return autoId == produce.autoId &&
                getId() == produce.getId() &&
                Double.compare(produce.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), produce.getName()) &&
                Objects.equals(getProduceName(), produce.getProduceName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoId, getId(), getName(), getProduceName(), getPrice());
    }

    @Override
    public String toString() {
        return "Produce{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", produceName='" + produceName + '\'' +
                ", price=" + price +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name Produce");
        name = scanner.nextLine();
        System.out.println("Enter Produce Name");
        produceName = scanner.nextLine();
        System.out.println("Enter Price");
        price = scanner.nextDouble();
    }

    @Override
    public int compareTo(Produce produce) {
        if (this.getId() > produce.getId()) {
            return 1;
        } else if (this.getId() < produce.getId()) {
            return -1;
        } else {
            return 0;
        }
    }

}
