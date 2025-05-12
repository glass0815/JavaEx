public class $03Logic {
    public static void main(String[] args) {
        boolean isLogic = true && true; 
        System.out.println(isLogic);
        isLogic = true && false;
        System.out.println(isLogic);
        isLogic = true || true; // 앞에가 true면 뒤에와 상관 없이 true이기 때문에 뒤에꺼는 필요 없다.
        System.out.println(isLogic);
        isLogic = true || false;
        System.out.println(isLogic);
        System.out.println(!true);
        System.out.println(!false);
    }
    
}
