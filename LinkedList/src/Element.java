class Element <T>{
    private Element next;
    T value;

    public Element(T data) {
        setNext(null);
        value = data;
    }

    public T getData() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}