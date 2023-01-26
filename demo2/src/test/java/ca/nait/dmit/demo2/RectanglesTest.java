package ca.nait.dmit.demo2;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectanglesTest {

    @Test
    public void area_ValidValues_shouldPass() {
    Rectangles currentRectangle = new Rectangles();
    currentRectangle.setLength(10);
    currentRectangle.setBreadth(5);

    assertEquals(40, currentRectangle.area());
    }
}