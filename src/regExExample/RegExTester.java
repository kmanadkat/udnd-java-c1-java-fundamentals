package regExExample;
import java.util.regex.Pattern;

public class RegExTester {
  public static void main(String[] args) {
    String emailRegex = "^(.+)@(.+).(.+)$";
    Pattern pattern = Pattern.compile(emailRegex);

    String email = "@text.com";

    System.out.println(pattern.matcher(email).matches());
  }
}
