import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverlapCalculatorTest {
    private OverlapCalculator overlapCalculator;

    @BeforeEach
    public void initEach() {
        this.overlapCalculator = new OverlapCalculator();
    }

    @Test
    public void testCalculateOverlapWhenNoOverlap() {
        int expectedOutput = 0;
        int actualOutput = overlapCalculator.calculateOverlap(-12, -4, -1, -2, 0,0, 100, 3000);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCalculateOverlapWhenOverlappingRectangleInsideTouchingSides() {
        int expectedOutput = 36;
        int actualOutput = overlapCalculator.calculateOverlap(-1, -1, 10, 10, -1, 0 , 3, 9);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCalculateOverlapWhenRectanglesTheSame() {
        int expectedOutput = 121;
        int actualOutput = overlapCalculator.calculateOverlap(-1,-1, 10, 10, -1, -1, 10, 10);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCalculateOverlapWhenSecondOverlappingRectangleBigger() {
        int expectedOutput = 9;
        int actualOutput = overlapCalculator.calculateOverlap(-1,-1, 10, 10, 2,2,5,5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCalculateOverlapWhenNoOverlapButSidesTouching() {
        int expectedOutput = 0;
        int actualOutput = overlapCalculator.calculateOverlap(1,0,5,4,5,0,7,2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCalculateOverlapWhenOverlappingRectangleInsideNotTouchingSides() {
        int expectedOutput = 6;
        int actualOutput = overlapCalculator.calculateOverlap(-4, -1, -2, 2,-6,-3,-1,4);
        assertEquals(expectedOutput, actualOutput);
    }


}