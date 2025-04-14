import java.util.Scanner;

public class CalculateTryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            try {
                System.out.print("첫번째 숫자 입력: ");
                int num1 = sc.nextInt();

                System.out.print("사칙연산(+,-,*,/)를 입력: ");
                char op = sc.next().charAt(0);

                System.out.print("두번째 숫자 입력: ");
                int num2 = sc.nextInt();

                int result = 0;

                switch (op) {
                    case '+' :
                        result = num1 + num2;
                        break;
                    case '-' :
                        result = num1 - num2;
                        break;
                    case '*' :
                        result = num1 * num2;
                        break;
                    case '0' :
                        if (num2 == 0) {
                            System.out.println(" 0으로 나눌수 없습니다.");

                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("계산 불가!");
                        valid = false;
                }
        if (valid) {
            System.out.println("결과: " + result);
        }
        sc.close();

    }
}
