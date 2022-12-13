package Assignment2;

public class polymorphism {

    // function to draw a shape
    public void draw_shape() {
        System.out.println("draw shape...");
    }
}

class Square extends polymorphism {

    // function to draw a square
    public void draw_shape() {
        System.out.println("shape is of Square...");
    }
}

class Circle extends polymorphism {

    // function to draw circle
    public void draw_shape() {
        System.out.println("shape is of circle...");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Square
        Square s1 = new Square();
        s1.draw_shape();

        // create an object of Circle
        Circle c1 = new Circle();
        c1.draw_shape();
    }
}
