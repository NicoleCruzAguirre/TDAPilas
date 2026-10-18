
package pilas;

public class Nodo <T> {
    T dato;
    Nodo<T> sig;
    
    public Nodo(T dato){
        this.dato = dato;
        this.sig = null;
    }
    
}
