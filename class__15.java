import java.util.Scanner;

public class class__15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter User Choice..!");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Sum "+ (a+b));
                break;
            case 2:
                System.out.println("Sub "+ (a-b));
                break;
            case 3:
                System.out.println("Multi "+ (a*b));
                break;
            case 4:
                System.out.println("Div "+(a/b));
                break;
            default:
                System.out.println("Invalid Choice...!");
        }
    }
}
