
import java.util.Scanner;

public class linearSearchMethod {

    // method jo search karega
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // index return karo
            }
        }
        return -1; // agar nahi mila
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user se array size input
        System.out.print("Array ka size dijiye: ");
        int n = sc.nextInt();

        // array banaya
        int[] arr = new int[n];

        // user se array ke elements input
        System.out.println("Array ke elements dijiye:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // user se target input
        System.out.print("Kaunsa element dhoondhna hai? ");
        int target = sc.nextInt();

        // method call
        int result = linearSearch(arr, target);

        // output
        if (result == -1) {
            System.out.println("Element nahi mila!");
        } else {
            System.out.println("Element mila index: " + result);
        }

        sc.close();
    }
}
