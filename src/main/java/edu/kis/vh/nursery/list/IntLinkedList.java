package edu.kis.vh.nursery.list;

/**
 * Class representing a singly linked list that stores integer values.
 */
public class IntLinkedList {
    /**
     * The value that informing if list is empty.
     */
    public static final Node EMPTY = null;
    /**
     * Error code returned when an operation fails.
     */
    public static final int ERROR = -1;
    /**
     * Last element of the list.
     */
    private Node last;
    /**
     * @deprecated variable no longer used.
     */
    private int i;

    /**
     * Adds a new integer to the end of the list.
     *
     * @param i The integer to be added.
     */
    public void push(int i) {
        if (last == EMPTY)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if the list is empty
     *
     * @return True if the list is empty, False otherwise.
     */

    public boolean isEmpty() {
        return last == EMPTY;
    }

    /**
     * Checks if the list is full.
     *
     * @return The information if the list is full.
     */

    public boolean isFull() {
        return false;
    }

    /**
     * Return the value of the last integer in the list without removing it.
     *
     * @return The value of the last integer in the list or ERROR if the list is empty.
     */

    public int top() {
        if (isEmpty())
            return ERROR;
        return last.getValue();
    }

    /**
     * Returns the last integer from the list and returns it.
     *
     * @return The removed integer form the list or ERROR if the list is empty.
     */

    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
