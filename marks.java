import java.util.Scanner;
public class marks{
    public static void main(String args[]){
        System.out.println("Enter the 5 marks one by one");
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        int max=0;
        int sum=0;
        double avg=0.0;
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
            }
            sum=sum+arr[j];
        }
        avg=sum/5.0;
        System.out.println("Highest marks is ="+max);
        System.out.println("Average marks is ="+avg);
    }
}