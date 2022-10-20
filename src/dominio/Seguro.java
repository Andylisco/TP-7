package dominio;

public class Seguro {

	private int id;
	private String descripcion;
	private int idTipo;
	private int CostoContratacion;
	private int CostoAsegurado;
	
	
	public void Seguro()
	{
		this.id = 0;
		this.descripcion = "";
		this.idTipo = 0;
		this.CostoContratacion = 0;
		this.CostoAsegurado = 0;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getIdTipo() {
		return idTipo;
	}


	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}


	public int getCostoContratacion() {
		return CostoContratacion;
	}


	public void setCostoContratacion(int costoContratacion) {
		CostoContratacion = costoContratacion;
	}


	public int getCostoAsegurado() {
		return CostoAsegurado;
	}


	public void setCostoAsegurado(int costoAsegurado) {
		CostoAsegurado = costoAsegurado;
	}
	
	
}
