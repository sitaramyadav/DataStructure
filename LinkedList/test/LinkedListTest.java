import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void addCanAddTheElementInTheList() throws Exception {
        LinkedList list = new LinkedList();
        String firstName = "Seetaram";
        String lastName = "Yadav";
        list.add(firstName);
        assertEquals(firstName, list.getValue(0));

        assertEquals(2,list.add(lastName));
        assertEquals(lastName,list.getValue(1));
    }
    @Test
    public void addShouldreturnTheLenghtOfCurrentList() throws Exception {
        LinkedList list = new LinkedList();
        String firstName = "Seetaram";
        assertEquals(1,list.add(firstName));
        String lastName = "Yadav";
        assertEquals(2,list.add(lastName));
        String Batch = "2015";
        assertEquals(3,list.add(Batch));
        String DOB = "20-7-1992";
        assertEquals(4,list.add(DOB));
        String CompanyName = "Thought-works";
        assertEquals(5,list.add(CompanyName));
    }
    @Test
    public void getValueShouldReturnTheValueOfTheGivenIndex() throws Exception {
        LinkedList list = new LinkedList();
        String firstName = "Seetaram";
        list.add(firstName);
        assertEquals(firstName,list.getValue(0));
        String lastName = "Yadav";
        list.add(lastName);
        assertEquals(lastName,list.getValue(1));
        String Batch = "2015";
        list.add(Batch);
        assertEquals(Batch,list.getValue(2));
    }

}