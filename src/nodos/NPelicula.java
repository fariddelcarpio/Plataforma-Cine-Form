package nodos;

public class NPelicula {
    private String titulo;
    private int id;
    private String director;
    private String valoracion;
    private NPelicula izquierda;
    private NPelicula derecha;

    public NPelicula(String titulo, int id, String director, String valoracion) {
        this.titulo = titulo;
        this.id = id;
        this.director = director;
        this.valoracion = valoracion;
        this.izquierda = null;
        this.derecha = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public NPelicula getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NPelicula izquierda) {
        this.izquierda = izquierda;
    }

    public NPelicula getDerecha() {
        return derecha;
    }

    public void setDerecha(NPelicula derecha) {
        this.derecha = derecha;
    }
}