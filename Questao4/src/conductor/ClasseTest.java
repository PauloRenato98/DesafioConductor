package conductor;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClasseTest {
	@Test
	public void testarNome() {

		UsuarioComum usuario1 = new UsuarioComum();
		Portador p1 = new Portador();
		
		
		assertEquals(9873, usuario1.getId());
		assertEquals("11122244477", usuario1.getCpf());
		assertEquals("2019-11-26", usuario1.getDataNascimento());
		assertEquals(987.35, usuario1.getRenda(), 0);
		assertEquals(2, usuario1.getNumeroDeDependentes());
		
		Portador portador1 = new Portador();

		assertEquals(p1.getLimiteEspecial(), portador1.getLimiteEspecial(), 0);
		System.out.println(portador1.getLimiteEspecial());

	}

}
