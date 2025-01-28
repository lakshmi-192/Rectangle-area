import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length (int): ");
        int lengthInt = scanner.nextInt();
        System.out.print("Enter width (int): ");
        int widthInt = scanner.nextInt();
        System.out.print("Enter length (float): ");
        float lengthFloat = scanner.nextFloat();
        System.out.print("Enter width (float): ");
        float widthFloat = scanner.nextFloat();
        int areaInt = lengthInt * widthInt;
        float areaFloat = lengthFloat * widthFloat;
        System.out.println("Area (integer): " + areaInt);
        System.out.println("Area (float): " + areaFloat);
    }
}
