
public class TestCircleRectangle1 {

    public static void main(String[] args) {
        Circle1 circle = new Circle1(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle1 rectangle = new Rectangle1(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        Pentagon pentagon = new Pentagon(5, 2);
        System.out.println("\nA pentagon " + pentagon.toString());
        System.out.println("The area is " + pentagon.getArea());
        System.out.println("The perimeter is " + pentagon.getPerimeter());

        GeometricObject1 pentagon1 = new Pentagon(5, 2);
        System.out.println("\nA pentagon " + pentagon.toString());
        System.out.println("The area is " + pentagon.getArea());
        System.out.println("The perimeter is " + pentagon.getPerimeter());
    }

}

