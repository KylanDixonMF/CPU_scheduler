import java.util.LinkedList;


public class DLLNode {
    
    private Integer value;
    private DLLNode prev;
    private DLLNode next;

    public DLLNode(integer value, DLLNode prev, DLLNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
    
    public Integer getElement(){
        return value;
    }

    public void setElement(Integer value) {
        return this.value = value;
    }

    public DLLNode getPrev(){
        return prev;
    }

    public void setPrev(DLLNode prev){
        this.prev = prev;
    }

    public DLLNode getNext(){
        return next;
    }
    
    public void setNext(){
        this.next = next;
    }

}
