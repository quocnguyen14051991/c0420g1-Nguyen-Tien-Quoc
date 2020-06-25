package introductionToJava.xulyngoailevadebug.thuchanh;

public class Age extends Exception {
    public Age(String mesage){
        super(mesage);
    }

    @Override
    public String getMessage() {
        return "Erro"+super.getMessage();
    }
}
