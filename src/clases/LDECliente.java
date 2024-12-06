package clases;

import nodos.NCliente;

public class LDECliente {
    private NCliente inicio,fin;
    
    public LDECliente(){
        this.inicio = null;
        this.fin = null;
    }

    public NCliente getInicio() {
        return inicio;
    }

    public void setInicio(NCliente inicio) {
        this.inicio = inicio;
    }

    public NCliente getFin() {
        return fin;
    }

    public void setFin(NCliente fin) {
        this.fin = fin;
    }
    
    //Metodo para insertar al inicio
    public void insertarIni(String apellido,String sexo,String nombre,String telefono,String correo,String edad){
        NCliente nuevo=new NCliente(apellido,sexo,nombre,telefono, correo, edad);
        if (inicio==null) {
            inicio=fin=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }
    
    //Metodo para insertar al medio
    public void insertarAntesDeX(String apellido, String nombre, String sexo,String telefono,String correo,String edad, String X) {
    if (inicio == null) {
        System.out.println("La lista está vacía");
        return;
    }
    NCliente elemento = inicio;
    // Buscar nodo con el código X
    while (elemento != null && !elemento.getNombre().equals(X)) {
        elemento = elemento.getSiguiente();
    }
    if (elemento == null) {
        System.out.println("El valor " +X+ " no está en la lista");
        return;
    }
    NCliente nuevo = new NCliente(apellido, nombre, sexo,telefono,correo,edad);
    if (elemento == inicio) {
        nuevo.setSiguiente(inicio);
        inicio.setAnterior(nuevo);
        inicio = nuevo; 
    } else {
        NCliente anterior = elemento.getAnterior();
        anterior.setSiguiente(nuevo);
        nuevo.setAnterior(anterior);
        nuevo.setSiguiente(elemento);
        elemento.setAnterior(nuevo);
    }
    System.out.println("Insertado "+nombre+ "antes de " +X);
}

    
    //Metodo para insertar fin met2
    public void insertarFinal(String apellido,String sexo,String nombre,String telefono,String correo,String edad){
        NCliente nuevo=new NCliente(apellido,sexo,nombre,telefono,correo,edad);
        if (inicio==null) {
            inicio=fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin=nuevo;
        }
    }
    //Metodo para buscar 
    public void buscar(String apellido,String sexo,String nombre,String telefono,String correo,String edad){
        NCliente elemento=inicio;
        int busqueda=0;
        while(elemento!=null && !elemento.getApellido().equals(busqueda)&& !elemento.getNombre().equals(busqueda)&& !elemento.getTelefono().equals(busqueda)&&
                !elemento.getCorreo().equals(busqueda)&& !elemento.getEdad().equals(busqueda)&& !elemento.getSexo().equals(busqueda)){
            elemento=elemento.getSiguiente();
        }  
        if (elemento!=null) {
            System.out.println("elemento encontrado");
        }else{
            System.out.println("elemento no encontrado");
        }
    }

    //Metodo para recorrer hacia delante
    public void mostrarListaAdelante(){
        NCliente elemento=inicio;
        while(elemento!=null){
            System.out.println(elemento.getNombre()+"<--->");
            System.out.println(elemento.getApellido()+"<--->");
            System.out.println(elemento.getSexo()+"<--->");
            System.out.println(elemento.getCorreo()+"<--->");
            System.out.println(elemento.getEdad()+"<--->");
            System.out.println(elemento.getTelefono()+"<--->");
            elemento=elemento.getSiguiente();
        }
        System.out.println();
    }
    //Metodo para recorrer hacia atras
    public void mostrarListaAtras(){
        NCliente elemento=fin;
        while(elemento!=null){
            System.out.println(elemento.getNombre()+"<--->");
            System.out.println(elemento.getApellido()+"<--->");
            System.out.println(elemento.getSexo()+"<--->");
            System.out.println(elemento.getCorreo()+"<--->");
            System.out.println(elemento.getEdad()+"<--->");
            System.out.println(elemento.getTelefono()+"<--->");
            elemento=elemento.getAnterior();
        }
        System.out.println();
    }
    //Metodo para eliminar inicio
    public void eliminarIni(){
        if (inicio==null) {
            System.out.println("la lista esta vacia");
            return;
        }
        if (inicio==fin) {
            inicio=null;
            fin=null;
        }else{
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
        System.out.println("Nodo eliminado al inicio");
    }
    //Metodo para eliminar fin
    public void eliminarFin(){
        if (fin==null) {
            System.out.println("la lista esta vacia");
            return;
        }
        if (inicio == fin) {
            inicio =null;
            fin=null;
        }else{
            fin = fin.getAnterior();
            fin.setSiguiente(null);
        }
        System.out.println("Nodo eliminado al final");
    } 
    // Método para eliminar medio
    public void eliminarMedio(String busqueda) {
        if (inicio != null) {

            if(inicio == fin && (inicio.getApellido().equals(busqueda) || 
                                  inicio.getNombre().equals(busqueda) ||
                                  inicio.getTelefono().equals(busqueda) ||
                                  inicio.getCorreo().equals(busqueda) ||
                                  inicio.getEdad().equals(busqueda) ||
                                  inicio.getSexo().equals(busqueda))) {
                inicio = null;
                fin = null;
            } else 
                if(inicio.getApellido().equals(busqueda) || 
                       inicio.getNombre().equals(busqueda) ||
                       inicio.getTelefono().equals(busqueda) ||
                       inicio.getCorreo().equals(busqueda) ||
                       inicio.getEdad().equals(busqueda) ||
                       inicio.getSexo().equals(busqueda)) {
                inicio = inicio.getSiguiente();
                if(inicio != null) {
                    inicio.setAnterior(null);
                }
            }else{
                NCliente anterior =inicio;
                NCliente tem =inicio.getSiguiente();
                while (tem !=null && 
                       !tem.getApellido().equals(busqueda) && 
                       !tem.getNombre().equals(busqueda) &&
                       !tem.getTelefono().equals(busqueda) &&
                       !tem.getCorreo().equals(busqueda) &&
                       !tem.getEdad().equals(busqueda) &&
                       !tem.getSexo().equals(busqueda)) {
                    anterior = anterior.getSiguiente();
                    tem= tem.getSiguiente();
                }
                if(tem != null) {
                    anterior.setSiguiente(tem.getSiguiente());
                    if(tem.getSiguiente() !=null) {
                        tem.getSiguiente().setAnterior(anterior);
                    }
                    if(tem==fin) {
                        fin=anterior;
                    }
                }
            }
        }
    }
}