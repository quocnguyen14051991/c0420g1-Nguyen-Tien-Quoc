package introductionToJava.accessmodifier.ThucHah.StaticMethod;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }

    public void change(int numberOfCar){
        this.numberOfCar=numberOfCar;
    }

    public static void main(String[] args) {
        Car car1=new Car("Nasub","Skyactiv 3");
        System.out.println(car1.numberOfCar);
        Car car2=new Car("Lee","Engernu");
//        System.out.println(car2.numberOfCar);
        car2.change(3);
        System.out.println(car2.numberOfCar);
        System.out.println(car1.numberOfCar);
    }
}
