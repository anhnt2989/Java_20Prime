import java.util.Scanner;

public class Java_20Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;
        System.out.println("Displaying prime numbers less than: ");
        numb = input.nextInt();
        int count = 0;
        int N = 2;
        boolean check = false;
        while (count < numb) {
            if (N == 2 || N == 3) {
                System.out.println(N);
                count++;
            }
            for (int i=2;i<=Math.sqrt(N);i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                } else
                    check = true;
            }
                if (check)
                    System.out.println(N);
            count++;
            N++;
        }
    }
}
