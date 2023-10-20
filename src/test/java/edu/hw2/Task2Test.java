package edu.hw2;

import edu.hw2.task2.Rectangle;
import edu.hw2.task2.Square;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test
{
    @Test
    void AreaWithConstructorTest()
    {
        Rectangle rectangle = new Rectangle(20, 10);
        Square square = new Square(20);
        assertThat(rectangle.area()).isEqualTo(200);
        assertThat(square.area()).isEqualTo(400);
    }

    @Test
    void AreaWithSetAndGetTest()
    {
        Rectangle rectangle = new Rectangle(20, 10);
        Square square = new Square(20);
        rectangle = rectangle.setHeight(10);
        rectangle = rectangle.setWidth(12);
        square = square.setHeight(2);
        assertThat(rectangle.area()).isEqualTo(120);
        assertThat(square.area()).isEqualTo(4);
        square = square.setWidth(4);
        assertThat(square.area()).isEqualTo(16);

    }

}
