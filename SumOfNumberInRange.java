import java.util.*;
public class SumOfNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number1 = sc.nextInt();
        int Number2 =sc.nextInt();

        int sum = 0;
        for (int i = Number1; i <= Number2; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
