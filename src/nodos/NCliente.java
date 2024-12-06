package nodos;

public class NCliente {
    private String nombre;
    private String apellido;
    private String sexo;
    private String edad;
    private String telefono;
    private String correo;
    private NCliente anterior;
    private NCliente siguiente;

    public NCliente(String nombre, String apellido, String sexo, String edad, String telefono, String correo, NCliente anterior, NCliente siguiente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    
    public NCliente(String nombre, String apellido, String sexo, String edad, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.siguiente = null;
        this.anterior = null;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public NCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NCliente siguiente) {
        this.siguiente = siguiente;
    }

    public NCliente getAnterior() {
        return anterior;
    }

    public void setAnterior(NCliente anterior) {
        this.anterior = anterior;
    }
}