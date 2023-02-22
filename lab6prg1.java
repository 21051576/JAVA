import java.util.Scanner;

class TwoD {
    protected double length;
    protected double breadth;

    public TwoD(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

class ThreeD extends TwoD {
    protected double height;

    public ThreeD(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getVolume() {
        return length * breadth * height;
    }
}

public class lab6prg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape to calculate cost:");
        System.out.println("1. 2D sheet");
        System.out.println("2. 3D box");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the sheet in feet: ");
                double length = sc.nextDouble();
                System.out.print("Enter the breadth of the sheet in feet: ");
                double breadth = sc.nextDouble();

                TwoD sheet = new TwoD(length, breadth);
                double sheetArea = sheet.getArea();
                double sheetCost = sheetArea * 40;

                System.out.println("Area of sheet: " + sheetArea + " sq. ft.");
                System.out.println("Cost of sheet: Rs. " + sheetCost);
                break;
            case 2:
                System.out.print("Enter the length of the box in feet: ");
                double boxLength = sc.nextDouble();
                System.out.print("Enter the breadth of the box in feet: ");
                double boxBreadth = sc.nextDouble();
                System.out.print("Enter the height of the box in feet: ");
                double boxHeight = sc.nextDouble();

                ThreeD box = new ThreeD(boxLength, boxBreadth, boxHeight);
                double boxVolume = box.getVolume();
                double boxCost = boxVolume * 60;

                System.out.println("Volume of box: " + boxVolume + " cu. ft.");
                System.out.println("Cost of box: Rs. " + boxCost);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}