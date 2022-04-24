import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import br.sistema.crud.jdbc.bo.PessoaBO;
import br.sistema.crud.jdbc.dao.PessoaDAO;
import br.sistema.crud.jdbc.dto.EnderecoDTO;
import br.sistema.crud.jdbc.dto.PessoaDTO;
import br.sistema.crud.jdbc.dto.UfDTO;
import br.sistema.crud.jdbc.exception.PersistenciaExcpetion;
import br.sistema.crud.jdbc.exception.ValidacaoException;

public class PessoaBOTest {
	public PessoaBO p = new PessoaBO();
	public PessoaDTO pessoa = new PessoaDTO();
	public PessoaDAO pessoadao = new PessoaDAO();
	
	
	
	@Test
	public void testCadastro() throws PersistenciaExcpetion {
		assertEquals(pessoa, pessoadao.inserir(pessoa));
	}
	
	@Test
	public  void validarNomeTest () throws ValidacaoException {
		pessoa.setNome("marlus");
		assertTrue(p.validaNome(pessoa.getNome()));
	}
	
	@Test (expected = Exception.class)
	public  void validarNomeNullTest () throws ValidacaoException {
		pessoa.setNome("");
		assertTrue(p.validaNome(pessoa.getNome()));
	}
	
	@Test
	public  void validarCPFTest () throws ValidacaoException {
		pessoa.setCpf("12345678911");
		assertTrue(p.validaCpf(pessoa.getCpf()));
	}
	
	@Test (expected = Exception.class)
	public  void validarCPFNullTest () throws ValidacaoException {
		pessoa.setCpf("18911");
		assertTrue(p.validaCpf(pessoa.getCpf()));
	}
	
	@Test
	public void validaEnderecoTest () throws ValidacaoException {
		UfDTO uf = new UfDTO();
		uf.setIdUF(12);
		uf.setDescrcao("nordeste");
		uf.setSiglaUF("rn");
		EnderecoDTO end = new EnderecoDTO();
		end.setCep(123);
		end.setBairro("vale dourado");
		end.setCidade("Natal");
		end.setIdEndereco(1);
		end.setLogradouro("casa");
		end.setNumero(15L);
		end.setUfDTO(uf);
		
		assertTrue(p.validaEndereco(end));
	}
	
	@Test (expected = Exception.class)
	public void validaEnderecoNullTest () throws ValidacaoException {
		UfDTO uf = new UfDTO();
		uf.setIdUF(12);
		uf.setDescrcao("");
		uf.setSiglaUF("rn");
		EnderecoDTO end = new EnderecoDTO();
		end.setCep(123);
		end.setBairro("");
		end.setCidade("Natal");
		end.setIdEndereco(1);
		end.setLogradouro("");
		end.setNumero(15L);
		end.setUfDTO(uf);
		
		assertTrue(p.validaEndereco(end));
	}
	
	@Test
	public void validaDataNascTest () throws ValidacaoException {
		Date data = new Date ();
		data.setDate(10-10-2022);
 		pessoa.setDtNascimento(data);
 		
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(data);
 		System.out.println(dataFormatada);
 		 assertTrue(p.validaDtNasc(dataFormatada));
	}

}
