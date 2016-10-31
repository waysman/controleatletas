
package controleatleta;


public class Nadador extends Atleta{
    
    private char categoria; //A= amador , P = profissional
    private String MedalhasOuro;
    private String MedalhasPrata;
    private String MedalhasBronze;
    private Double Envergadura;
    
    public Nadador(String nome) {
        super(nome);
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public String getMedalhasOuro() {
        return MedalhasOuro;
    }

    public void setMedalhasOuro(String MedalhasOuro) {
        this.MedalhasOuro = MedalhasOuro;
    }

    public String getMedalhasPrata() {
        return MedalhasPrata;
    }

    public void setMedalhasPrata(String MedalhasPrata) {
        this.MedalhasPrata = MedalhasPrata;
    }

    public String getMedalhasBronze() {
        return MedalhasBronze;
    }

    public void setMedalhasBronze(String MedalhasBronze) {
        this.MedalhasBronze = MedalhasBronze;
    }

    

    public Double getEnvergadura() {
        return Envergadura;
    }

    public void setEnvergadura(Double Envergadura) {
        this.Envergadura = Envergadura;
    }

    
    
    
}
