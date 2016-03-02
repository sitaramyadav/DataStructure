public class LinkedList<T>{

    private Element first, last;
    private int length;

    public LinkedList() {
        first = null;
        last = null;
        length = 0;
    }

    public int add(String value){
        Element e = new Element(value);
        if(this.length==0){
            this.first = this.last = e;
        }
        else{
            this.last.next=e;
            this.last=e;
        }
        this.length+=1;
        return this.length;

    }
    public String getValue(int index){
        Element e = this.first;
        for(int i=0;i<index;i++){
            e=e.next;
        }
        if(this.length<index)
            return null;
        return e.value;
    }
}
