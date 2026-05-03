package actividades;

public class PriorityQueueLinkSort<E,N extends Comparable<N>> implements PriorityQueue<E, N>  {
    class EntryNode { 
        E data; 
        N priority;
        EntryNode(E data, N priority) { 
            this.data = data; 
            this.priority = priority; 
        } 
    } 

    private Node<EntryNode> first; 
    private Node<EntryNode> last; 

    public PriorityQueueLinkSort() { 
        this.first = null; 
        this.last = null; 
    } 

    @Override
    public void enqueue(E x, N pr) { 
        Node<EntryNode> newNode = new Node<>(new EntryNode(x, pr));

        
        if (isEmpty()) {
            this.first = newNode;
            this.last = newNode;
            return;
        }

        
        if (pr.compareTo(this.first.getData().priority) > 0) {
            newNode.setNext(this.first);
            this.first = newNode;
        } else {
            // Buscar la posición correcta en medio o al final
            Node<EntryNode> current = this.first;
            while (current.getNext() != null && 
                current.getNext().getData().priority.compareTo(pr) >= 0) {
                current = current.getNext();
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);

            // Si se insertó al final, actualizamos 'last'
            if (newNode.getNext() == null) {
                this.last = newNode;
            }
        }
    } 

    @Override
    public E dequeue() throws ExceptionIsEmpty { 
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty");}

        E aux = this.first.getData().data; 
        this.first = this.first.getNext();  
        if (this.first == null) 
            this.last = null; 

        return aux; 
    } 
    
    @Override
    public E front() throws ExceptionIsEmpty { 
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty");
        }
        return this.first.getData().data;
    } 

    @Override
    public E back() throws ExceptionIsEmpty { 
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty");
        }
        return this.last.getData().data;
    } 

    @Override
    public boolean isEmpty() { 
        return this.first == null;
    } 

    @Override
    public String toString() { 
        if (isEmpty()) return "[]";
        
        StringBuilder sb = new StringBuilder("[ ");
        Node<EntryNode> current = this.first;
        while (current != null) {
            sb.append(current.getData().toString());
            if (current.getNext() != null) sb.append(" -> ");
            current = current.getNext();
        }
        sb.append(" ]");
        return sb.toString();
    }
    
    
}



