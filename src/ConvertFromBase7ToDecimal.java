import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String base7 = scanner.nextLine();
        convertsFromBase7ToDecimal(base7);
    }

    public static void convertsFromBase7ToDecimal(String base7){
        int decimal = 0;
        for (int i = 0; i<base7.length() ; i++) {
            int tempInt = 0;
            switch (base7.charAt(i)){
                case '1' : tempInt = 1;break;
                case '2' : tempInt = 2;break;
                case '3' : tempInt = 3;break;
                case '4' : tempInt = 4;break;
                case '5' : tempInt = 5;break;
                case '6' : tempInt = 6;break;
                case '7' : tempInt = 7;break;
                case '8' : tempInt = 8;break;
                case '9' : tempInt = 9;break;
                case '0' : tempInt = 0;break;
            }
            decimal+=tempInt*Math.pow(7,base7.length()-1-i);
        }
        System.out.println(decimal);
    }
}

