package challenge3;

public abstract class Shape implements Drawable{
    private String color;

    public Shape(String color){
        this.color = color;
    }

    @Override
    public void drawShape() {
        System.out.println("I am a shape");
    }

    public abstract double calculateArea();

    public void displayColor(){
        System.out.println("color : " +this.color);
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

}
