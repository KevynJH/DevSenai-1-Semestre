package POOHeranca.Pessoas;

public class Funcionarios extends Pessoas {
    //atributos específicos
    int nif;
    int TempoExperiencia;
    String AreaFuncao;
    public int getnif() {
        return nif;
    }
    public void setnif(int nif) {
        this.nif = nif;
    }
    public int getTempoExperiencia() {
        return TempoExperiencia;
    }
    public void setTempoExperiencia(int TempoExperiencia) {
        TempoExperiencia = TempoExperiencia;
    }
    public String getAreaFuncao() {
        return AreaFuncao;
    }
    public void setAreaFuncao(String areaFuncao) {
        AreaFuncao = areaFuncao;
    }
    

    
}
