package main.java;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest extends TestCase {
    @Test
    public void testGetDiametrIfRadius3() {
        Circle circle = new Circle( 3);
        Assert.assertEquals(6, circle.getDiametr());
    }

    public void testGetAreaIfRadius3() {
        Circle circle = new Circle(3);
        Assert.assertEquals(28.27, circle.getArea());
    }

    public void testGetPerimetrIfRadius3() {
        Circle circle = new Circle(3);
        Assert.assertEquals(18.84, circle.getPerimetr());
    }

    public void testGetDiametrIfRadius3AndResultFalse() {
        Circle circle = new Circle( 3);
        Assert.assertEquals(10, circle.getDiametr());
    }

    public void testGetAreaIfRadius3AndResultFalse() {
        Circle circle = new Circle(3);
        Assert.assertEquals(29.27, circle.getArea());
    }
}