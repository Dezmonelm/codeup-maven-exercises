import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class Maven1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("isNumeric : " + StringUtils.isNumeric(userInput));
        System.out.println(".swapCase ** will give the opposite casing of letters: " + StringUtils.swapCase(userInput));
        System.out.println(".reverse ** Will reverse the string: " + StringUtils.reverse(userInput));


    }
}
