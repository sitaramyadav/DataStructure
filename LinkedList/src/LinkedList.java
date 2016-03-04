public class LinkedList<S> {
    private int length = 0;
    private Element<S> head;

    public LinkedList() {

    }

    public void add(S data) {
        if (head == null) head = new Element<>(data);

        Element<S> temp = new Element<>(data);
        Element current = head;

        if (current != null) {
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(temp);
        }

        incrementLength();
    }

    private void incrementLength() {
        length++;
    }

    private void decrementLength() {
        length--;
    }

    public void add(S data, int index) {
        Element<S> temp = new Element<>(data);
        Element current = head;
        if (current != null) {
            for (int i = 1; i < index && current.getNext() != null; i++) {
                current = current.getNext();
            }
        }
        assert current != null;
        temp.setNext(current.getNext());
        current.setNext(temp);
        incrementLength();
    }

    public Object get(int index) {
        Element e = this.head;
        for (int i = 0; i < index; i++) e = e.getNext();
        if (this.length < index) {
            return null;
        }
        return e.getData();
    }

    public boolean remove(int index) {
        if (index < 1 || index > size()) {
            return false;
        }
        Element current = head;
        if (head != null) {
            for (int i = 0; i < index; i++)
                if (head.getNext() == null) {
                    return true;
                }
            current.getNext().getNext().setNext(current);
            decrementLength();
            return true;
        }
        return false;
    }

    public int size() {
        return length;
    }
}
