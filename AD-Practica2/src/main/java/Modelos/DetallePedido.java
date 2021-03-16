package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {
	
	@Id
	@Column(name = "codigo_pedido")
	private int codigoPedido;
	
	@Column(name = "codigo_producto")
	private String codigoProducto;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio_unidad")
	private double precioUnidad;
	
	@Column(name = "numero_linea")
	private int numeroLinea;

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(int numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	@Override
	public String toString() {
		return "DetallePedido [codigoPedido=" + codigoPedido + ", codigoProducto=" + codigoProducto + ", cantidad="
				+ cantidad + ", precioUnidad=" + precioUnidad + ", numeroLinea=" + numeroLinea + "]";
	}
}