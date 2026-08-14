package OOP;

public class Circle extends Shape implements Drawable {
    double radius;

    Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    public void draw(){
        System.out.println("Drawing a circle");
    }
    double area(){
        return Math.PI * radius * radius;
    }

    void display(){
        System.out.println("Displaying");
    }

}
