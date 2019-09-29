package Question6;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        System.out.println("What is your favorite team?");
        String input = key.nextLine();


//        if(input.compareToIgnoreCase((team.MILWAUKEE_BUCKS).toString()) == 0){
//            System.out.println("alright!");
//        } else {
//            System.out.println("Oh no!!");
//            System.out.println((team.MILWAUKEE_BUCKS).toString());
//        }
        if(input.toLowerCase().startsWith("Mil")){
        }
    }
}
