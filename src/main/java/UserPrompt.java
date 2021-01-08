import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class UserPrompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type something...anything...");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);

        if (StringUtils.isNumeric(input)) {
            System.out.printf("%s is a number\n", input);
        } else {
            System.out.printf("%s is not a number\n", input);
        }

        String swapCase = StringUtils.swapCase(input);
        System.out.println("Flip-cased: " + swapCase);

        String reverseString = StringUtils.reverse(input);
        System.out.println("Reversed: " + reverseString);

        String reversedSwapCase = StringUtils.reverse(swapCase);
        System.out.println("Reversed and flip-cased: " + reversedSwapCase);
    }
}
