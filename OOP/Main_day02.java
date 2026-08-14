package OOP;

public class Main_day02 {
    public static void main(String[] args) {
        Circle circle = new Circle("red",2);

        circle.area();
        circle.display();

        Rectangle rect = new Rectangle(2,3,"Red");

        rect.draw();
        rect.area();
        rect.display();

        Shape s = new Circle("blue",8);

        s.display();
    }
}
