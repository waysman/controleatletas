
package controleatleta;

import java.util.ArrayList;

public class ControleNadador {
    
    private ArrayList<Nadador> listaNadadores;
    
    public ControleNadador(){
        this.listaNadadores =  new ArrayList<Nadador>();
    }

    public ArrayList<Nadador> getListaNadadores() {
        return listaNadadores;
    }

    public void adicionar(Nadador umNadador){
        listaNadadores.add(umNadador);
    }
    public void remover(Nadador umNadador){
        listaNadadores.remove(umNadador);
    }
    public Nadador pesquisar(String nome) {
        for (Nadador b: listaNadadores) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
    
    
}
