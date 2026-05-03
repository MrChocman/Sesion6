package actividadpriorityqueue;

public class Node<T> {
    T daten;
    Node<T> next;
    Node<T> prev;

    public Node(T value){
        this.daten = value;
        this.next = null;
        this.prev = null;

    }

    public T getdaten(){return daten;}
    public Node<T> getnext() { return next;}
}
