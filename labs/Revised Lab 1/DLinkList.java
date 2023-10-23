public class DLinkList {
    DNode head;
    DNode tail;
    long size;

    DLinkList(long sz) {
        // Note the size of the linked list will not count the dummy head or tail
        this.head = new DNode("dummy_head", null, null);
        this.tail = new DNode("dummy_tail", null, null);
        this.head.setNext(this.tail);

        if (sz != 0) {
            DNode current = head;
            for (int i=0; i<sz; i++) {
                DNode next_node = new DNode(Integer.toString(i), current, this.tail);
                this.tail.setPrev(next_node);
                current.setNext(next_node);
                current = next_node;
            }
        }
        this.size = sz;
    }

    public void print() {
        if (this.size == 0) {
            System.out.println("Empty Doubly Linked List");
        }

        DNode current = head;
        while (current != null) {
            System.out.print((String) current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void deleteFirst() {
        if(head.getNext()!= tail){
            head.setNext(head.getNext().getNext());
            head.getNext().setPrev(head);
        }
    }

    public void deleteLast() {
        if(head.getNext() != tail){
            tail.setPrev(tail.getPrev().getPrev());
            tail.getPrev().setNext(tail);
        }
    }

    public static void main(String[] args) {
        long list_size = 10;
        DLinkList llist = new DLinkList(list_size);
        llist.print();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < list_size; i++) {
            llist.deleteLast();
        }
        long t2 = System.currentTimeMillis();
        double total_time_in_secs = (t2-t1)/(1000.0);
        System.out.println("The total running time in seconds is " + total_time_in_secs);
    }
}
