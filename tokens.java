import java.util.Scanner;

public class tokens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleanInput).reverse().toString();

        if (cleanInput.equals(reversed)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }

        scanner.close();
    }
}
