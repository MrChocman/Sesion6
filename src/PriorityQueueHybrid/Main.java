package PriorityQueueHybrid;

public class Main{
    public static void main(String[] args) {
        PriorityQueueHybrid<String, Integer> pq = new PriorityQueueHybrid<>(3);

        System.out.println("--- Cargando datos al sistema Híbrido ---");

        pq.enqueue("A", 2, 5); // Nivel 2, peso 5
        pq.enqueue("B", 2, 1); // Nivel 2, peso 1 (el más bajo, debe ir primero)
        pq.enqueue("C", 1, 3); // Nivel 1, peso 3
        pq.enqueue("D", 2, 3); // Nivel 2, peso 3 (va entre B y A)

        System.out.println("Extrayendo elementos (Jerarquía + Orden Secundario):");

        try {
        
            while (true) {
                
                String tarea = pq.dequeue();
                System.out.println("Procesando: " + tarea);
            }
        } catch (Exception e) {
            
            System.out.println("\n>>> " + e.getMessage());
        }

    }
}


