import java.util.Scanner;

public class _16_answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요. >> ");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.println("감사합니다.");
        }
        sc.close();
    }
}
