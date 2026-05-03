package actividadpriorityqueue;

import actividades.ExceptionIsEmpty;
import java.util.ArrayList;

public class Queues <T> {
    private ArrayList<QueueDoubleListLinked<T>> queues;
    private int levels;

    public Queues(int levels){
        this.levels = levels;
        this.queues = new ArrayList<>(levels);

        for (int i = 0; i < levels; i++){
            this.queues.add(new QueueDoubleListLinked<>());
        }

    }

    public boolean IsEmptyList(){
        for (int i = 0; i < levels; i++) {
            if (!this.queues.get(i).IsEmpty()) {
                return false; 
            }
        }
        return true;
    }

    public void enqueue(T x, int pos){
        if (pos < 0 || pos >= levels){
            System.out.println("No existe nivel de prioridad");
            return;
        }

        this.queues.get(pos).enqueue(x);

    }

    public T dequeue() throws ExceptionIsEmpty {
        for (int i = levels - 1; i>=0; i--){
            if(!this.queues.get(i).IsEmpty()){
                return this.queues.get(i).dequeue();
            }
        }
        throw new ExceptionIsEmpty("El sistema esta vacio");
    }

    
}
