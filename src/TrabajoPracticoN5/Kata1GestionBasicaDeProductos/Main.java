package TrabajoPracticoN5.Kata1GestionBasicaDeProductos;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear productos
        Producto producto1 = new Producto("P001", "Leche", 1.50, 20, CategoriaProducto.ALIMENTOS);
        Producto producto2 = new Producto("P002", "Celular", 300.00, 10, CategoriaProducto.ELECTRONICA);
        Producto producto3 = new Producto("P003", "Camiseta", 15.00, 50, CategoriaProducto.ROPA);

        // Agregar productos al inventario
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);

        // Listar productos
        System.out.println("Inventario de Productos:");
        inventario.listarProductos();
    }
}

