package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class SeguroDaoImpl implements SeguroDao {

	@Override
	public int AgregarSeguro(Seguro Seg)
	{
		int filas = 0;
		
				Connection cn = null;
				PreparedStatement pst ;
		
						
				try {
					cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/segurosgroup","root","root");
					cn.setAutoCommit(false);
					//System.out.println("mod4");
					pst = cn.prepareStatement("INSERT INTO seguros(idSeguro,descripcion,idTipo,costoContratacion, CostoAsegurado) VALUES(?,?,?,?,?)");
					//System.out.println(persona.toString());
					pst.setInt(1, Seg.getId());
					pst.setString(2, Seg.getDescripcion());
					pst.setInt(3, Seg.getIdTipo());
					pst.setInt(4, Seg.getCostoContratacion());
					pst.setInt(5, Seg.getCostoAsegurado());
					if(pst.executeUpdate() > 0)
					{
						cn.commit();
						filas ++;
					}
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
					try {
						cn.rollback();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
				return filas;
		
		
		
	}
	
	@Override
	public ArrayList<Seguro> GetAll() {
		
				
		ResultSet rst;
		ArrayList<Seguro> List_Seguros = new ArrayList<Seguro>();
		Connection cn = null;
		
		
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/segurosgroup","root","root");
			cn.setAutoCommit(false);		
			PreparedStatement st = cn.prepareStatement("SELECT * FROM seguros ORDER BY idSeguro");
			rst = st.executeQuery();
			while(rst.next()) 
			{
				List_Seguros.add(ArmaSeguro(rst));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("FIN daoPersonaImpl.GetAll");
		return List_Seguros;
	}
	
	@Override
	public Seguro ArmaSeguro(ResultSet resultSet) throws SQLException {
		
		int id =resultSet.getInt(1);
		String Descripcion = resultSet.getString(2);
		int idTipo = resultSet.getInt(3);
		int costoContratacion = resultSet.getInt(4);
		int CostoAsegurado = resultSet.getInt(5);
		
		Seguro Seg = new Seguro();
		Seg.setId(id);
		Seg.setDescripcion(Descripcion);
		Seg.setIdTipo(idTipo);
		Seg.setCostoContratacion(costoContratacion);
		Seg.setCostoAsegurado(CostoAsegurado);
				
		return Seg; 
	}

	@Override
	public int intProximo_idSeguro() {
		
		ResultSet rst;		
		Connection cn = null;		
		
		int Nuevoid = 0;
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/segurosgroup","root","root");
			cn.setAutoCommit(false);		
			PreparedStatement st = cn.prepareStatement("SELECT MAX(idSeguro) + 1 as Proximoid FROM seguros ORDER BY idSeguro");
			rst = st.executeQuery();
			while(rst.next()) 
			{
				Nuevoid  = rst.getInt(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return Nuevoid;
		
	}


}
