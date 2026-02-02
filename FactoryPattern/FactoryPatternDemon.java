package FactoryPattern;

public class FactoryPatternDemon {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create 
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // Call draw method
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
