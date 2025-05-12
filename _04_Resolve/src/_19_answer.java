import java.util.Scanner;

public class _19_answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. >> ");

        int sum = 0;
        while (true) { 
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println(sum);
                break;
            }
            sum += input;
        }
        sc.close();
    }
}
