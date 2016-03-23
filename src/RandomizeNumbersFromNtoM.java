import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        if(n<m){
            for (int i = 0; i <m-n+1 ; i++) {
                System.out.print(randInt(n, m));
                System.out.print(", ");
            }
        }else {
            for (int i = 0; i <n-m+1 ; i++) {
                System.out.print(randInt(m, n));
                System.out.print(", ");
            }
        }

    }
    public static int randInt(int min, int max) {

        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
