import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        int sum=num1+num2+num3;
        System.out.println("The Sum of the given numbers is "+sum);
        int largest=num1>(num2>num3?num2:num3)?num1:num2>num3?num2:num3;
        System.out.println("The largest of the given three numbers is "+largest);
    }
}