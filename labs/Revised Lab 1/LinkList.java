class LinkList {
    Node llist;
    long size;

    LinkList(long sz) {
        if (sz <= 0) {
            llist = null;
        } else {
            llist = new Node("0", null);
            Node current = llist;
            for (int i = 1; i < sz; ++i) {
                Node node2Add = new Node(Integer.toString(i), null);
                current.setNext(node2Add);
                current = node2Add;
            }
        }
        this.size = sz;
    }

    public void print() {
        if (this.size == 0) {
            System.out.println("Empty Linked List");
        }

        Node current = llist;
        while (current != null) {
            System.out.print((String) current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void deleteFirst() {
        if (llist != null) {
            llist = llist.getNext();
            this.size -= 1;
        }
    }

    public void deleteLast() {
        if (llist == null) return;
        this.size -= 1;
        Node prev = llist;
        Node current = prev.getNext();
        if (current == null) {
            llist = null;
            return;
        }
        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }
        prev.setNext(null);
        return;
    }

    public static void main(String[] args) {
        long list_size = 100000;
        LinkList llist = new LinkList(list_size);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < list_size; i++) {
            llist.deleteLast();
        }
        long t2 = System.currentTimeMillis();
        double total_time_in_secs = (t2-t1)/(1000.0);
        System.out.println("The total running time in seconds is " + total_time_in_secs);
    }
}