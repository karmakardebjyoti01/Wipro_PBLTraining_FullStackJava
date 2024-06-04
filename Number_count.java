import java.util.*;


public class Number_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers both negative and positive :");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;

        if(a >= 0)
        {
            positiveCount++;
        }
        else{
            negativeCount++;
        }
        if(b >= 0)
        {
            positiveCount++;
        }
        else{
            negativeCount++;
        }
        if(c >= 0)
        {
            positiveCount++;
        }
        else{
            negativeCount++;
        }
        if(d >= 0)
        {
            positiveCount++;
        }
        else{
            negativeCount++;
        }
        if(e >= 0)
        {
            positiveCount++;
        }
        else{
            negativeCount++;
        }

        System.out.println("Number of positive numbers : "+ positiveCount);
        System.out.println("Number of negative numbers :" + negativeCount);
    }
}
