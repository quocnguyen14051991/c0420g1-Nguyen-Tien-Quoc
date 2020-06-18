package introductionToJava.baitaptuluyen.taomotexceptiontheoymuon;

public class MyException extends Exception {
private String error;

    public MyException(String message, String error) {
        super(message);
        this.error = error;
    }

    public MyException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
