package mavemhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	
	@Test
	public void testeHibernate() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setNome("Wellington");
		pessoa.setSobrenome("Rodrigues");
		pessoa.setEmail("wellrodrigues@gmail.com");
		pessoa.setLogin("wellrodrigues");
		pessoa.setSenha("123");
		
		daoGeneric.salvar(pessoa);
	}

	
}
