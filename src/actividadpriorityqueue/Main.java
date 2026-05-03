package actividadpriorityqueue;

public class Main {
    public static void main(String[] args) {
        Queues<String> pq = new Queues<>(3);

        pq.enqueue("A", 0);
        pq.enqueue("B", 2);
        pq.enqueue("C", 1);
        pq.enqueue("D", 2);

        System.out.println("Extrayendo daten de por prioridad");

        try {
            while (!pq.IsEmptyList()){
                System.out.print(pq.dequeue() + " ");
            };


        } catch (Exception e) {

            System.out.println(e);
        }

    }
}
