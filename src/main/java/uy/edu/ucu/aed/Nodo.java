package uy.edu.ucu.aed;

/**
 *
 * @author ernesto
 * @param <T>
 */
public class Nodo<T> {

    private final Comparable etiqueta;
    private T dato;
    private Nodo<T> siguiente = null;

    public Nodo(Comparable etiqueta, T dato ) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }

}
