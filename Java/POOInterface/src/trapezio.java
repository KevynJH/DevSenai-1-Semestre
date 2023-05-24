package POOInterface.src;

public class trapezio implements FigurasGeometricas {
    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;

    public trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        int area = (baseMaior+baseMenor)*altura/2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "trapezio";
    }

    @Override
    public double getPerimetro() {
        altura = baseMaior+baseMenor+lado1+lado2;
        return altura;
    }

    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
}
