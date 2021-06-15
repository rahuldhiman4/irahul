package ExercisesPack;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        System.out.println("Please enter a number: ");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
