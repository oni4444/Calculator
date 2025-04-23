package calculator2;

public class Calculator {

    // 1. 속성
    private String brand;
    private String model;
    private int version;
    private int result;


    // 2. 생성자
    public Calculator() {
        this.brand = "onyx";
        this.model = "ino-44";
        this.version = 2;
    }


    // 3. 기능
    public int sum(int a, int b) {
        result = a + b;
        return result;
    }

    public int sub(int a, int b) {
        result = a - b;
        return result;
    }

    public int mul(int a, int b) {
        result = a * b;
        return result;
    }

    public int div(int a, int b) {
        result = a / b;
        return result;
    }

    public int mod(int a, int b) {
        result = a % b;
        return result;
    }

    // 게터 ....
    public int getResult() {
        return result;
    }
}
