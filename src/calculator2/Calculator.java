package calculator2;

public class Calculator {
    //
    String brand;
    String model;
    int version;
    int result;


    //
    Calculator () {
    this.brand = "onyx";
    this.model = "ino-44";
    this.version = 2;
    }


    //
    int sum(int a, int b) {
        result = a + b;
        return result;
    }

    int sub(int a, int b) {
        result = a - b;
        return result;
    }

    int mul(int a, int b) {
        result = a * b;
        return result;
    }

    int div(int a, int b) {
        result = a / b;
        return result;
    }

    int mod(int a, int b) {
        result = a % b;
        return result;
    }

    int getResult() { return result; }
}
