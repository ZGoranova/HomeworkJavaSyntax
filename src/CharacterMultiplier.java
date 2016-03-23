import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();
        int sum = 0;
        if(firstString.length()==secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                sum += (int) firstString.charAt(i) * (int) secondString.charAt(i);
            }
        }else {
            int lenght = 0;
            if (firstString.length()<secondString.length()){
                lenght = firstString.length();
            }else {
                lenght = secondString.length();
            }
            for (int i = 0; i < lenght; i++) {
                sum += (int) firstString.charAt(i) * (int) secondString.charAt(i);
            }
            if(firstString.length()>secondString.length()){
                for (int i = lenght; i < firstString.length(); i++) {
                    sum+=(int)firstString.charAt(i);
                }
            }else {
                for (int i = lenght; i < secondString.length() ; i++) {
                    sum+=(int)secondString.charAt(i);
                }
            }
        }
        System.out.println(sum);
    }
}
