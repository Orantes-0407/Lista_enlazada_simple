package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

/**
 * Laboratorio de retos para obligar a extender el codigo base de las estructuras.
 *
 * Cada reto depende de un metodo nuevo que debe implementarse directamente
 * en la clase de estructura correspondiente.
 */
public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        challenge2ReverseInPlace();
        challenge3RemoveDuplicates();
        System.out.println();
    }

    private static void challenge1CountOccurrences() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");

        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        System.out.println("Eventos: " + eventos);
        try {
            int totalLogins = eventos.countOccurrences("LOGIN");
            System.out.println("Resultado esperado para LOGIN: 3");
            System.out.println("Resultado obtenido: " + totalLogins);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
        
        eventos.clean();
        System.out.println("Eventos: " + eventos + " size: " + eventos.size());
        
        System.out.println();
    }

    private static void challenge2ReverseInPlace() {
        SinglyLinkedList<Integer> numbers = new SinglyLinkedList<>();
        numbers.addLast(1);
        numbers.addLast(2);
        numbers.addLast(3);
        numbers.addLast(4);
        numbers.addLast(5);

        System.out.println("Reto 2 - Invertir la lista (in-place)");
        System.out.println("Original: " + numbers);
        try {
            numbers.reverseInPlace();
            System.out.println("Invertida: " + numbers);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }

    private static void challenge3RemoveDuplicates() {
        SinglyLinkedList<String> letters = new SinglyLinkedList<>();
        letters.addLast("A");
        letters.addLast("B");
        letters.addLast("A");
        letters.addLast("C");
        letters.addLast("B");
        letters.addLast("D");

        System.out.println("Reto 3 - Eliminar duplicados");
        System.out.println("Original: " + letters);
        try {
            int removed = letters.removeDuplicates();
            System.out.println("Sin duplicados: " + letters);
            System.out.println("Nodos eliminados: " + removed);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
}