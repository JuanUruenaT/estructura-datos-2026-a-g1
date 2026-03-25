import java.util.Scanner;

class Nodo {
    String nombre;
    Nodo siguiente;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Nodo cabeza = null;
        Nodo actual = null;

        // Ingreso de datos
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite el nombre del estudiante " + i + ": ");
            String nombre = sc.nextLine();

            Nodo nuevo = new Nodo(nombre);

            if (cabeza == null) {
                cabeza = nuevo;
                actual = nuevo;
            } else {
                actual.siguiente = nuevo;
                actual = nuevo;
            }
        }

        // Mostrar tabla
        System.out.println("\nLISTA DE ESTUDIANTES");
        System.out.println("----------------------------------------");
        System.out.println("No.\tNombre\t\tSiguiente");
        System.out.println("----------------------------------------");

        Nodo temp = cabeza;
        int i = 1;

        while (temp != null) {
            String sig = (temp.siguiente != null) ? temp.siguiente.nombre : "null";
            System.out.println(i + "\t" + temp.nombre + "\t\t" + sig);
            temp = temp.siguiente;
            i++;
        }

        System.out.println("----------------------------------------");

        // NUEVA EXPLICACIÓN
        System.out.println("\n¿Por qué es una estructura dinámica?");
        System.out.println("Se dice que una lista enlazada es una estructura dinámica porque la memoria se asigna durante la ejecución del programa y no antes.");
        System.out.println("Esto significa que los elementos no están almacenados en posiciones contiguas, sino que cada nodo se crea de manera independiente.");
        System.out.println("Gracias a esto, es posible agregar o eliminar nodos sin limitarse a un tamaño fijo.");
        System.out.println("Además, los enlaces entre nodos permiten reorganizar la estructura sin necesidad de desplazar datos.");
        System.out.println("Por ello, es una estructura flexible y adaptable.");

        sc.close();
    }
}