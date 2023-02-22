import java.util.Scanner; 

class Rectangle
{  
    int length;  
    int breadth; 
    int area;
    int perimeter; 
    void read()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle :- "); 
        int l = ob.nextInt();
        System.out.print("Enter the breadth of the rectangle :- ");
        int b = ob.nextInt();
        length=l;
        breadth=b;
    } 
    void calculate()
    {  
        area = length*breadth;
        perimeter = 2*(length+breadth);
    } 
    void display()
    {
        System.out.println("Area of the rectangle is "+area);
        System.out.println("Perimeter of the rectangle is "+perimeter);
    } 
}  
class lab4q2
{  
    public static void main(String args[])
    {  
        Rectangle r=new Rectangle();
        r.read();  
        r.calculate(); 
        r.display();   
    }  
}