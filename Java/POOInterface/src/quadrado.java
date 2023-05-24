package POOInterface.src;

public class quadrado implements FigurasGeometricas{
    int lado;
    
    //construtor
    public quadrado(int lado) {
        this.lado = lado;
    }
    //sets and gets
    public int getlado() {
        return lado;
    }

    public void setlado(int lado) {
        this.lado = lado;
    }
    //métodos da classe FigurasGeometricas(interface)
    @Override
    public double getArea() {
        int area = lado*lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = 4*lado;
        return perimetro;
    }
}