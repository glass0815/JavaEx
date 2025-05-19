package com.$04exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExceptionMain {
    public static void main(String[] args) {
        int[] arr = {10, 99, 100, 1000};

        Scanner sc = new Scanner(System.in);
        boolean isExcept = false;
        boolean isRun = true;
        while (isRun) { 
            System.out.print("숫자가 4개 있습니다. \n" 
            + "(0, 1, 2, 3)을 입력하면 해당 순서 값을 출력합니다.\n"
            + "-1 을 입력하면 종료합니다. >> ");
            try{
                // InputMismatchException
                int idx = sc.nextInt();
                if (idx == -1) {
                    isRun = false;
                }else{ // ArrayIndexOutOfBoundsException
                    System.out.println(" => " + arr[idx]);
                }
                isExcept = false;
            }catch(InputMismatchException ie){
                System.out.println("*********** 입력 오류 예외 처리~ ***********");
                isExcept = true;
            }catch(ArrayIndexOutOfBoundsException ae){
                System.out.println("*********** 배열 범위 오류 예외 처리~ ***********");
                isExcept = true;
            }catch(Exception e) {
                System.out.println("*********** 모든 오류 예외 처리~ ***********");
                isExcept = true;
            }finally{
                System.out.println();
                if (isExcept)
                    sc.nextLine();      // 버퍼의 \n을 제거
            }
        }

        sc.close();
    }
}
