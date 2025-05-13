
import java.util.Scanner;

public class _03_Resolve {
    public static void main(String[] args) {
        final int ST_NUM = 7;

        Scanner sc = new Scanner(System.in);

        int[] grade = new int[ST_NUM];
        int total = 0;

        for (int i = 0; i < grade.length; i++) {
            System.out.println((i+1) + "번째 학생의 학점을 입력하세요. >> ");
            grade[i] = sc.nextInt();
            total += grade[i];
        }
        double avg = (double)total/grade.length;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
    }
}
