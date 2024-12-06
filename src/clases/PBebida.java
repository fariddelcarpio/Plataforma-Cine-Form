package clases;

import nodos.NBebida;

public class PBebida{
    private int nElementos;
    private NBebida inicio,fin;
    
    public PBebida(){
        this.nElementos = 0;
        this.inicio=null;
        this.fin=null;
    }
    
    public int getNelementos(){
        return nElementos;
    }
    
    public void setNelementos(int nElementos){
        this.nElementos=nElementos;
    }
    
    public NBebida getInicio(){
        return inicio;
    }
    
    public void setInicio(NBebida inicio){
        this.inicio=inicio;
    }
    
    public NBebida getFin(){
        return fin;
    }
    public void setFin(NBebida fin){
        this.fin=fin;
    }
    
    public void insertarPila(String categoria, int cantidad, int precio){
        NBebida nuevo=new NBebida(categoria, cantidad, precio, inicio);
        nuevo.setSiguiente(inicio);
        inicio=nuevo;
        nElementos++;
    }
    
    public void eliminarPila(int cantidad){
        int elemento=0;
        if (inicio!=null) {
            elemento=inicio.getCantidad();
            System.out.println("elemento eliminado-->"+elemento);
            inicio=inicio.getSiguiente();
            nElementos--;
        }else{
            System.out.println("pila vacia");
        }
    }
    
    public void mostrar(int cantidad, String categoria,int precio){
        NBebida elemento=inicio;
        while(elemento!=null){
            System.out.println(elemento.getCantidad());
            elemento=elemento.getSiguiente();
        }
    }
   
    /*
    public void contarElementos(){
        NodoBebidas conteo=inicio;
        int contador=0;
        while(conteo!=null){
            contador++;
            conteo=conteo.getSig();
        }
        System.out.println("total de elementos: "+contador);
    }
    
    public void verificarVacia(){
        if (inicio==null) {
            System.out.println("la pila esta vacia");
        }else{
            System.out.println("la pila no esta vacia");
        }
    }
    public void valorMin(){
        if (inicio==null) {
            System.out.println("la lista esta vacia");
        }else{
            int min=inicio.getCantidad();
            NodoBebidas actual=inicio.getSig();
            while(actual!=null){
                if (actual.getCantidad()<min) {
                    min=actual.getCantidad();
                }
                actual=actual.getSig();
            }
            System.out.println("el valor min es: "+min);
        }
    }
    
    */
}