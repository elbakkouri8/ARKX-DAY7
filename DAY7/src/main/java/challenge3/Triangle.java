package challenge3;

public class Triangle extends Shape{
    private double length;
    private double width;

    public Triangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length*width/2;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a Triangle");
    }

    public void displayColor(){
        System.out.println("color : " +this.getColor());
    }
    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

}
