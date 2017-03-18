package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	public static Empresa empresa;
	public static EmpresaDAO empresaDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDao = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}

	@After
	public void excluiEmpresa() throws Exception{
	empresaDao.exclui("89424232000180");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC01FB_cadastrar_empresa_com_sucesso() {
		assertEquals(1, empresaDao.adiciona(empresa));
	}

	@Test(expected=IllegalArgumentException.class)
	public void CT06UC01A3cnpj_invalido() {
		empresa.setCnpj("");
	}

	@Test(expected=IllegalArgumentException.class)
	public void CT07UC01A3endereco_invalido() {
		empresa.setEndereco("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void CT08UC01A3nomefantasia_invalido() {
		empresa.setNomeFantasia("");
	}

	@Test(expected=IllegalArgumentException.class)
	public void CT09UC01A3NomedaEmpresa_invalido() {
		empresa.setNomeDaEmpresa("");
	}
	@Test(expected=IllegalArgumentException.class)
	public void CT10UC01A3NomedaEmpresa_invalido() {
		empresa.setTelefone("");
	}
}
