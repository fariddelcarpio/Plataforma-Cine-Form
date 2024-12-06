package clases;

import nodos.NCanchita;
import javax.swing.JOptionPane;

public class LSECanchita {
    private NCanchita inicio,fin;
    
    public LSECanchita() {
        this.inicio = null;
        this.fin = null;
    }
    
    public NCanchita getInicio() {
        return inicio;
    }

    public void setInicio(NCanchita inicio) {
        this.inicio = inicio;
    }

    public NCanchita getFin() {
        return fin;
    }

    public void setFin(NCanchita fin) {
        this.fin = fin;
    }
    
    //Metodo para insertar un nodo al inicio de la lista
    public void insertarIni(int cantidad,String categoria,int precio){
        inicio = new NCanchita(categoria, cantidad, precio, inicio);
        if (fin==null) {
            fin=inicio;
        }
    }
 
    //Metodo para insertar un nodo al final de la lista
    public void insertarFin(int cantidad,String categoria,int precio){
        
        if (inicio==null) {
            inicio=fin=new NCanchita(categoria, cantidad, precio);

        }else{
            fin.setSiguiente(new NCanchita(categoria, cantidad, precio, inicio));
            fin=fin.getSiguiente();
        }
    }
    
    //Metodo para recorrido de la lista o mostrar lista
    public void recorrerLista(int cantidad, String categoria,int precio){
        NCanchita elemento=inicio;
        while(elemento!=null){
            System.out.println(elemento.getCantidad()+"--->");
            System.out.println(elemento.getCategoria()+"--->");
            System.out.println(elemento.getPrecio()+"--->");
            elemento=elemento.getSiguiente();
        }
        System.out.println("");
    }
    
    //metodo para insertar en medio de 2 nodos
    public void insertarMedio(int cantidad, String categoria, int precio, int cantidadAnterior){
        NCanchita nuevoNodo = new NCanchita(categoria, cantidad,precio);
        NCanchita actual=inicio;
        while(actual!=null&&actual.getCantidad()!=cantidadAnterior){
            actual=actual.getSiguiente();
        }
        if (actual!=null) {
            if (actual==fin) {
                insertarFin(cantidad,categoria,precio);
            }else{
                nuevoNodo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nuevoNodo);
            }
        }else{
            System.out.println("Nodo anterior no encontrado");
        }
    }
    
    //Metodo para buscar un nodo
    public void buscar(int cantidad, String categoria,int precio){
        NCanchita elemento=inicio;
        while (elemento != null && (elemento.getCantidad() != cantidad || !elemento.getCategoria().equals(categoria)||elemento.getPrecio() != precio )) {
        elemento = elemento.getSiguiente();
    }
        if (elemento!=null) {
            JOptionPane.showMessageDialog(null, cantidad+" elemento encontrado\n");
        }else{
            JOptionPane.showMessageDialog(null, cantidad+" elemento no encontrado\n");
        }
    }
    
    //Metodo para eliminar el nodo del inicio
    public void eliminarIni(int cantidad){
        NCanchita tem=inicio;
        int eli=tem.getCantidad();
        if (inicio==fin) {
            inicio=null;
            fin=null;
        }else{
            inicio=tem.getSiguiente();
            System.out.println("el elemento eliminado es---> "+eli);
        }
    }
    
    //Metodo para eliminar el nodo del final
    public void eliminarFin(int cantidad){
        NCanchita tem=fin;
        int eli=tem.getCantidad();
        if (inicio==fin) {
            inicio=null;
            fin=null;
        }else{
            NCanchita temIni=inicio;
            while(temIni.getSiguiente()!=fin){
                temIni=temIni.getSiguiente();
            }
            fin=temIni;
            fin.setSiguiente(null);
            System.out.println("el elemento eliminado es: "+eli);
        }
    }
    
    //Metodo para eliminar un nodo del medio
    public void eliminarMedio(int cantidad){
       if(inicio!=null){
           if(inicio==fin && inicio.getCantidad()==cantidad){
               inicio=null;
               fin=null;
           }
           else if (inicio.getCantidad()==cantidad) {
               inicio=inicio.getSiguiente();
           }
           else{
                NCanchita anterior;
                NCanchita tem;
               anterior=inicio;
               tem=inicio.getSiguiente();
               while(tem!=null&&tem.getCantidad()!=cantidad){
                   anterior=anterior.getSiguiente();
                   tem=tem.getSiguiente();
               }
               if (tem!=null) {
                  anterior.setSiguiente(tem.getSiguiente());
                   if (tem==fin) {
                       fin=anterior;
                   }
               }
           }
       }
    }
    
    //Metodo ordenar
    public void ordenar(int cantidad){
            NCanchita actual=inicio;
        int temp;
        while(actual!=null){
            NCanchita siguiente=actual.getSiguiente();
            while(siguiente!=null){
                if (actual.getCantidad()>siguiente.getCantidad()) {
                    temp=actual.getCantidad();
                    actual.setCantidad(siguiente.getCantidad());
                    siguiente.setCantidad(temp);
                }
                siguiente=siguiente.getSiguiente();
            }
            actual=actual.getSiguiente();
        }   
    }
}
