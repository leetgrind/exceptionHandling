import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Enter a number");

            int number = 0;

            if(number == 0) {
                throw new IllegalArgumentException("Number cannot be zero");
            }
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Generic exception");
        }

    }
}