import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<Integer> givenNumbers = new ArrayList<Integer>();
        String input = scanner.nextLine();
        String pattern = "\\s";
        String[] splitedInput = input.split(pattern);
        if(splitedInput.length % 2 ==0){
            for (int i = 0; i <splitedInput.length-1 ; i+=2) {
                boolean first = isEven(Integer.parseInt(splitedInput[i]));
                boolean second = isEven(Integer.parseInt(splitedInput[i+1]));
                if(first == second && first== true){
                    System.out.printf("%s, %s -> both are even",splitedInput[i],splitedInput[i+1]);
                    System.out.println();
                }if (first == second && second== false){
                    System.out.printf("%s, %s -> both are odd",splitedInput[i],splitedInput[i+1]);
                    System.out.println();
                }if(first != second) {
                    System.out.printf("%s, %s -> different",splitedInput[i],splitedInput[i+1]);
                    System.out.println();
                }
            }
        }else {
            System.out.println("Invalid length");
        }

    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }else {
            return false;
        }

    }
}
