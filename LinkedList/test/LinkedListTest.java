import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void addShouldInsertAnyTypeOfElementInTheList() throws Exception {
        LinkedList<java.io.Serializable> multipleTypeOfValue = new LinkedList<>();

        multipleTypeOfValue.add(1);
        multipleTypeOfValue.add(2.3f);
        multipleTypeOfValue.add(34L);
        multipleTypeOfValue.add('S');
        multipleTypeOfValue.add("Hello World How r u ?");
        multipleTypeOfValue.add("It is 6th Value", 5);
        assertEquals("It is 6th Value", multipleTypeOfValue.get(5));
    }

    @Test
    public void addShouldOverrideTheValueAtAnyPositionInTheList() throws Exception {
        LinkedList<java.io.Serializable> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(4);
        list.add("5");
        assertEquals(4, list.get(4));
        String result = "It is overriding The Value of 3 index";
        list.add(result, 4);
        assertEquals(result, list.get(4));
    }

    @Test
    public void addCanInsertTheStringTypeOfValueAtTheFirstIndexOfTheList() throws Exception {
        LinkedList<java.io.Serializable> listForString = new LinkedList<>();
        listForString.add("hello");
        assertEquals("hello", listForString.get(0));
    }

    @Test
    public void addCanInsertTheIntegerTypeOfValueAtTheFirstIndexOfTheList() throws Exception {
        LinkedList<java.io.Serializable> listForInt = new LinkedList<>();
        listForInt.add(1);
        assertEquals(1, listForInt.get(0));
    }

    @Test
    public void addCanInsertTheCharTypeOfValueAtTheFirstIndexOfTheList() throws Exception {
        LinkedList<java.io.Serializable> listForChar = new LinkedList<>();
        listForChar.add('S');
        assertEquals('S', listForChar.get(0));
    }

    @Test
    public void addCanInsertTheBooleanTypeOfValueAtTheFirstIndexOfTheList() throws Exception {
        LinkedList<java.io.Serializable> listForBoolean = new LinkedList<>();
        listForBoolean.add(true);
        assertEquals(true, listForBoolean.get(0));
    }

    @Test
    public void addCanInsertTheFloatTypeOfValueAtTheFirstIndexOfTheList() throws Exception {
        LinkedList<java.io.Serializable> listForFloat = new LinkedList<>();
        listForFloat.add(4567.9797f);
        assertEquals(4567.9797f, listForFloat.get(0));
    }

    @Test
    public void addCanInsertTheDoubleTypeOfValueAtTheFirstIndexOfTheList() throws Exception {
        LinkedList<java.io.Serializable> listForLong = new LinkedList<>();
        double value = 98079929057098509840948094809470956712345678900987654323456788765456787655678765678.546767654676534D;
        double expected = value * value * value * value;
        expected = expected * expected * expected * expected;
        listForLong.add(expected);
        assertEquals(expected, listForLong.get(0));

    }

    @Test
    public void getShouldGetTheValueOfAnyPositionFromTheList() throws Exception {
        LinkedList<java.io.Serializable> list = new LinkedList<>();
        list.add("First");
        list.add(1);
        list.add('S');
        list.add(5555.55);
        list.add(242L);
        assertEquals("First", list.get(1));
        assertEquals(1, list.get(2));
        assertEquals('S', list.get(3));
        assertEquals(5555.55, list.get(4));
        assertEquals(242L, list.get(5));

    }

    @Test
    public void ItShouldRemoveTheValueFromTheList() throws Exception {
        LinkedList<java.io.Serializable> list = new LinkedList<>();
        list.add("First");
        list.add(1);
        list.add('S');
        list.add(5555.55);
        list.add(242L);
        assertEquals(true, list.remove(1));
        assertEquals(true, list.remove(2));
        assertEquals(3, list.size());
        assertEquals(true, list.remove(3));
        assertEquals(null, list.get(3));
        assertEquals(false, list.remove(3));

    }

    @Test
    public void sizeShouldGetTheSizeOfTheCurrentList() throws Exception {
        LinkedList<java.io.Serializable> list = new LinkedList<>();
        list.add("First");
        assertEquals(1, list.size());
        list.add(1);
        assertEquals(2, list.size());
        list.add('S');
        assertEquals(3, list.size());
        list.add(5555.55);
        list.add(242L);

    }
}