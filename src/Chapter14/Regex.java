package Chapter14;

public class Regex {
    public static boolean validateFirstname(String firstname) {
        return firstname.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastname(String lastname) {
        return lastname.matches("[a-zA-Z]+(['-][a-zA-Z+]+)*");
    }

    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateState(String state) {
        return state.matches("[a-zA-Z]+");
    }

    public static boolean validateZip(String zip) {
        return zip.matches("\\d{3}");
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
       return phoneNumber.matches("[+][0-9]+[-][0-9]+[-][0-9]+[-][0-9]+");
        //return phoneNumber.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}
