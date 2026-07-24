public class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    int size;
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        head = new ListNode(0);
        tail = new ListNode(0);
        size = 0;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        ListNode curr;
        if (index < size / 2) {
            curr = head;
            for (int i = 0; i <= index; i++) {
                curr = curr.next;
            }
        } else {
            curr = tail.prev;
            for (int i = 0; i < size - 1 - index; i++) {
                curr = curr.prev;
            }
        }
        // int i=0;
        // while(i<index){
        //     curr=curr.next;
        //     i++;
        // }
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
        size++;

    }

    public void addAtIndex(int index, int val) {
        if (index < 0)
            index = 0;
        if (index > size)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        ListNode curr ;
        size++;
        if (index < size / 2) {
            curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
        } else {
            curr = tail.prev;
            for (int i = 0; i < size - 1 - index; i++) {
                curr = curr.prev;
            }
        }

        ListNode newnode = new ListNode(val);
        // newnode.next = curr.next;
        // newnode.prev=curr.next.prev;
        // curr.next = newnode;
        newnode.next = curr.next;
        newnode.prev = curr;
        curr.next.prev = newnode;
        curr.next = newnode;
    }

    public void deleteAtIndex(int index) {
       if (index < 0 || index >= size) return;

        // Find target node to delete
        ListNode curr;
        if (index < size / 2) {
            curr = head.next;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
        } else {
            curr = tail.prev;
            for (int i = 0; i < size - 1 - index; i++) {
                curr = curr.prev;
            }
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */