package clases;

import nodos.NVenta;

public class CVenta {
    private NVenta inicio,fin;
    private int nElementos;

    public CVenta() {
        this.inicio = null;
        this.fin = null;
        this.nElementos = 0;
    }

    public NVenta getInicio() {
        return inicio;
    }

    public void setInicio(NVenta inicio) {
        this.inicio = inicio;
    }

    public NVenta getFin() {
        return fin;
    }

    public void setFin(NVenta fin) {
        this.fin = fin;
    }

    public int getnElementos() {
        return nElementos;
    }

    public void setnElementos(int nElementos) {
        this.nElementos = nElementos;
    }
    
    //Metodo para insertar cola
    public void insertarCola(String nombre, String apellido, int dni, String sede, String asiento, String pelicula, String lentes, int cantidad, int precio, double monto, String medioPago, double porcentajeDescuento, double descuento){
        NVenta nuevo=new NVenta(nombre, apellido, dni, sede, asiento, pelicula, lentes, cantidad, precio, monto, medioPago, porcentajeDescuento, descuento);
        if (inicio==null) {
            inicio=fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=fin.getSiguiente();
        }
        nElementos++;
    }
    
    //Metodo para quitar de la cola
    public void quitarCola(){
        String nombre="";
        String apellido="";
        int dni=0;
        String pelicula="";
        String sede="";
        String asiento="";
        int cantidad=0;
        String lentes="";
        int precio=0;
        double monto=0;
        String medioPago="";
        double porcentajeDescuento=0;
        double descuento=0;
        
        if (inicio!=null) {
            nombre=inicio.getNombre();
            apellido=inicio.getApellido();
            dni=inicio.getDni();
            pelicula=inicio.getPelicula();
            sede=inicio.getSede();
            asiento=inicio.getAsiento();
            cantidad=inicio.getCantidad();
            lentes=inicio.getLentes();
            precio=inicio.getPrecio();
            monto=inicio.getMonto();
            medioPago=inicio.getMedioPago();
            porcentajeDescuento=inicio.getPorcentajeDescuento();
            descuento=inicio.getDescuento();
            inicio=inicio.getSiguiente();
            nElementos++;
        }
        System.out.println("elemento eliminado"+nombre);
        System.out.println("elemento eliminado"+apellido);
        System.out.println("elemento eliminado"+dni);
        System.out.println("elemento eliminado"+pelicula);
        System.out.println("elemento eliminado"+sede);
        System.out.println("elemento eliminado"+asiento);
        System.out.println("elemento eliminado"+cantidad);
        System.out.println("elemento eliminado"+lentes);
        System.out.println("elemento eliminado"+precio);
        System.out.println("elemento eliminado"+monto);
        System.out.println("elemento eliminado"+medioPago);
        System.out.println("elemento eliminado"+porcentajeDescuento);
        System.out.println("elemento eliminado"+descuento);
    }
    
    //Metodo para mostrar cola
    public void mostrarLista(){
        NVenta elemento= inicio;
        while(elemento!= null){
        System.out.print(elemento.getNombre() + "--> ");
        System.out.print(elemento.getApellido() + "--> ");
        System.out.print(elemento.getDni() + "--> ");
        System.out.print(elemento.getPelicula() + "--> ");
        System.out.print(elemento.getSede() + "--> ");
        System.out.print(elemento.getAsiento() + "--> ");
        System.out.print(elemento.getCantidad() + "--> ");
        System.out.print(elemento.getLentes() + "--> ");
        System.out.print(elemento.getPrecio() + "--> ");
        System.out.print(elemento.getMonto() + "--> ");
        System.out.print(elemento.getMedioPago() + "--> ");
        System.out.print(elemento.getPorcentajeDescuento() + "--> ");
        System.out.print(elemento.getDescuento() + "--> ");
        
            
            elemento= elemento.getSiguiente();
            
        }
        System.out.println("");
    }
    
}