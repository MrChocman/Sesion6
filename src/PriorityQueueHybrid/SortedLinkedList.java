package PriorityQueueHybrid;

import actividades.ExceptionIsEmpty;

public class SortedLinkedList<E, S extends Comparable<S>> {
    private NodeHybrid<E, S> first;

    public void sortedInsert(E data, S secondary) {
        NodeHybrid<E, S> newNode = new NodeHybrid<>(data, secondary);

        
        if (first == null || secondary.compareTo(first.secondary) < 0) {
            newNode.next = first;
            first = newNode;
        } else {
            
            NodeHybrid<E, S> current = first;
            while (current.next != null && current.next.secondary.compareTo(secondary) <= 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (first == null) throw new ExceptionIsEmpty("Nivel vacío");
        E data = first.data;
        first = first.next;
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
