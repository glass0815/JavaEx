package com.$03collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManager {
    
    // python의 dictoinary와 동일
    // key값으로 value를 검색하는 자료구조
    private HashMap<String, Employee> empMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public int viewMenu(){
        System.out.println("[사원 선택 입력]");
        System.out.println("1. 정규직");
        System.out.println("2. 임시직");
        System.out.println("3. 파트타임직");
        System.out.println("4. 사번으로 검색");
        System.out.println("5. 전체정보보기");
        System.out.println("6. 종료");
        System.out.println();
        System.out.print("번호 입력 >> ");

        int sel = sc.nextInt();

        return  sel;
    }

    public RegularEmployee createRegularEmployee(){
        System.out.print("사번 >> ");
        String empNo = sc.next();
        System.out.print("이름 >> ");
        String empName = sc.next();
        System.out.print("연봉 >> ");
        int salary = sc.nextInt();
        System.out.print("보너스 >> ");
        int bonus = sc.nextInt();

        RegularEmployee re = new RegularEmployee(empNo, empName, salary, bonus);
        
        System.out.println("정규직 사원정보 입력 완료~");
        return re;
    }

    public TempEmployee createTempEmployee(){
        System.out.print("사번 >> ");
        String empNo = sc.next();
        System.out.print("이름 >> ");
        String empName = sc.next();
        System.out.print("연봉 >> ");
        int salary = sc.nextInt();
        System.out.print("계약기간 >> ");
        int hireYear = sc.nextInt();

        TempEmployee te = new TempEmployee(empNo, empName, salary, hireYear);

        System.out.println("임시직 사원정보 입력 완료~");
        return te;
    }

    private PartTimeEmployee createPartTimeEmployee(){
        System.out.print("사번 >> ");
        String empNo = sc.next();
        System.out.print("이름 >> ");
        String empName = sc.next();
        System.out.print("일당 >> ");
        int dailyPay = sc.nextInt();
        System.out.print("일한일수 >> ");
        int workDay = sc.nextInt();

        PartTimeEmployee pe = new PartTimeEmployee(empNo, empName, dailyPay, workDay);
        System.out.println("파트타임직 사원정보 입력 완료~");

        return pe;
    }

    private void viewSearchEmployeeInfo(){
        System.out.print("검색 사번 입력 >> ");
        String empNo = this.sc.next();
        Employee emp = this.empMap.get(empNo);
        System.out.println(emp);
    }

    private void viewAllEmployeeInfo(){
        // key값만 얻는다.
        Set<String> keySet = this.empMap.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) { 
            String k = keyIterator.next();
            Employee emp = this.empMap.get(k);
            System.out.println(emp);
        }

        System.out.println("전체 정보 조회 완료~");
    }

    private boolean saveEmployee(Employee emp){
        boolean isSave = true;
        
        this.empMap.put(emp.empNo, emp);

        return isSave;
    }

    public void run(){
        boolean isRun = true;
        while (isRun) { 
            int sel = viewMenu();

            Employee emp = null;
            switch (sel) {
                case EmployMenu.REG_EMP:
                    emp = createRegularEmployee();
                    break;
                case EmployMenu.TEMP_EMP:
                    emp = createTempEmployee();
                    break;
                case EmployMenu.PART_EMP:
                    emp = createPartTimeEmployee();
                    break;
                case EmployMenu.SEARCH_EMP:
                    viewSearchEmployeeInfo();
                    break;
                case EmployMenu.ALL_INFO:
                    viewAllEmployeeInfo();
                    break;
                case EmployMenu.EXIT:
                    isRun = false;
                    break;
                default:
                    System.err.println("해당 항목이 존재하지 않습니다!");
                    break;
            }

            // emp 객체가 존재한다면
            if (emp != null) {
                boolean isSave = saveEmployee(emp);
                if (!isSave) {
                    System.out.println("더 이상 저장 공간이 없습니다.");
                }else{
                    System.out.println("잘 저장되었습니다~");
                }
            }

            System.out.println();
            sc.nextLine();
            sc.nextLine();
        }
    }





}
