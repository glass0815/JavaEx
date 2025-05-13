import java.util.Arrays;
import java.util.Scanner;

public class _06_Resolve {
    public static void main(String[] args) {
        final int ST_NUM = 5;

        Scanner sc = new Scanner(System.in);

        String[] name = new String[ST_NUM];
        int[] grade = new int[ST_NUM];

        for (int i = 0; i < grade.length; i++) {
            System.out.print((i+1) + "번째 학생의 이름을 입력하세요. >> ");
            name[i] = sc.next();
            System.out.print((i+1) + "번째 학생의 점수를 입력하세요. >> ");
            grade[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println(Arrays.toString(name));

        for (int i = 0; i < grade.length; i++) {
            if (grade[i] >= 90) {
                System.out.println("이름: " + name[i] + ", 학점: A");
            }else if (grade[i] >= 80) {
                System.out.println("이름: " + name[i] + ", 학점: B");
            }else if (grade[i] >= 70) {
                System.out.println("이름: " + name[i] + ", 학점: C");
            }else if (grade[i] >= 60) {
                System.out.println("이름: " + name[i] + ", 학점: D");
            }else{
                System.out.println("이름: " + name[i] + ", 학점: F");
            }
            
        }
    }
}
