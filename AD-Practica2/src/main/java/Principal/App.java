package Principal;

import utilidades.HibernateUtil;
import utilidades.Leer;

import DAO.ClienteDao;
import DAO.DetallePedidoDao;
import DAO.ProductoDao;
import Modelos.Cliente;
import Modelos.Producto;

public class App {
	public static void main(String[] args) {
		// INICIAMOS LA CONEXION A LA BBDD
		try {
			HibernateUtil.conectar();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Cliente cliente = new Cliente();
		ClienteDao miCliente = new ClienteDao();
		Producto producto = new Producto();
		ProductoDao miProducto = new ProductoDao();
		DetallePedidoDao miDetallePedido = new DetallePedidoDao();
		mostrarMenu();
		// VARIABLE QUE UTILIZAREMOS PARA ELEGIR LA FUNCION DEL MENU
		int opcion = 0;
		opcion = Leer.pedirEnteroValidar();
		while (opcion != 0) {
			// IMPRIMIMOS MENU

			
			// PEDIMOS QUE ES LO QUE QUIERE EL USUARIO


			// SEGUN LO QUE HA ELEGIDO EJECUTAREMOS LA FUNCION CORRESPONDIENTE
			switch (opcion) {
			case 1:
				miCliente.create(cliente);
				break;
			case 2:
				miCliente.getById(null);
				break;
			case 3:
				miCliente.getAll();
				break;
			case 4:
				miCliente.buscar();
				break;
			case 5:
				miProducto.update(producto);
				break;
			case 6:
				miDetallePedido.getAll();
				break;
			}
			mostrarMenu();
			opcion = Leer.pedirEnteroValidar();
		}
		HibernateUtil.apagar();
	}

	private static void mostrarMenu(){
		System.out.println("1-> Para Insertar un nuevo cliente");
		System.out.println("2-> Para mostrar un cliente");
		System.out.println("3-> Para mostrar todos los clientes");
		System.out.println("4-> Para buscar un cliente");
		System.out.println("5-> Para editar un producto");
		System.out.println("6-> Para mostrar todos los detalles de los pedidos de un cliente");
		System.out.println("7-> Para mostrar el empleado del mes");
		System.out.println("0-> Para salir del programa");
	}
}