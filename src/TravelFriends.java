import java.util.Scanner;

public class TravelFriends {
    public static void main(String[] args) {
        Scanner xploitInput = new Scanner(System.in);
        System.out.println("Input first number >> ");
        int first = xploitInput.nextInt();
        System.out.println("Input second number >> ");
        int second = xploitInput.nextInt();

        if (first % 3 != 0 && second % 10 == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}