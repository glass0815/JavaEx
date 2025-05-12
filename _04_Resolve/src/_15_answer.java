import java.util.Scanner;

public class _15_answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~99의 정수를 3개 입력하세요. >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int long_line = 0;
        int sum = a+b+c;

        if(a < b){
            long_line = b;
        }else{
            long_line = a;
        }
        if (long_line < c) {
            long_line = c;
        }

        if (long_line < sum-long_line) {
            System.out.println("삼각형을 만들 수 있습니다.");
        }else{
            System.out.println("삼각형을 만들 수 없습니다.");
        }

        sc.close();
    }
}
