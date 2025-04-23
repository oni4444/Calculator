package calculator2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator car = new Calculator(); // 계산기 객체 선언
        Scanner sc = new Scanner(System.in); // 스캐너 선언

        // 반복문 선언
        for (; ; ) {
            System.out.print("계산을 진행할까요?(exit를 입력하면 종료됩니다.): ");
            String gogo = sc.nextLine();
            if (gogo.equals("exit")) break; // exit 입력 시 종료

            // 양의 정수를 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            // 개행문자 제거
            sc.nextLine();

            // 사칙연산 기호를 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            String symbol = sc.nextLine();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            if (symbol.equals("+")) {
                int result = car.sum(num1, num2);
                System.out.println("결과: " + result);
            } else if (symbol.equals("-")) {
                int result = car.sub(num1, num2);
                System.out.println("결과: " + result);
            } else if (symbol.equals("*")) {
                int result = car.mul(num1, num2);
                System.out.println("결과: " + result);
            } else if (num2 == 0 && symbol.equals("/")) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else if (symbol.equals("/")) {
                int result = car.div(num1, num2);
                System.out.println("결과: " + result);
            } else if (symbol.equals("%")) {
                int result = car.mod(num1, num2);
                System.out.println("결과: " + result);
            } else {
                System.out.println("기호를 다시 입력하세요.");
            }


        }
    }
}
