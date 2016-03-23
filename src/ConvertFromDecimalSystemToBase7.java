import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        ConvertsDecimalInToBase7(number);
    }

    public static void ConvertsDecimalInToBase7(int number){
        String result = "";
        for (int i = 0; ; i++) {
            if(number==0){
                break;
            }
            int imp = number%7;
            int temp = number/7;
            result+=imp;
            number=temp;
        }
        String reversedResult = "";
        for (int i = 0; i < result.length(); i++) {
            reversedResult += result.charAt(result.length()-i-1);
        }
        System.out.println(reversedResult);
    }
}
