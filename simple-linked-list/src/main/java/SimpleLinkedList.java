import java.lang.reflect.Array;
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
        for(T value: values) {
            push(value);
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
        T poppedValue = head.value;
        head = head.next;
        return poppedValue;
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
        T[] arrayRepresentation = (T[]) Array.newInstance(className,listSize);
        Node<T> iterator = head;
        for(int index=0; index<listSize; index++){
            arrayRepresentation[index] = iterator.value;
            iterator = iterator.next;
        }
        return arrayRepresentation;
    }

    int size() {
        Node<T> iterator = head;
        int countOfNodes = 0;
        while(iterator != null) {
            iterator = iterator.next;
            countOfNodes++;
        }
        return countOfNodes;
    }
}
