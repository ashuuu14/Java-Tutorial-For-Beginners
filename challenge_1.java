import java.util.Scanner;

public class challenge_1 {
    //write a java program to print the multiplication table of a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int n = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 1; i<=c; i++){
            System.out.println(n+" x "+i+" =  "+n*i);
        }
//        System.out.println(n+" x "+" 2 "+" =  "+n*2);
//        System.out.println(n+" x "+" 3 "+" =  "+n*3);
//        System.out.println(n+" x "+" 4 "+" =  "+n*4);
//        System.out.println(n+" x "+" 5 "+" =  "+n*5);
//        System.out.println(n+" x "+" 6 "+" =  "+n*6);
//        System.out.println(n+" x "+" 7 "+" =  "+n*7);
//        System.out.println(n+" x "+" 8 "+" =  "+n*8);
//        System.out.println(n+" x "+" 9 "+" =  "+n*9);
//        System.out.println(n+" x "+" 10 "+" = "+n*10);

    }
}
