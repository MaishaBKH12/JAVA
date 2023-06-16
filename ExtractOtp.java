import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractOtp {

        public static void main(String[] args) {
            String sms = "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";

            // Create a regex pattern to match the OTP
            Pattern pattern = Pattern.compile("Your one time password is (.{6})");

            // Create a matcher object to match the pattern against the SMS message
            Matcher matcher = pattern.matcher(sms);

            // If the matcher finds a match, extract the OTP
            if (matcher.find()) {
                String otp = matcher.group(1);
                System.out.println("OTP: " + otp);
            } else {
                System.out.println("No OTP found in the SMS message");
            }
        }
    }
