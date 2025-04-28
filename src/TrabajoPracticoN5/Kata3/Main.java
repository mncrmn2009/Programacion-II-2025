package TrabajoPracticoN5.Kata3;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Agregar cinco productos con diferentes categorías
        inventario.agregarProducto(new Producto("P001", "Smartphone", 1200.00, 8, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P002", "Refrigerador", 2500.00, 3, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P003", "Pan", 1.50, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P004", "Zapatillas", 80.00, 15, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P005", "Tablet", 1000.00, 6, CategoriaProducto.ELECTRONICA));

        // 2. Mostrar total de stock
        System.out.println("📦 Total de stock disponible: " + inventario.obtenerTotalStock());

        // 3. Obtener producto con mayor stock
        System.out.println("\n🔝 Producto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // 4. Filtrar productos por precio entre $1000 y $3000
        System.out.println("\n💰 Productos entre $1000 y $3000:");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000.00, 3000.00)) {
            p.mostrarInfo();
        }

        // 5. Mostrar categorías disponibles con descripciones
        System.out.println("\n📚 Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}

