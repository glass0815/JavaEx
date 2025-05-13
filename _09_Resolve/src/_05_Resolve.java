
import java.util.Scanner;

public class _05_Resolve {

    public static int inputNum(Scanner sc){
        System.out.print("양수를 입력하세요. >> ");
        int num = sc.nextInt();
        return num;
    }

    public static void star(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num = inputNum(sc);

        star(num);
    }
}
