import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty() || input == null) {
                break;
            }
            numbers.add(Double.parseDouble(input));
        }
        formatingNumbers(numbers.get(0).intValue(),numbers.get(1),numbers.get(2));
    }

    public static void formatingNumbers(int a, double b, double c){
        String hex = Integer.toHexString(a);
        int bin = Integer.parseInt(Integer.toBinaryString(a));
        System.out.printf("%-10s|%010d|%10.2f|%-10.3f", hex, bin, b, c);
    }
}
