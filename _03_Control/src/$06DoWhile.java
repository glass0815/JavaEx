public class $06DoWhile {
    public static void main(String[] args) {
        int num = 1;            // 초기식

        // 일단 무조건 1번은 실행, 그 뒤 조건을 비교
        do { 
            System.out.println("나무를 " + num + "번 두드렸습니다.");
            num++;              // 증감식
        } while (num <= 10);    // 조건식
        
        System.out.println("나무를 캐었다!");
    }
}
