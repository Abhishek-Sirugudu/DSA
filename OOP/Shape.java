package OOP;

public abstract class Shape {
    String color;
    Shape(String color){
        this.color = color;
    }

    abstract double area();

    void display(){
        System.out.println("Color :"+color+" | Area = "+area());
    }
}
