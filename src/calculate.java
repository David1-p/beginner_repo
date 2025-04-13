import java.util.Scanner;


/*
float divide(int x, int y) { // 작업하기 전 나누는 수 y가 0인지 확인한다.
    if(y==0) {
    s.out.println("0으로 나눌 수 없다.")
    return 0; // 메서드 종료
    }
    return x / (int) y;
    }
    두번째 입력값이 0이 되면 안됨
    if(num2==0)
    break;


 */


public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        if (args.length != 3) {
            System.out.println("다시 입력하세요!");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = (int) num1 + num2;
                break;
            case '-':
                result = (int) num1 - num2;
                break;
            case '*':
                result = (int) num1 * num2;
                break;
            case '/':
                result = (int) num1 / num2;
                break;
            default:
                System.out.println("계산 불가! ");
        }
        System.out.println("결과:"+result);
    }
}
