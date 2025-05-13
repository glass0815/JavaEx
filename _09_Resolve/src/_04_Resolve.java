
import java.util.Scanner;

public class _04_Resolve {

    public static int inputNum(Scanner sc){
        System.out.print("2~9 사이를 입력하세요. >> ");
        int num = sc.nextInt();
        return num;
    }

    public static void gugudan(int num){
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num = inputNum(sc);

        gugudan(num);
    }
}
