import java.util.Scanner;
public class wtlab3prg2
{
    public static void main(String arg[])
    {
        System.out.println("Enter the number to be checked");
        Scanner sc=new Scanner(System.in);
        int[] n=new int[10];
        int even=0,odd=0;
        for(int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(n[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even numbers is " + even);
        System.out.println("Number of odd numbers is " + odd);
    }
}