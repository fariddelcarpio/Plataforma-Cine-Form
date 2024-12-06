package clases;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import nodos.NPelicula;

public class ABBPelicula {
    private NPelicula raiz;

    public ABBPelicula() {
        this.raiz = null;
    }

    public NPelicula getRaiz() {
        return raiz;
    }

    public void setRaiz(NPelicula raiz) {
        this.raiz = raiz;
    }
    
    // Método para agregar una película al árbol
    public void agregar(String titulo, int id, String director, String valoracion) {
        if (raiz == null) {
            raiz = new NPelicula(titulo, id, director, valoracion);
        } else {
            agregarRecursivo(raiz, titulo, id, director, valoracion);
        }
    }

    private void agregarRecursivo(NPelicula nodo, String titulo, int id, String director, String valoracion) {
        if (id < nodo.getId()) {
            if (nodo.getIzquierda() == null) {
                nodo.setIzquierda(new NPelicula(titulo, id, director, valoracion));
            } else {
                agregarRecursivo(nodo.getIzquierda(), titulo, id, director, valoracion);
            }
        } else {
            if (nodo.getDerecha() == null) {
                nodo.setDerecha(new NPelicula(titulo, id, director, valoracion));
            } else {
                agregarRecursivo(nodo.getDerecha(), titulo, id, director, valoracion);
            }
        }
    }

    // Método para buscar una película y mostrar sus datos en la tabla
    public void buscarYMostrar(int id, JTable tabla) {
        NPelicula nodoEncontrado = buscarRecursivo(raiz, id);

        // Crear el modelo de la tabla
        String[] columnas = {"Título", "ID", "Director", "Valoración"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tabla.setModel(modelo);

        // Si se encuentra el nodo, agregarlo a la tabla
        if (nodoEncontrado != null) {
            modelo.addRow(new Object[]{
                nodoEncontrado.getTitulo(),
                nodoEncontrado.getId(),
                nodoEncontrado.getDirector(),
                nodoEncontrado.getValoracion()
            });
        } else {
            // Si no se encuentra, mostrar mensaje de error en la tabla
            modelo.addRow(new Object[]{"No encontrado", "-", "-", "-"});
        }
    }

    // Método recursivo para buscar un nodo por ID
    private NPelicula buscarRecursivo(NPelicula nodo, int id) {
        if (nodo == null || nodo.getId() == id) {
            return nodo;
        }
        if (id < nodo.getId()) {
            return buscarRecursivo(nodo.getIzquierda(), id);
        }
        return buscarRecursivo(nodo.getDerecha(), id);
    }
    
    // Métodos de recorrido
    public void recorrerPreorden(NPelicula nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            modelo.addRow(new Object[]{nodo.getTitulo(), nodo.getId(), nodo.getDirector(), nodo.getValoracion()});
            recorrerPreorden(nodo.getIzquierda(), modelo);
            recorrerPreorden(nodo.getDerecha(), modelo);
        }
    }

    public void recorrerInorden(NPelicula nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            recorrerInorden(nodo.getIzquierda(), modelo);
            modelo.addRow(new Object[]{nodo.getTitulo(), nodo.getId(), nodo.getDirector(), nodo.getValoracion()});
            recorrerInorden(nodo.getDerecha(), modelo);
        }
    }

    public void recorrerPostorden(NPelicula nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            recorrerPostorden(nodo.getIzquierda(), modelo);
            recorrerPostorden(nodo.getDerecha(), modelo);
            modelo.addRow(new Object[]{nodo.getTitulo(), nodo.getId(), nodo.getDirector(), nodo.getValoracion()});
        }
    }

    // Método para eliminar una película dado su Id
    public NPelicula eliminar(int id) {
        return eliminarRecursivo(raiz, id);
    }

    // Método recursivo para eliminar un nodo dado su ID
    private NPelicula eliminarRecursivo(NPelicula nodo, int id) {
        // Caso base: Si el nodo es nulo, no se puede eliminar nada
        if (nodo == null) {
            return null;
        }

        // Si el ID a eliminar es menor que el nodo actual, buscar en el subárbol izquierdo
        if (id < nodo.getId()) {
            nodo.setIzquierda(eliminarRecursivo(nodo.getIzquierda(), id));
        }
        // Si el ID a eliminar es mayor que el nodo actual, buscar en el subárbol derecho
        else if (id > nodo.getId()) {
            nodo.setDerecha(eliminarRecursivo(nodo.getDerecha(), id));
        }
        // Si el ID es igual al nodo actual, es el nodo que debemos eliminar
        else {
            // Caso 1: El nodo no tiene hijos (nodo hoja)
            if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {
                return null;
            }
            // Caso 2: El nodo tiene un solo hijo
            else if (nodo.getIzquierda() == null) {
                return nodo.getDerecha(); // Reemplazar el nodo con su hijo derecho
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda(); // Reemplazar el nodo con su hijo izquierdo
            }
            // Caso 3: El nodo tiene dos hijos
            else {
                // Encontrar el sucesor inorden (el mínimo nodo en el subárbol derecho)
                NPelicula sucesor = obtenerMinimo(nodo.getDerecha());

                // Reemplazar los valores del nodo con el sucesor
                nodo.setId(sucesor.getId());
                nodo.setTitulo(sucesor.getTitulo());
                nodo.setDirector(sucesor.getDirector());
                nodo.setValoracion(sucesor.getValoracion());

                // Eliminar el sucesor del subárbol derecho
                nodo.setDerecha(eliminarRecursivo(nodo.getDerecha(), sucesor.getId()));
            }
        }
        return nodo;
    }

    // Método para encontrar el nodo con el valor mínimo en un subárbol
    private NPelicula obtenerMinimo(NPelicula nodo) {
        while (nodo.getIzquierda() != null) {
            nodo = nodo.getIzquierda();
        }
        return nodo;
    }
    
    // Método para actualizar la valoración de una película por su ID
    public void actualizarValoracion(int id, String nuevaValoracion) {
        // Buscamos el nodo con el ID especificado
        NPelicula nodo = buscar(id);
    
        // Si el nodo se encuentra, actualizamos la valoración
        if (nodo != null) {
        nodo.setValoracion(nuevaValoracion);
        }
    }

    // Método para buscar una película por su ID
    public NPelicula buscar(int id) {
        return buscarRecursivo(raiz, id);
    }
}