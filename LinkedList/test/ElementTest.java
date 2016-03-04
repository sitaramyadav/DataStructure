import org.junit.Test;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void getDataShouldGaveTheDataOfTheCurrentList() throws Exception {
        Element<String> e = new Element<>("hello World");
        assertEquals("hello World",e.getData());
    }

    @Test
    public void getNextShouldGaveTheNextValueOfTheCurrentValueFromTheList() throws Exception {
        Element<String> result = new Element<>("Good Morning");
        Element expected = result.getNext();
        assertEquals(null,expected);

    }

}