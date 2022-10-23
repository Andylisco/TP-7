package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoSegurosImpl implements TipoSeguroDao {

	@Override
	public ArrayList<TipoSeguros> GetAll() {
		ResultSet rst;
		ArrayList<TipoSeguros> List_Seguros = new ArrayList<TipoSeguros>();
		Connection cn = null;
		
		
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/segurosgroup","root","root");
			cn.setAutoCommit(false);		
			PreparedStatement st = cn.prepareStatement("SELECT * FROM tiposeguros ORDER BY idTipo");
			rst = st.executeQuery();
			while(rst.next()) 
			{
				List_Seguros.add(ArmaSeguro(rst));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("FIN daoTipoSegurosImpl.GetAll");
		return List_Seguros;
	}
	
      
	@Override
	public TipoSeguros ArmaSeguro(ResultSet resultSet) throws SQLException {
		int id =resultSet.getInt(1);
		String Descripcion = resultSet.getString(2);
		
		
		TipoSeguros Seg = new TipoSeguros();
		Seg.setId(id);
		Seg.setDescripcion(Descripcion);
		
				
		return Seg;
	}

}
