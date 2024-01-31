package challenge3;

public class Square extends Shape{
    private double length;

    public Square(String color, double length){
        super(color);
        this.length = length;
    }
    @Override
    public double calculateArea(){
        return length*length;
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing a Square");
    }

    public void displayColor(){
        System.out.println("color : " +this.getColor());
    }
    public Square(String color){
        super(color);
    }

    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }
}
