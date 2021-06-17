package ExercisesPack;
//Given an integer, find the sum of digits of that number until the sum becomes a single digit.
import java.util.Scanner;

public class SumUntilSingleDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any integer value: ");
        int num = sc.nextInt();
        int sum=0;
        while(num>9){
            sum=0;
            do{
                sum = sum + num%10;
                num = num/10;
            }while(num!=0);
            num=sum;
            System.out.println("New Number : "+num);
        }
        System.out.println("Single digit sum :"+num);
    }
}
