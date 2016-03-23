import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty() || input == null) {
                break;
            }
            numbers.add(Integer.parseInt(input));
        }
        System.out.println(calculateTriangleArea(numbers));
    }

    public static int calculateTriangleArea( List<Integer>info){
        int result = Math.abs(info.get(0)*
                Math.abs(info.get(3) - info.get(5))+
                info.get(2)*Math.abs(info.get(5) - info.get(1))+info.get(4)*Math.abs(info.get(1) - info.get(3)));

        return result;
    }
}
