import java.util.Scanner;
class Add
{
    public static void main(String[] args) 
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Number 1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter the Number 2: ");
            int num2 = scan.nextInt();
            int sum = num1+num2;
            System.out.println("The sum is: "+sum);
        }
    }
