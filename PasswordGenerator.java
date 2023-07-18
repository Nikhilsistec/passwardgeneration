import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        String password = generatePassword(name, address);

       
        System.out.println("Your generated password is: " + password);
    }

    public static String generatePassword(String name, String address) {
        
        String input = name + address;

        
        Random random = new Random();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(input.length());
            char randomChar = input.charAt(index);
            passwordBuilder.append(randomChar);
        }

        return passwordBuilder.toString();
    }
}
