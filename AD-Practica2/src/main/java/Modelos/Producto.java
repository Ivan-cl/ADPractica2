package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@Column(name = "codigo_producto")
	private String codigoProducto;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "gama")
	private String gama;
	
	@Column(name = "dimensiones")
	private String dimensiones;
	
	@Column(name = "proveedor")
	private String proveedor;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "cantidad_en_stock")
	private int cantidadEnStock;
	
	@Column(name = "precio_venta")
	private double precioVenta;
	
	@Column(name = "precio_proveedor")
	private double precioProveedor;

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadEnStock() {
		return cantidadEnStock;
	}

	public void setCantidadEnStock(int cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getPrecioProveedor() {
		return precioProveedor;
	}

	public void setPrecioProveedor(double precioProveedor) {
		this.precioProveedor = precioProveedor;
	}

	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", gama=" + gama + ", dimensiones="
				+ dimensiones + ", proveedor=" + proveedor + ", descripcion=" + descripcion + ", cantidadEnStock="
				+ cantidadEnStock + ", precioVenta=" + precioVenta + ", precioProveedor=" + precioProveedor + "]";
	}
}