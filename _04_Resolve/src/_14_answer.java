import java.util.Scanner;

public class _14_answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~99의 정수를 하나 입력하세요. >> ");
        int input = sc.nextInt();
        int sip = input/10;
        int il = input%10;
        
        boolean isClap = false;
        if (il == 3 || il == 6 || il == 9){
            isClap = true;
        }
        if (sip == 3 || sip == 6 || sip == 9) {
            if (isClap){
                System.out.println("박수짝짝");
                isClap = false;
            }else{
                System.out.println("박수짝");
            }
        }
        if (isClap){
            System.out.println("박수짝");
        }
        
        sc.close();
    }
}
