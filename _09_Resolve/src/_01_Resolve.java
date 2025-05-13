
import java.util.Scanner;

public class _01_Resolve {

    public static int inputNum(Scanner sc, int order){
        System.out.print(order + "번째 정수를 입력하세요. >> ");
        int num = sc.nextInt();
        return num;
    }

    public static int calBigNum(int num0, int num1){
        if (num0 > num1) {
            return num0;
        }else{
            return num1;
        }
    }

    public static int calSmNum(int num0, int num1){
        if (num0 < num1) {
            return num0;
        }else{
            return num1;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num0 = inputNum(sc, 1);
        int num1 = inputNum(sc, 2);

        int bigNum = calBigNum(num0, num1);
        int smallNum = calSmNum(num0, num1);

        System.out.println("큰 값: " + bigNum +", 작은 값: "+ smallNum);
    }
}
