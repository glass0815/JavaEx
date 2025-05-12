public class $07for {
    public static void main(String[] args) {
        int num = 1;        // 초기식식

        // 조건식식
        for(;num <= 10;){
            System.out.println("나무를 " + num + "번 두드렸습니다.");
            // 증감식
            num++;
        }
        System.out.println("나무를 캐었다!");
    }
}
