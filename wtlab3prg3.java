import java.util.Scanner;
public class wtlab3prg3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the limit");
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=0,min=0,sum=0;
        double diff=0.0;
        double avg=0.0,std=0.0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        avg=sum/n;
        min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        for(int i=0;i<n;i++){
            diff=diff+((a[i]-avg)*(a[i]-avg));
        }
        std=diff/n;
        System.out.println("MAXIMUM =" +max);
        System.out.println("MINIMUM =" +min);
        System.out.println("AVERAGE =" +avg);
        System.out.println("STANDARD DEVIATION =" +std);
    }
}