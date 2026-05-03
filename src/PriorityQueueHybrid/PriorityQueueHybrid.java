package PriorityQueueHybrid;

import actividades.ExceptionIsEmpty;
import java.util.ArrayList;

public class PriorityQueueHybrid <E,S extends Comparable<S>> {
    private ArrayList<SortedLinkedList<E, S>> levels;
    private int n;

    public PriorityQueueHybrid(int n) {
        this.n = n;
        this.levels = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            this.levels.add(new SortedLinkedList<E, S>());
        }
    }

    public void enqueue(E data, int priority, S secondary) {
        if (priority >= 0 && priority < n) {
            this.levels.get(priority).sortedInsert(data, secondary);
        }
    }

    public E dequeue() throws ExceptionIsEmpty {
        for (int i = n - 1; i >= 0; i--) {
            if (!this.levels.get(i).isEmpty()) {
                return this.levels.get(i).dequeue();
            }
        }
        throw new ExceptionIsEmpty("El sistema está vacío");
    }
}
