package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Modelos.DetallePedido;
import utilidades.HibernateUtil;
import utilidades.Leer;

public class DetallePedidoDao implements Dao<DetallePedido> {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<DetallePedido> getAll() {
		Session s = HibernateUtil.getSession();

		System.out.println("Inserta el id del cliente para ver sus pedidos");
		int id = Leer.pedirEnteroValidar();

		Query q = s.createQuery(
				"select detallePedido from DetallePedido detallePedido where codigo_pedido in ( select codigo_pedido from Pedido where codigo_cliente= "
						+ id + " group by codigo_pedido");
		Query q2 = s.createQuery(
				"select sum(cantidad*precio_unidad) as total from DetallePedido e where codigo_pedido in ( select codigo_pedido from Pedido where codigo_cliente = "
						+ id + ")");
		List<DetallePedido> todosLosDetallesPedidos = q.getResultList();
		List<DetallePedido> sumaDetallesPedidos = q2.getResultList();
		System.out.println("La suma total es:" + sumaDetallesPedidos);
		return todosLosDetallesPedidos;
	}

	public DetallePedido getById(Long id) {
		return null;
	}

	public void create(DetallePedido t) {

	}

	public void update(DetallePedido t) {

	}

	public void delete(DetallePedido t) {

	}
}