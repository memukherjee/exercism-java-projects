import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    private static class Node<T> {
        T value;
        Node<T> next;
        Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node <T> head;
    SimpleLinkedList() {
        head = null;
    }

    SimpleLinkedList(T[] values) {
        for(T e: values) {
            push(e);
        }
    }

    void push(T value) {
        if(head==null){
            head = new Node<T>(value);
            return;
        }
        head = new Node<>(value, head);
    }

    T pop() {
        if(head==null)
            throw new NoSuchElementException();
        T value = head.value;
        head = head.next;
        return value;
    }

    void reverse() {
        if(head==null || head.next==null)
            return;
        Node<T> prevNode=null, currentNode = head;
        while(currentNode != null) {
            Node<T> nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }

    T[] asArray(Class<T> className) {
        int listSize = size();
        @SuppressWarnings("unchecked")
        T[] list = (T[]) Array.newInstance(className,listSize);
        Node<T> iterator = head;
        for(int i=0; i<listSize; i++){
            list[i] = iterator.value;
            iterator = iterator.next;
        }
        return list;
    }

    int size() {
        Node<T> iterator = head;
        int count = 0;
        while(iterator != null) {
            iterator = iterator.next;
            count++;
        }
        return count;
    }
}
