
package controleatleta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author waysman
 */
public class TesteControleNadador {
    
    public TesteControleNadador() {
    }
    ControleNadador controleNadador = new ControleNadador();
    Nadador umNadador = new Nadador("Joao");
    
    @Test
    public void TesteGetLista(){
        controleNadador.getListaNadadores();
    }
    @Test
    public void TesteAdicionar(){
        controleNadador.adicionar(umNadador);
    }
    @Test
    public void TesteRemover(){
        controleNadador.remover(umNadador);
    }
    @Test
    public void TestePesquisar(){
        String nome = "";
        Nadador resultadoesperado = null;
        Nadador resultado = controleNadador.pesquisar(nome);
        assertEquals(resultadoesperado, resultado);
    }
}
