/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatleta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author waysman
 */
public class TesteControleBoxeador {

    ControleBoxeador controleBoxeador = new ControleBoxeador();
    Boxeador umBoxeador = new Boxeador("Joao");
    @Test
    public void TesteAdicionar(){
        
        controleBoxeador.adicionar(umBoxeador);
    }
    @Test
    public void TesteGetLista(){
     
        controleBoxeador.getListaBoxeadores();
       
    }
    @Test
    public void TesteRemover(){
        controleBoxeador.remover(umBoxeador);
    }
    @Test
    public void TestePesquisar(){
        
        Boxeador resultado = controleBoxeador.pesquisar("Joao");
        Boxeador resultadoesperado = null;
        assertEquals(resultadoesperado, resultado);
    }
}
    
