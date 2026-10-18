
package pilas;

public class Pila <T> {
    
    private Nodo<T> cima;
    private int nElementos;
    
    public Pila(){
        cima = null;
        nElementos= 0;
    }
       
    public void push(T elemento){
        Nodo<T> nodoNuevo = new Nodo<>(elemento);
        nodoNuevo.sig = cima;
        cima = nodoNuevo;
        
        nElementos++;
    }
    
    public T pop(){
        if (empty()) {
            throw new RuntimeException("Pila vacia.");   
        }
        T elemExtraido = cima.dato;
        cima = cima.sig;
        nElementos--;       
        return elemExtraido;
    }
    
    public T peek(){
        
        if (empty()) {
            throw new RuntimeException("Pila vacia.");
            
        }
        return cima.dato;
    }
    
    public boolean empty(){
        return nElementos == 0;
    }
    
}
