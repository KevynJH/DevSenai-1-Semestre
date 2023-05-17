package POOHeranca.Pessoas;

public class Professores extends Funcionarios {
    //atributos específicos
    private String Faculdade;
    private String MateriaEspecializada;
    private int HoraTrabalhada;
    public String getFaculdade() {
        return Faculdade;
    }
    public void setFaculdade(String faculdade) {
        Faculdade = faculdade;
    }
    public String getMateriaEspecializada() {
        return MateriaEspecializada;
    }
    public void setMateriaEspecializada(String materiaEspecializada) {
        MateriaEspecializada = materiaEspecializada;
    }
    public int getHoraTrabalhada() {
        return HoraTrabalhada;
    }
    public void setHoraTrabalhada(int horaTrabalhada) {
        HoraTrabalhada = horaTrabalhada;
    }

    
}
