import java.util.Scanner; 

class Student
{  
    int roll;  
    String name; 
    int cgpa;
    void read()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the Roll number of student :- "); 
        int roll_number = ob.nextInt();
        System.out.print("Enter the name of student :- "); 
        String name_student = ob.next();
        System.out.print("Enter the cgpa of student :- "); 
        int cgpa_student = ob.nextInt();
        roll = roll_number;
        name = name_student;
        cgpa = cgpa_student;
    } 
    void display()
    {
        System.out.println("Roll number :- "+roll);
        System.out.println("Name :- "+name);
        System.out.println("CGPA :- "+cgpa);
    }
}  
class wtlab4q3
{  
    public static void main(String args[])
    {  
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the no. of students :- ");
        int n=ob.nextInt();
        Student[] r;
        r=new Student[n];
        for(int i=0; i<n; i++)
        {
            r[i].read();
        } 
        for(int i=0; i<n; i++)
        {
            r[i].display();
        } 
    }  
}