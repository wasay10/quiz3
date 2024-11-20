import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DistanceTest {

    @Test
    void testChebyshevDistance() {
        long[] point1 = {3, 5};
        long[] point2 = {6, 9};
        assertEquals(4, Distance.chebyshevDistance(point1, point2), "Chebyshev distance should be 4");

        long[] samePoint = {3, 5};
        assertEquals(0, Distance.chebyshevDistance(samePoint, samePoint), "Chebyshev distance of the same point should be 0");
    }

    @Test
    void testSquaredDistance() {
        assertEquals(25.0, Distance.squaredDistance(1, 1, 6, 4), "Squared distance should be 25.0");
        assertEquals(0.0, Distance.squaredDistance(1, 1, 1, 1), "Squared distance of the same point should be 0");
    }

    @Test
    void testEuclideanDistance() {
        assertEquals(5.0, Distance.euclideanDistance(0, 0, 3, 4), 0.01, "Euclidean distance should be 5.0");
        assertEquals(0.0, Distance.euclideanDistance(1, 1, 1, 1), "Euclidean distance of the same point should be 0");
    }
}
