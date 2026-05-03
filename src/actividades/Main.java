package actividades;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> pq = new PriorityQueueLinkSort<>();
        pq.enqueue("Tarea de Redes", 1);
        pq.enqueue("Tarea de Algoritmia", 3);
        pq.enqueue("Tarea de SIA", 2);

        try {
            System.out.println("Frente: " + pq.front());
            System.out.println("Final: "+ pq.back());
            System.out.println("Sacando de la cola elemento: " + pq.dequeue());
            
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
