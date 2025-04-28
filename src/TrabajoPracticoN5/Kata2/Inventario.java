package TrabajoPracticoN5.Kata2;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        int i = 0;
        while (i < productos.size() && productoEncontrado == null) {
            Producto producto = this.productos.get(i);
            if (producto.getId().equalsIgnoreCase(id)) {
                productoEncontrado = producto;
            }
            i++;
        }
        return productoEncontrado;
    }


    public Producto eliminarProducto (String id){
        Producto borrado = null;
        int i = 0;
        while (i < productos.size() && borrado == null){
            borrado = this.productos.remove(i);
            i++;
        }
        return borrado;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
}

