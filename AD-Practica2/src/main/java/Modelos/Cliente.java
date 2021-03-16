package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "codigo_cliente")
	private int codigoCliente;

	@Column(name = "nombre_cliente")
	private String nombreCliente;

	@Column(name = "nombre_contacto")
	private String nombreContacto;

	@Column(name = "apellido_contacto")
	private String apellidoContacto;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "fax")
	private String fax;

	@Column(name = "linea_direccion1")
	private String lineaDireccion1;

	@Column(name = "linea_direccion2")
	private String lineaDireccion2;

	@Column(name = "ciudad")
	private String ciudad;

	@Column(name = "region")
	private String region;

	@Column(name = "pais")
	private String pais;

	@Column(name = "codigo_postal")
	private String codigoPostal;

	@Column(name = "codigo_empleado_rep_ventas")
	private int codigoEmpleadoPepVentas;

	@Column(name = "limite_credito")
	private double limiteCredito;

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getApellidoContacto() {
		return apellidoContacto;
	}

	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLineaDireccion1() {
		return lineaDireccion1;
	}

	public void setLineaDireccion1(String lineaDireccion1) {
		this.lineaDireccion1 = lineaDireccion1;
	}

	public String getLineaDireccion2() {
		return lineaDireccion2;
	}

	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getCodigoEmpleadoPepVentas() {
		return codigoEmpleadoPepVentas;
	}

	public void setCodigoEmpleadoPepVentas(int codigoEmpleadoPepVentas) {
		this.codigoEmpleadoPepVentas = codigoEmpleadoPepVentas;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public String toString() {
		return "Cliente{" + "codigoCliente=" + codigoCliente + ", nombreCliente='" + nombreCliente + '\''
				+ ", nombreContacto='" + nombreContacto + '\'' + ", apellidoContacto='" + apellidoContacto + '\''
				+ ", telefono='" + telefono + '\'' + ", fax='" + fax + '\'' + ", lineaDireccion1='" + lineaDireccion1
				+ '\'' + ", lineaDireccion2='" + lineaDireccion2 + '\'' + ", ciudad='" + ciudad + '\'' + ", region='"
				+ region + '\'' + ", pais='" + pais + '\'' + ", codigoPostal='" + codigoPostal + '\''
				+ ", codigoEmpleadoPepVentas=" + codigoEmpleadoPepVentas + ", limiteCredito=" + limiteCredito + '}';
	}
}