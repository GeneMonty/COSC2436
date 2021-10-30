/*

Name: Eugenio Montealegre
Course: COSC 2436
Date: 10/10/21
Assignment Description: A Generic Linked List that adds elements to a list of type int, double, string.

*/
package Week05_06.Submit; // comment out before submit

public class LinkedList<E> {

    // -------------------------------------
    // Create the a Node class to hold data
    // -------------------------------------

    private class Node { // Node class Stores the list eelemnts and accesor

        E element; // List Element
        Node next; // Accesor link

        Node(E el, Node n) {
            element = el;
            next = n;
        }

        Node(E el) {
            element = el;
            next = null;
        }
    }

    // -------------------------------------
    // Create Head and tail nodes
    // -------------------------------------
    private Node first; // "Head" Node " firs element in linkedlist"
    private Node last; // "Tail" node "last element in list"

    // -------------------------------------
    // Constructors
    // -------------------------------------

    public LinkedList() {
        first = null; // init as null
        last = null;
    }

    // -------------------------------------
    // Checks
    // -------------------------------------

    // Check if first element is empty. If empty true, else false
    public boolean isEmpty() {
        return first == null;
    }

    // Check size of the list. Returns an integer.
    public int size() {
        int count = 0;
        Node p = first;

        while (p != null) {
            count++;
            p = p.next; //
        }
        return count;
    }

    // -------------------------------------
    // Add elements to the list
    // -------------------------------------

    // Add elements to the end of the list
    public void add(E e) {
        if (isEmpty()) {
            first = new Node(e);
            last = first;

        } else {
            last.next = new Node(e);
            last = last.next;
        }
    }

    // Add elemento the middle of the list
    public void add(int index, E e) {

        if (index < 0 || index > size()) {
            String messege = String.valueOf(index);
            throw new IndexOutOfBoundsException(messege);
        }

        // Check if the index is at least 0
        if (index == 0) {
            first = new Node(e, first);
            if (last == null) {
                last = first;
            }
            // return;

        }

        // Predecesor
        Node pred = first;
        for (int k = 1; k <= index - 1; k++) {
            pred = pred.next;
        }
        pred.next = new Node(e, pred.next);

        // check if there is a new last element
        if (pred.next.next == null) {
            last = pred.next;
        }
    }

    // -------------------------------------
    // Remove elements
    // -------------------------------------

    public boolean remove(E e) {
        if (isEmpty()) {
            return false;
        }

        // remove the first element in the list
        if (e.equals(first.element)) {
            e = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return true;

        } else {
            // Find the precedesor of the element to removes
            Node pred = first;
            while (pred.next != null && !pred.next.element.equals(e)) {
                pred = pred.next;
            }
            if (pred.next == null) {
                return false;
            }
            pred.next = pred.next.next;

            // check if pred is the last one in
            if (pred.next == null) {
                last = pred;
            }

            return true;
        }
    }

    // -------------------------------------
    // String Builder
    // -------------------------------------
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node p = first;
        while (p != null) {
            sb.append(p.element + "\n");
            p = p.next;
        }
        return sb.toString();
    }

    // -------------------------------------
    // MAIN
    // -------------------------------------
    public static void main(String[] args) {

        // Initialize LinkedLists
        LinkedList<String> sll = new LinkedList<String>(); // String list
        LinkedList<Integer> ill = new LinkedList<Integer>(); // integer list
        LinkedList<Double> dll = new LinkedList<Double>(); // double list

        // Add String element to String List
        sll.add("Alan");
        sll.add("Ellie");
        sll.add("Ian");

        sll.add("Tim");
        sll.add(3, "John");
        sll.add("Lex");

        // Add Integer element
        ill.add(1993);
        ill.add(1, 1997);
        ill.add(2, 2001);

        ill.add(2022);
        ill.add(3, 2015);
        ill.add(4, 2018);

        // Add double elements
        dll.add(357.07);
        dll.add(229.09);
        dll.add(181.17);

        dll.add(652.65);
        dll.add(417.71);

        // Print Lists
        System.out.println("Size of String list: " + sll.size() + "\nMembers of my List: \n");
        System.out.println(sll);

        System.out.println("Size of Integer list: " + ill.size() + "\nMembers of my List: \n");
        System.out.println(ill);

        System.out.println("Size of Double list: " + dll.size() + "\nMembers of my List: \n");
        System.out.println(dll);

    }
}
