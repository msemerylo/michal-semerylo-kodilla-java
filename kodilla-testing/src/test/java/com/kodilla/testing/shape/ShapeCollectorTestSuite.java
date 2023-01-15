package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;




public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void befforeAllTests() {
        System.out.println("This is beginning of tests ");
    }

    @AfterAll
    public static void afterAllTestos() {
        System.out.println("All tests are finishing");
    }

    @Nested
    @DisplayName("First part of tests")
    class FirstPartOfTests {
        @Test
        public void addFigureTest() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(1);
            //when
            shapeCollector.addFigure(shape);
            //then
            Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
        }

        @Test
        public void removeFigureTest() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(1);
            shapeCollector.addFigure(shape);
            //when
            boolean result = shapeCollector.removeFigure(shape);
            //then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());
        }

        @Test
        public void removeFigureNotExistTest() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2));
            //when
            boolean result = shapeCollector.removeFigure(new Circle(1));
            //then
            Assertions.assertFalse(result);
            Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
        }
    }

    @Nested
    @DisplayName("Second part of tests")
    class SecondPartOfTests {
        @Test
        public void showFiguresTest() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(1);
            shapeCollector.addFigure(shape);
            List<Shape> shapeList = new ArrayList<Shape>();
            shapeList.add(shape);
            //when
            List<Shape> shapeResult = shapeCollector.getShapeCollection();
            //then
            Assertions.assertEquals(shapeList.toString(), shapeResult.toString());
        }

        @Test
        public void getFigureNumberTest() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(1);
            shapeCollector.addFigure(shape);
            //when
            Shape shapeResult = shapeCollector.getFigure(0);
            //then
            Assertions.assertEquals(shape, shapeResult);
        }

        @Test
        public void getFigureNumberNotExistTest() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            //when
            Shape shapeResult = shapeCollector.getFigure(3);
            //then
            Assertions.assertNull(shapeResult);
        }
    }
}
