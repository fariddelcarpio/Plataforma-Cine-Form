package nodos;

public class NVenta {
    private String nombre;
    private String apellido;
    private int dni;
    private String sede;
    private String asiento;
    private String pelicula;
    private String lentes;
    private int cantidad;
    private int precio;
    private double monto;
    private String medioPago;
    private double porcentajeDescuento;
    private double descuento;
    private NVenta siguiente;

    public NVenta(String nombre, String apellido, int dni, String sede, String asiento, String pelicula, String lentes, int cantidad, int precio, double monto, String medioPago, double porcentajeDescuento, double descuento, NVenta siguiente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sede = sede;
        this.asiento = asiento;
        this.pelicula = pelicula;
        this.lentes = lentes;
        this.cantidad = cantidad;
        this.precio = precio;
        this.monto = monto;
        this.medioPago = medioPago;
        this.porcentajeDescuento = porcentajeDescuento;
        this.descuento = descuento;
        this.siguiente = siguiente;
    }

    public NVenta(String nombre, String apellido, int dni, String sede, String asiento, String pelicula, String lentes, int cantidad, int precio, double monto, String medioPago, double porcentajeDescuento, double descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sede = sede;
        this.asiento = asiento;
        this.pelicula = pelicula;
        this.lentes = lentes;
        this.cantidad = cantidad;
        this.precio = precio;
        this.monto = monto;
        this.medioPago = medioPago;
        this.porcentajeDescuento = porcentajeDescuento;
        this.descuento = descuento;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getLentes() {
        return lentes;
    }

    public void setLentes(String lentes) {
        this.lentes = lentes;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public NVenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NVenta siguiente) {
        this.siguiente = siguiente;
    }
}