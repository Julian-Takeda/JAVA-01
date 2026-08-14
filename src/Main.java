public class Main {
    public static void main(String[] args)
    {
        Square squareA = new Square(3, 4, "blue");
        Square squareB = new Square(5, 8, "red");

        double areaA = squareA.calcArea();
        double areaB = squareB.calcArea();

        System.out.println("Area of Square a = " + areaA + "m²");
        System.out.println("Square a's color is " + squareA.color);
        System.out.println("Area of Square b = " + areaB + "m²");
        System.out.println("Square b's color is " + squareB.color);

    }
}