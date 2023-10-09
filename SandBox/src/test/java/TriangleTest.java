import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    class TriangleTest {
        @Test
        public void testGetPerimeter() {
            Triangle triangle = new Triangle(3, 4, 5);
            double expectedPerimeter = 12;
            double actualPerimeter = triangle.getPerimeter();
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        public void testGetArea() {
            Triangle triangle = new Triangle(3, 4, 5);
            double expectedArea = 6;
            double actualArea = triangle.getArea();
            assertEquals(expectedArea, actualArea);
        }
    }


