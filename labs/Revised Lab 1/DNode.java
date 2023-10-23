public class DNode {
    private Object element;
    private DNode next, prev;

    public DNode(Object e, DNode p, DNode n) {
        this.element = e;
        this.prev = p;
        this.next = n;
    }

    public void setElement(Object newElem) { this.element = newElem; }
    public Object getElement() { return this.element; }
    public void setNext(DNode newNext) { this.next = newNext; }
    public DNode getNext() { return this.next; }
    public void setPrev(DNode newPrev) { this.prev = newPrev; }
    public DNode getPrev() { return this.prev; }
}
