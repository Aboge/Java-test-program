package Exception;

public class MyException extends Exception {

    //传递数字>10
    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    @Override
    public String toString() {
        return "MyException{"+detail+"}";
    }
}
