import java.io.BufferedReader;
import java.io.IOException;  // related to .read()
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        char ch; // declare a variable
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the character you want to check: ");
        ch = (char) bf.read();
        switch (ch) {

            case 'a':
                System.out.println("Character " +ch+ "is a vowel");
                break;
            case 'e':
                System.out.println("Character " +ch+ " is a vowel");
                break;
            case 'i':
                System.out.println("Character " +ch+ " is a vowel");
                break;
            case 'o':
                System.out.println("Character " +ch+ " is a vowel");
                break;
            case 'u':
                System.out.println("Character " +ch+ " is a vowel");
                break;
            default:
                System.out.println("Character " +ch+ " is a consonant");
        }
    }
}