import java.util.Scanner;

public class $02Array {
    public static void main(String[] args) throws Exception {
        /*
         *  학생 3명의 국어점수 입력 후 총점과 평균 계산
         * 
         * 만약에 전교생의 국어점수로 게산해야 한다면?
         * => 배열이 탄생했다!
         */
        Scanner sc = new Scanner(System.in);

        // int 3개 저장공간 배열 생성
        int[] kor = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생 국어점수 입력 >> ", i+1);
            kor[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += kor[i];
        }
        double avg = (double)total/3;

        System.out.println("총점 : " + total);
        System.out.println("평점 : " + avg);
        System.out.printf("평균 : %.2f\n", avg); // 소수점 둘째 자리까지만 출력

        sc.close();
    }
}
