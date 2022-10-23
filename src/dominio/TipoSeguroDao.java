package dominio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface TipoSeguroDao {

	public ArrayList<TipoSeguros> GetAll();
	public TipoSeguros ArmaSeguro(ResultSet resultSet) throws SQLException;
	
}
