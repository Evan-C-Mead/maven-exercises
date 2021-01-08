import java.util.*;
import static org.apache.commons.lang3.StringUtils.*;


public class UserPrompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type something...anything...");
        String input = sc.nextLine();

        System.out.println(isNumeric(input));
        System.out.println(swapCase(input));
        System.out.println(reverse(input));
    }
}
