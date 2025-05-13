
import java.util.Scanner;

public class _02_Resolve {

    public static int inputNum(Scanner sc, int order){
        System.out.print(order + "번째 정수를 입력하세요. >> ");
        int num = sc.nextInt();
        return num;
    }

    public static int calAbs(int num0, int num1){
        if (num0 > num1) {
            return num0 - num1;
        }else{
            return num1 - num0;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num0 = inputNum(sc, 1);
        int num1 = inputNum(sc, 2);

        int abs = calAbs(num0, num1);

        System.out.println("절대값: " + abs);
    }
}
