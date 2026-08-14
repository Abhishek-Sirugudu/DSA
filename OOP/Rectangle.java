package OOP;

public class Rectangle extends Shape implements Drawable {

    int length;
    int breadth;

    Rectangle(int length,int breadth,String color){
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public void draw(){
        System.out.println(" I am drawing a rectangle");
    }

    double area(){
        return (length * breadth);
    }



}
