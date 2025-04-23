package calculator2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator car = new Calculator();
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.print("계산을 진행할까요?(exit를 입력하면 종료됩니다.): ");
            String gogo = scanner.nextLine();
            if (gogo.equals("exit")) break;

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            if (num1 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String symbol = scanner.nextLine();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            if (num2 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            if (symbol.equals("+")) {
                int result = car.sum(num1, num2);
                System.out.print("결과: " + result);
            } else if (symbol.equals("-")) {
                int result = car.sub(num1, num2);
                System.out.print("결과: " + result);
            } else if (symbol.equals("*")) {
                int result = car.mul(num1, num2);
                System.out.print("결과: " + result);
            } else if (num2 ==0 && symbol.equals("/")) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            } else if (symbol.equals("/")) {
                int result = car.div(num1, num2);
                System.out.print("결과: " + result);
            } else if (symbol.equals("%")) {
                int result = car.mod(num1, num2);
                System.out.print("결과: " + result);
            } else {
                System.out.println("기호를 다시 입력하세요.");
            }








        }
    }
}
