package mavemhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	
//	@Test
//	public void testeHibernate() {
//		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
//		
//		UsuarioPessoa pessoa = new UsuarioPessoa();
//		
//		pessoa.setNome("Wellington");
//		pessoa.setSobrenome("Rodrigues");
//		pessoa.setEmail("wellrodrigues@gmail.com");
//		pessoa.setLogin("wellrodrigues");
//		pessoa.setSenha("123");
//		
//		daoGeneric.salvar(pessoa);
//	}
	
//	@Test
//	public void testeBuscar() {
//		DaoGeneric<UsuarioPessoa> daoGeneric= new DaoGeneric<UsuarioPessoa>();
//		
//		UsuarioPessoa pessoa = new UsuarioPessoa();
//		pessoa.setId(2L);
//		
//		pessoa = daoGeneric.pesquisar(pessoa);
//		
//		System.out.println(pessoa);
//		
//		
//	}
	
	@Test
	public void testeUpdate(){
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = daoGeneric.pesquisar(1L , UsuarioPessoa.class);
		
		
		pessoa.setNome("Nome atualizado Hibernate");
		pessoa.setSenha("sd4s5d4s4d");
		
		pessoa = daoGeneric.updateMerge(pessoa);
		
		System.out.println(pessoa);
		
	}

	
}
