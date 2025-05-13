
import java.util.Scanner;

public class _03_Resolve {

    public static int inputNum(Scanner sc, int order){
        System.out.print(order + "번째 정수를 입력하세요. >> ");
        int num = sc.nextInt();
        return num;
    }

    public static int calSum(int num0, int num1){
        int sum = 0;
        for (int i = num0; i <= num1; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num0 = inputNum(sc, 1);
        int num1 = inputNum(sc, 2);

        int sum = calSum(num0, num1);

        System.out.println("누적합: " + sum);
    }
}
