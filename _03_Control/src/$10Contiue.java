public class $10Contiue {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            System.out.println("3*" + i + "=" + (3*i));
        }
        for (int i = 1; i <=9; i++) {
            if(i%2==0)          // 짝수일 때
                continue;       // 반복문으로 돌아가라라
            System.out.println("5*" + i + "=" + (5*i));
        }
        System.out.println("END!");
    }
}
