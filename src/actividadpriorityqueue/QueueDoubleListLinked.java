package actividadpriorityqueue;

public class QueueDoubleListLinked<T> {
    private Node<T> first;
    private Node<T> last;

    public QueueDoubleListLinked(){
        this.first = null;
        this.last = null;

    }

    public boolean IsEmpty(){
        return first == null;
    }

    public void enqueue(T x){
        Node<T> newNode = new Node<>(x);
        if (IsEmpty()){
            first = last = newNode;
        }
        else{
            newNode.prev = last;
            last.next = newNode;
            last = newNode;            
        }

    }

   
    public T front(){
        return first.getdaten();

    }

    
    public T back(){
        return last.getdaten();
    }

    
    public T dequeue(){
        T aux = this.first.getdaten(); 
        this.first = this.first.getnext();  
        if (this.first == null) 
            this.last = null; 

        return aux; 
    }

    


    
}
