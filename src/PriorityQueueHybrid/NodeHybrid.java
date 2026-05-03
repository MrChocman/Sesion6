package PriorityQueueHybrid;

public class NodeHybrid<E, S extends Comparable <S>>{
    E data;
    S secondary; 
    NodeHybrid<E, S> next;

    public NodeHybrid(E data, S secondary) {
        this.data = data;
        this.secondary = secondary;
        this.next = null;
    }
}
