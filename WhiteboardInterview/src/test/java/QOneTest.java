import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QOneTest {

    @Test
    void addingSubstringsTest() {
        Integer [] givenArray = {1, 3, 5, 4};
        Integer expected = 68;
        Integer actual = QOne.addingSubstrings(givenArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addingSubstringsTest2() {
        Integer [] givenArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer expected = 990;
        Integer actual = QOne.addingSubstrings(givenArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addingSubstringsTest3() {
        Integer [] givenArray = {10, 27, 89};
        Integer expected = 405;
        Integer actual = QOne.addingSubstrings(givenArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addingSubstringsTest5() {
        Integer [] givenArray = {1, -5, 40, 102, -55};
        Integer expected = 866;
        Integer actual = QOne.addingSubstrings(givenArray);
        Assertions.assertEquals(expected, actual);
    }

}