import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {

        System.out.println("Satyam Tripathi");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number to check Even Or Odd");
        int a = in.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    } 
}