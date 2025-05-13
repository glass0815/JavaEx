
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         *  학생 3명의 국어점수 입력 후 총점과 평균 계산
         * 
         * 만약에 전교생의 국어점수로 게산해야 한다면?
         * => 배열이 탄생했다!
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 학생 국어점수 입력 >> ");
        int kor0 = sc.nextInt();
        System.out.print("2번째 학생 국어점수 입력 >> ");
        int kor1 = sc.nextInt();
        System.out.print("3번째 학생 국어점수 입력 >> ");
        int kor2 = sc.nextInt();

        int total = kor0 + kor1 + kor2;
        double avg = (double)total/3;

        System.out.println("총점 : " + total);
        System.out.println("평점 : " + avg);
        System.out.printf("평균 : %.2f\n", avg); // 소수점 둘째 자리까지만 출력

        sc.close();
    }
}
