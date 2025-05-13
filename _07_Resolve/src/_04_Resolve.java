
public class _04_Resolve {
    public static void main(String[] args) {
        final int NUM = 10;

        int[] arr = new int[NUM];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3*(i+1);
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
