package LinkedIntLists;

public class LinkedIntList {
    Node front;

    // private inner class
    private class Node {
        int data;
        Node next;
    }

    public void add(int n) {
        Node newNode = new Node();
        newNode.data = n;
        if (front == null) front = newNode;
        else {
            Node current = front;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    public String toString() {
        if (front == null) return "[]";
        String result = "[";
        Node current = front;
        while (current.next != null) {
            result += current.data + ", ";
            current = current.next;
        }
        return result + current.data + "]";
    }
}
