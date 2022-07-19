package main.java;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest extends TestCase {
    @Test
    public void getArea(){
        main.java.Rectangle rectangle = new Rectangle(3,4);
        Assert.assertEquals(12, rectangle.getArea());
    }

    public void testGetPerimetr() {

    }

    public void testGetDiagonal() {

    }

    public void testIsQuadrat() {

    }
}