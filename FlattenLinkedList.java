class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        Node current = head;
        while (current != null) {
            if (current.child == null) {
                current = current.next;
                continue;
            }
            Node temp = current.child;
            while (temp.next != null)
                temp = temp.next;
            temp.next = current.next;  // Connect child tail with current.next, if it is not null
            if (current.next != null) current.next.prev = temp; // if current.next is not null then change the prev of current.next to temp
			// Connect node with current.child, and remove current.child make it null
            current.next = current.child;
            current.child.prev = current;
            current.child = null;
        }
        return head;
    }
}