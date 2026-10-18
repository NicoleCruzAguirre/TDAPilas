
package tdapilas;

import pilas.Pila;

public class TDAPilas {

    public static void main(String[] args) {
        Pila <String> pila = new Pila<>();
        
        System.out.println("La pila esta vacia: "+pila.empty());
        
        pila.push("fresa");
        pila.push("coco");
        
        System.out.println("Extraer elemento: "+pila.pop()); 
        
        System.out.println("Elemento de arriba: "+pila.peek());
        
        System.out.println("La pila esta vacia: "+pila.empty());

    }
}
