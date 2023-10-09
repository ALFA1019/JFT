import java.awt.*;

public class Geometry {
    public static void main(String[] args) {
        printsquarearea(7. );
        printsquarearea(5. );
        printsquarearea(3. );

        printRectangleArea(3.0, 5.0);
        printRectangleArea(7.0, 9.0);

    }
    private static void printRectangleArea(double a, double b) {
        System.out.print("Площадь прямоугольника со сторонами "+ a + "и" +b+ " =" + rectangleArea(a,b));
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }

    static void printsquarearea(double side){
        System.out.print("Площадь квадрата со стороной "+ side +"=" + squarearea(side));
    }

    private static double squarearea(double a) {
        return a * a;
    }
}
