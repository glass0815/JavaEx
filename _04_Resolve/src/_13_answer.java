
import java.util.Scanner;

public class _13_answer {
    public static void main(String[] args) {
        int num_50000 = 0;
        int num_10000 = 0;
        int num_5000 = 0;
        int num_1000 = 0;
        int num_500 = 0;
        int num_100 = 0;
        int num_50 = 0;
        int num_10 = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("돈을 입금하세요. >> ");
        int input = sc.nextInt();

        while (true) { 
            if (input >= 50000) {
                num_50000 = input/50000;
                input -= num_50000 * 50000;
            }else if (input >= 10000) {
                num_10000 = input/10000;
                input -= num_10000 * 10000;
            }else if (input >= 5000) {
                num_5000 = input/5000;
                input -= num_5000 * 5000;
            }else if (input >= 1000) {
                num_1000 = input/1000;
                input -= num_1000 * 1000;
            }else if (input >= 500) {
                num_500 = input/500;
                input -= num_500 * 500;
            }else if (input >= 100) {
                num_100 = input/100;
                input -= num_100 * 100;
            }else if (input >= 50) {
                num_50 = input/50;
                input -= num_50 * 50;
            }else if (input >= 10) {
                num_10 = input/10;
                input -= num_10 * 10;
            }else{
                break;
            }
            System.out.println(input);
        }
        System.out.println("<오만원 "+ num_50000 +"매, 만원 "+ num_10000 +"매, 오천원 "+ num_5000 +"매, 천원 "+ num_1000 +"매, 500원 "+ num_500 +"개, 100원 "+ num_100 +"개, 50원 "+ num_50 +"개, 10원 "+ num_10 +"개> 입니다.");
        sc.close();
    }
}
