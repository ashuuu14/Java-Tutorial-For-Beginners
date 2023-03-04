import java.util.Scanner;

public class class_13 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Age:");
//        int m = sc.nextInt();
        // = , ==
       //  m = 18 = Good m = 15 v.Good m = 20 bad
//        if (m == 18){
//            System.out.println("GOOD");
//        }else if (m == 15){
//            System.out.println("V.Good");
//        }else if (m == 20) {
//            System.out.println("BAD");
//        }else {
//            System.out.println("ERROR");
//        }

//        if (m <=18 ){
//            System.out.println("You can not vote");
//        }else {
//            if (m >=50){
//                System.out.println("You Can Not Vote");
//            }else {
//                if (m>=10){
//                    System.out.println("hello");
//                }else {
//                    System.out.println("hello");
//                }
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("The Number Is "+number+" Even");
        }else {
            System.out.println("The Number Is "+number+" Odd");
        }

        // ! = //

    }
}
