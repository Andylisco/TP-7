package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dominio.Seguro;

public interface SeguroDao {

	
	public int AgregarSeguro(Seguro Seg);	
	public ArrayList<Seguro> GetAll();
	public Seguro ArmaSeguro(ResultSet resultSet) throws SQLException;
	public int intProximo_idSeguro();
	
}
