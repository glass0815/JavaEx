import java.util.Scanner;

public class $04Array {
    public static void main(String[] args) throws Exception {
        /*
         *  학생 3명의 국어점수 입력 후 총점과 평균 계산
         * 
         * 만약에 전교생의 국어점수로 게산해야 한다면?
         * => 배열이 탄생했다!
         */
        // 변수를 상수화 (변경 불가)
        final int ST_NUM = 5;
        Scanner sc = new Scanner(System.in);

        // int 3개 저장공간 배열 생성
        int[] kor = new int[ST_NUM];

        // kor.length : 배열의 길이 정보
        for (int i = 0; i < kor.length; i++) {
            System.out.printf("%d번째 학생 국어점수 입력 >> ", i+1);
            kor[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < kor.length; i++) {
            total += kor[i];
        }
        double avg = (double)total/kor.length;

        System.out.println("총점 : " + total);
        System.out.println("평점 : " + avg);
        System.out.printf("평균 : %.2f\n", avg); // 소수점 둘째 자리까지만 출력

        sc.close();
    }
}
