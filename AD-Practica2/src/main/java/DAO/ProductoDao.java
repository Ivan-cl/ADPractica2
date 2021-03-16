package DAO;

import utilidades.HibernateUtil;
import utilidades.Leer;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Modelos.Producto;

import java.util.List;

public class ProductoDao implements Dao<Producto> {

	public List<Producto> getAll() {
		return null;
		
	}

	public Producto getById(Long id) {
		return null;
		
	}

	public void create(Producto producto) {
		
	}

	public void update(Producto producto) {
		Session s = HibernateUtil.getSession();
		Transaction transaction = s.beginTransaction();
		
		System.out.println("Dime el codigo del producto para modificarlo");
		producto = s.find(Producto.class, Leer.pedirCadena());
		
		producto = s.load(Producto.class, s);
		
		// PEDIMOS LOS DATOS PARA ACTUALIZAR EL PRODUCTO
		System.out.println("Nuevo nombre del producto");
		producto.setNombre(Leer.pedirCadena());
		
		System.out.println("Nueva gama del producto: ");
		String nuevaGama = Leer.pedirCadena();
		if (nuevaGama.equalsIgnoreCase("")) {
			nuevaGama = producto.getGama();
		}
		producto.setGama(nuevaGama);

		System.out.println("Nuevas dimensiones del producto: ");
		String nuevasDimensiones = Leer.pedirCadena();
		if (nuevasDimensiones.equalsIgnoreCase("")) {
			nuevasDimensiones = producto.getDimensiones();
		}
		producto.setDimensiones(nuevasDimensiones);

		System.out.println("Nuevo proveedor del producto: ");
		String nuevoProveedor = Leer.pedirCadena();
		if (nuevoProveedor.equalsIgnoreCase("")) {
			nuevoProveedor = producto.getProveedor();
		}
		producto.setProveedor(nuevoProveedor);

		System.out.println("Nueva descripcion del producto: ");
		String nuevaDescripcion = Leer.pedirCadena();
		if (nuevaDescripcion.equalsIgnoreCase("")) {
			nuevaDescripcion = producto.getDescripcion();
		}
		producto.setDescripcion(nuevaDescripcion);

		System.out.println("Nueva cantidad en stock del producto: ");
		producto.setCantidadEnStock(Leer.pedirEnteroValidar());

		System.out.println("Nuevo precio de venta del producto: ");
		producto.setPrecioVenta(Leer.pedirDecimal());

		System.out.println("Nuevo precio de proveedor del producto: ");
		producto.setPrecioProveedor(Leer.pedirDecimal());
		
		s.update(producto);
		transaction.commit();
		System.out.println("Producto actualizado");
	}

	public void delete(Producto producto) {
		
	}
}