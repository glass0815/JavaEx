import java.util.Scanner;

public class _05_Resolve {
    public static void main(String[] args) {
        final int NUM = 10;

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[NUM];
        int total = 0;
        System.out.println("정수를 10개 입력하세요. >> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("총합: " +  total);
    }
}
