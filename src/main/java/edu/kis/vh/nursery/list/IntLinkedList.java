package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LIST_PEEK_VALUE = -1;
    private Node lastNode;

    public void push(int value) {
        if (isEmpty()) {
            lastNode = new Node(value);
        } else {
            Node newNode = new Node(value);
            lastNode.setNextNode(newNode);
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }
    }
    
    public int peek() {
        if (isEmpty())
            return EMPTY_LIST_PEEK_VALUE;
        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_PEEK_VALUE;
        int lastNodeValue = lastNode.getValue();
        lastNode = lastNode.getPreviousNode();
        return lastNodeValue;
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

}
