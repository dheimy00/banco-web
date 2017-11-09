package br.com.banco.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.banco.arquitetura.persistencia.DAO;
import br.com.banco.fabrica.FabricaConexao;
import br.com.banco.modelo.entidades.Banco;

public class BancoDAO implements DAO<Banco>{

	@Override
	public void salvar(Banco entidade) {
		StringBuilder sql = new StringBuilder();

		sql.append("insert into tb_banco");
		sql.append(" (numero,nome) values(?,?)");

		try(Connection conexao = FabricaConexao.getConexao();
				PreparedStatement ps = conexao.prepareStatement(sql.toString())){
			ps.setInt(1, entidade.getNumero());
			ps.setString(2, entidade.getNome());

		}catch(SQLException e){
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Banco entidade) {

		StringBuilder sql = new StringBuilder();

		sql.append("update tb_banco");

		sql.append("set nome = ? where  id = ?");

		try( Connection conexao = FabricaConexao.getConexao();
				PreparedStatement ps = conexao.prepareStatement(sql.toString())) {

			ps.setString(1, entidade.getNome());
			ps.setInt(2, entidade.getNumero());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public List<Banco> consultar(Banco entidade) {

		StringBuilder sql = new StringBuilder();

		sql.append("select id, numero, nome from tb_banco");
		sql.append(" where nome ilike  ? ");

		try(Connection conexao = FabricaConexao.getConexao();
				PreparedStatement ps = conexao.prepareStatement(sql.toString())) {

			ps.setString(1, entidade.getNome()+"%");

			ResultSet resultSet =  ps.executeQuery();

			List<Banco> bancos = new ArrayList<>();

			while(resultSet.next()){

				Banco banco  = new Banco();

				banco.setIdentificador(resultSet.getLong(1));

				banco.setNumero(resultSet.getInt(2));

				banco.setNome(resultSet.getString(3));

				bancos.add(banco);

			}

			return bancos;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}

	@Override
	public Banco obter(Long id) {
		return null;
	}

	@Override
	public void excluir(Banco entidade) {
		StringBuilder sql = new StringBuilder();

		sql.append("delete from tb_banco");

		sql.append("where  numero = ?");

		try(Connection conexao = FabricaConexao.getConexao();
				PreparedStatement ps = conexao.prepareStatement(sql.toString())) {

			ps.setInt(1, entidade.getNumero());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}     
	}

}
