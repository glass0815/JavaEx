
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 90)
            System.out.println("A학점");
        else
            System.out.println("A학점이 아닙니다.");
        
        // if(score >= 90){
        //     System.out.println("A학점");
        // }

        sc.close();
    }
}
