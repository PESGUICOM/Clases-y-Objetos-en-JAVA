package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");

        var producto1 = new Producto("Blusa", 30.00);
        var producto2 = new Producto("Zapatos", 50.0);
        var producto3 = new Producto("Remera", 24.56);
        var producto4 = new Producto("musculosa", 14.32);

        //Primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);

        //Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        System.out.println(orden2);

        //Tercera orden
        var orden3 = new Orden();
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto3);
        orden3.agregarProducto(producto4);
        System.out.println(orden3);
    }
}
