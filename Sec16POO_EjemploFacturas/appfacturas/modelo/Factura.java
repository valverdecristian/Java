package Sec16POO_EjemploFacturas.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[Factura.MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if(indiceItems < MAX_ITEMS){
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for(int i = 0; i < indiceItems; i++){
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("Factura N°: ")
                .append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\tNIF")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion);

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ").append(df.format(this.fecha));

        sb.append("\n")
                .append("\n#\tNombre\t\t$\t\tCant.\t\tTotal\n");

        for(int i = 0; i< indiceItems; i++ ){
            ItemFactura item = this.items[i];

//            sb.append(item.getProducto().getCodigo())
//                    .append("\t")
//                    .append(item.getProducto().getNombre())
//                    .append("\t")
//                    .append(item.getProducto().getPrecio())
//                    .append("\t")
//                    .append(item.getCantidad())
//                    .append("\t")
//                    .append(item.calcularImporte())
//                    .append("\n");

            // optimizado
            sb.append(item.toString()).append("\n");
        }

        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
