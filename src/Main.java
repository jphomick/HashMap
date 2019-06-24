import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashMap<Integer, String> intToWord = new HashMap<>();
        int num = 0;

        while (num >= 0) {
            System.out.println("What number would you like to retrieve from the database:");
            num = read.nextInt();
            read.nextLine();
            if (intToWord.containsKey(num)) {
                System.out.println(intToWord.get(num));
            } else if (num >= 0) {
                System.out.println("No previous entry: Enter the word for the number " + num);
                String toAdd = read.nextLine();
                intToWord.put(num, toAdd);
            }
        }
    }
}
