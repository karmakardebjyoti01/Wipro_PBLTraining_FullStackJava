import java.util.*;
class Var_swap3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :");
        int a = sc.nextInt();

        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        System.out.println("Enter the value of c :");
        int c = sc.nextInt();

        //print original values
        System.out.println("_______ ORIGINAL VALUES _______");

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println("Value of c = " + c);

        int temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println("_______ SWAPPED VALUES _______");

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println("Value of c = " + c);
    }
}