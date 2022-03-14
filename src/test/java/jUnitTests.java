import org.junit.Test;
import static org.junit.Assert.*;




public class jUnitTests {

    //add in annotations first

//    @Test
//    public void testIfNameIsDanny(){
//        String expected = "Danny";
//        String actual = "Pinch the cat";
//
//        assertEquals(expected, actual);
//    }

//    @Test //Same test above passed
//    public void testIfNameIsDanny(){
//        String expected = "Danny";
//        String actual = "Danny";
//
//        assertEquals(expected, actual);
//    }

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double dicount = 4.5;

        assertEquals(5.5, price-dicount,0); //delta is a margin of error
        assertEquals(5.0,price-dicount,0.5);
        assertNotEquals(4.2,price-dicount,0.5);
    }
}
