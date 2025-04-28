package TrabajoPracticoN5.Kata2;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();


        inventario.agregarProducto(new Producto("P001", "Laptop", 1000.00, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P002", "Pan", 1.00, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P003", "Sofá", 350.00, 2, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P004", "Jeans", 30.00, 20, CategoriaProducto.ROPA));


        System.out.println("Buscar producto con ID 'P001':");
        Producto buscado = inventario.buscarProductoPorId("P001");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }


        System.out.println("Filtrar productos por categoría ELECTRONICA:");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA)) {
            p.mostrarInfo();
        }
        inventario.eliminarProducto("P004");

        System.out.println("📋 Productos restantes en inventario:");
        inventario.listarProductos();
    }
}

