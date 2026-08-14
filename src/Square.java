public class Square {
    double width;
    double height;
    String color;

    public Square(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double calcArea() {
        return (this.width * this.height);
    }

}
