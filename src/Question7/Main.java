package Question7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = Integer.toString(key.nextInt());
        int length = num.length();

        switch(length){
            case 0:

            case 1:

            case 2:
                byte number = Byte.parseByte(num);
                System.out.println("Byte " + number);
                break;
            case 3:

            case 4:


            case 5:

                short number1 = Short.parseShort(num);
                System.out.println("Short" + number1);
                break;
            case 6:


            case 7:


            case 8:

            case 9:

            case 10:
                int number2 = Integer.parseInt(num);
                System.out.println("int " + number2);
                break;

            case 11:

            case 12:

            case 13:

            case 14:

            case 15:

            case 16:

            case 17:

            case 18:

            case 19:
                long number3 = Long.parseLong(num);
                System.out.println("Long "+ number3);
                break;

        }


    }
}
