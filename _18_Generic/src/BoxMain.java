public class BoxMain {
    /*
     * Generic 은 논리와 기능을 
     */
    public static void main(String[] args) {
        class Employee{
            String empNo;
            String empName;
            int age;


            public Employee(String empNo, String empName, int age) {
                this.empNo = empNo;
                this.empName = empName;
                this.age = age;
            }
            
        }

        Box<Integer> intBox = new Box<>();
        intBox.content = 99;
        System.out.println(intBox.content);
        
        Box<String> strBox = new Box<>();
        strBox.content = "Albert";
        System.out.println(strBox.content);
        
        Box<Employee> empBox = new Box<>();
        empBox.content = new Employee("1111", "Alice", 25);
        System.out.println(empBox.content);
    }
}