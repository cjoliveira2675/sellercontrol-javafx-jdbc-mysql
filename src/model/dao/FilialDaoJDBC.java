package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.entities.Filial;

public class FilialDaoJDBC implements FilialDao{
	
	private Connection conn;

	public FilialDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Filial obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("INSERT INTO scfilial "
					+ "(razaosocial,fantasia,representante,cnpj,cep,uf,cidade,bairro,rua,complemento,numero,telefone1,telefone2,email) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getRazaoSocial());
			st.setString(2, obj.getFantasia());
			st.setString(3, obj.getRepresentante());
			st.setString(4, obj.getCnpj());
			st.setString(5, obj.getCep());
			st.setString(6, obj.getUf());
			st.setString(7, obj.getCidade());
			st.setString(8, obj.getBairro());
			st.setString(9, obj.getRua());
			st.setString(10, obj.getComplemento());
			st.setString(11, obj.getNumero());
			st.setString(12, obj.getTelefone1());
			st.setString(13, obj.getTelefone2());
			st.setString(14, obj.getEmail());
			
			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setCodFilial(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Unexpected error! No rows affected!");
			}

		} catch (SQLException e) {
			throw new db.DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void update(Filial obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("UPDATE scfilial "
					+ "SET razaosocial = ?, fantasia = ?, representante = ?, cnpj = ?, cep = ?, uf = ?, "
					+ "cidade = ?, bairro = ?, rua = ?, complemento = ?, numero = ?, telefone1 = ?, telefone2 = ?, email = ? "
					+ "WHERE codigo = ?");

			st.setString(1, obj.getRazaoSocial());
			st.setString(2, obj.getFantasia());
			st.setString(3, obj.getRepresentante());
			st.setString(4, obj.getCnpj());
			st.setString(5, obj.getCep());
			st.setString(6, obj.getUf());
			st.setString(7, obj.getCidade());
			st.setString(8, obj.getBairro());
			st.setString(9, obj.getRua());
			st.setString(10, obj.getComplemento());
			st.setString(11, obj.getNumero());
			st.setString(12, obj.getTelefone1());
			st.setString(13, obj.getTelefone2());
			st.setString(14, obj.getEmail());
			st.setInt(15, obj.getCodFilial());

			st.executeUpdate();
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	/*@Override
	public void deleteById(Integer codigo) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM scfilial WHERE codigo = ?");

			st.setInt(1, codigo);

			st.executeUpdate();

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}*/

	/*@Override
	public Filial findById(Integer codigo) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM scfilial WHERE codigo = ?");
			st.setInt(1, codigo);
			rs = st.executeQuery();
			if (rs.next()) {
				Filial filial = instantiateFilial(rs);
				return filial;
			}
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
		return null;
	}*/

	@Override
	public List<Filial> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM scfilial ORDER BY codigo");
			rs = st.executeQuery();
			
			List<Filial> list = new ArrayList<>();
			
			while (rs.next()) {
				Filial filial = instantiateFilial(rs);
				list.add(filial);
			}
			return list;
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	}

	private Filial instantiateFilial(ResultSet rs) throws SQLException {
		Filial filial = new Filial();
		filial.setCodFilial(rs.getInt("codigo"));
		filial.setRazaoSocial(rs.getString("razaosocial"));
		filial.setFantasia(rs.getString("fantasia"));
		filial.setRepresentante(rs.getString("representante"));
		filial.setCnpj(rs.getString("cnpj"));
		filial.setCep(rs.getString("cep"));
		filial.setUf(rs.getString("uf"));
		filial.setCidade(rs.getString("cidade"));
		filial.setBairro(rs.getString("bairro"));
		filial.setRua(rs.getString("rua"));
		filial.setComplemento(rs.getString("complemento"));
		filial.setNumero(rs.getString("numero"));
		filial.setTelefone1(rs.getString("telefone1"));
		filial.setTelefone2(rs.getString("telefone2"));
		filial.setEmail(rs.getString("email"));
		return filial;
	}
}
