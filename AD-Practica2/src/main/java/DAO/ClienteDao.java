package DAO;

import Modelos.Cliente;
import utilidades.HibernateUtil;
import utilidades.Leer;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ClienteDao implements Dao<Cliente> {

	Cliente c = new Cliente();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Cliente> getAll() {
		Session s = HibernateUtil.getSession();
		Query q = s.createQuery("select client from Cliente client order by nombre_cliente");
		List<Cliente> todosLosClientes = q.getResultList();
		for (Cliente cliente : todosLosClientes) {
			System.out.println(cliente);
		}
		return todosLosClientes;
	}

	public Cliente getById(Long id) {
		Session s = HibernateUtil.getSession();

		System.out.println("Dime el id del cliente para buscar en BBDD");
		c = s.find(Cliente.class, Leer.pedirEnteroValidar());
		System.out.println("Cliente encontrado");
		System.out.println(c);
		return c;
	}

	public void create(Cliente cliente) {
		Session s = HibernateUtil.getSession();
		Transaction transaction = s.beginTransaction();

		// PEDIMOS LOS DATOS PARA OBTENER EL CLIENTE
		System.out.println("Codigo del cliente");
		cliente.setCodigoCliente(Leer.pedirEnteroValidar());

		System.out.println("Nombre del cliente: ");
		cliente.setNombreCliente(Leer.pedirCadena());

		System.out.println("Nombre de contacto: ");
		cliente.setNombreContacto(Leer.pedirCadena());

		System.out.println("Apellido de contacto: ");
		cliente.setApellidoContacto(Leer.pedirCadena());

		System.out.println("Telefono: ");
		cliente.setTelefono(Leer.pedirCadena());

		System.out.println("Fax: ");
		cliente.setFax(Leer.pedirCadena());

		System.out.println("Linea de direccion: ");
		cliente.setLineaDireccion1(Leer.pedirCadena());

		System.out.println("Linea de direccion 2: ");
		cliente.setLineaDireccion2(Leer.pedirCadena());

		System.out.println("Ciudad: ");
		cliente.setCiudad(Leer.pedirCadena());

		System.out.println("Region: ");
		cliente.setRegion(Leer.pedirCadena());

		System.out.println("Pais: ");
		cliente.setPais(Leer.pedirCadena());

		System.out.println("Codigo postal: ");
		cliente.setCodigoPostal(Leer.pedirCadena());

		System.out.println("Codigo empleado rep ventas: ");
		cliente.setCodigoEmpleadoPepVentas(Leer.pedirEnteroValidar());

		System.out.println("Limite de credito: ");
		cliente.setLimiteCredito(Leer.pedirDecimal());

		s.save(cliente);
		transaction.commit();
		System.out.println("Cliente creado en la BBDD");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Cliente> buscar() {
		Session s = HibernateUtil.getSession();
		System.out.println("Dime el nombre, el contacto o el apellido del cliente");
		String busqueda = Leer.pedirCadena();
		Query q = s.createQuery(
				"select client from Cliente client where nombre_cliente = '" + busqueda + "'" + " or nombre_contacto = '"
						+ busqueda + "' or apellido_contacto = '" + busqueda + "' order by nombre_cliente");
		List<Cliente> todosLosClientes = q.getResultList();
		for (Cliente cliente : todosLosClientes) {
			System.out.println(cliente);
		}
		return todosLosClientes;
	}

	public void update(Cliente cliente) {

	}

	public void delete(Cliente cliente) {
	}
}