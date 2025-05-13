import java.util.Arrays;

public class _07_Resolve {
    public static void main(String[] args) {
        int[] arr = {41, 50, 162, 55, 98};

        Arrays.sort(arr);

        System.out.println("최소값: " + arr[0] + ", 최대값: " + arr[arr.length-1]);
    }
}
