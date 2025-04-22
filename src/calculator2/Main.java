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

            // 양의 정수를 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            if (num1 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            // 개행문자 제거
            scanner.nextLine();

            // 사칙연산 기호를 입력받기
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
            }





        }
    }
}
