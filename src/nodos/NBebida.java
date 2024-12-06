package nodos;

public class NBebida {
    private String categoria;
    private int cantidad;
    private int precio;
    private NBebida siguiente;

    public NBebida(String categoria, int cantidad, int precio, NBebida siguiente) {
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.siguiente = siguiente;
    }

    public NBebida(String categoria, int cantidad, int precio) {
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.siguiente = null;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public NBebida getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NBebida siguiente) {
        this.siguiente = siguiente;
    }
}