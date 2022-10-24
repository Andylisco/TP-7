package dominio;

public class Seguro {

	private static int contador= 1;
	private final int id=contador;
	private String descripcion;
	private int idTipo;
	private int CostoContratacion;
	private int CostoAsegurado;
	
	public Seguro() {
		
	}
	public Seguro(int id, String descripcion, int idtipo, int costoCon,int costoAse)
	{
		
		this.descripcion = descripcion;
		this.idTipo = idtipo;
		this.CostoContratacion = costoCon;
		this.CostoAsegurado = costoAse;
		contador++;
	}

	

    public static int getContador() {
	return contador ;
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
