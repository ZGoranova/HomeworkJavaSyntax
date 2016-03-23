import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splitedScanner = scanner.nextLine().split("\\s");
        String[] splitedCommand = scanner.nextLine().split("\\s");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < splitedScanner.length; i++) {
            numbers.add(Integer.parseInt(splitedScanner[i]));
        }
        PrintSurchedElements(numbers,splitedCommand);
    }

    public static void PrintSurchedElements(List<Integer> numbers, String[] command){
        if(command[2].equals("odd")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i) % 2 == 1){
                    System.out.print(numbers.get(i));
                    System.out.print(" ");
                }
            }
        }else {
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i) % 2 == 0){
                    System.out.print(numbers.get(i));
                    System.out.print(" ");
                }
            }
        }
    }

}
