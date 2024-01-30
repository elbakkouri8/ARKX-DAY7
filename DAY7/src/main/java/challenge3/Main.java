package challenge3;

public class Main {
    public static void main(String[] args) {

        Square square=new Square("red",12.41);
        Triangle triangle=new Triangle("green",9.32,3.26);


        triangle.displayColor();
        System.out.println(triangle.calculateArea());
        triangle.drawShape();
        System.out.println("************************************");
        square.displayColor();
        System.out.println(square.calculateArea());
        square.drawShape();

    }
}
