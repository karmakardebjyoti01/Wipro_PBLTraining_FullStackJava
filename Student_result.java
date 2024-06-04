import java.util.*;
public class Student_result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take the input from the user
        System.out.println("Enter the marks of students --");
        System.out.println("Enter the marks of student1 :");
        int s1 = sc.nextInt();

        System.out.println("Enter the marks of student2 :");
        int s2 = sc.nextInt();

        System.out.println("Enter the marks of student3 :");
        int s3 = sc.nextInt();

        //do operations
        

        int passCount = 0;

        if(s1 >= 35)
            passCount++;
        if(s2 >= 35)
            passCount++;
        if(s3 >= 35)
            passCount++;


        System.out.println("Number of students passed in the exam :" + passCount);
    }
}
