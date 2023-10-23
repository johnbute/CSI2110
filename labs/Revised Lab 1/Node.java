public class Node {
    private Object element;
    private Node next;

    Node() {
        this(null, null);
    }

    Node(Object e, Node n) {
        element = e;
        next = n;
    }

    public void setElement(Object newElem) {
        element = newElem;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }

    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
}