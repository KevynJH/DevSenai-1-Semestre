package POOInterface.src;

public class App {
    public static void main(String[] args) {
        quadrado figura1 = new quadrado(6);
        retangulo figura2 = new retangulo(4, 6);
        trapezio figura3 = new trapezio(10, 5, 0, 0, 0)
        System.out.println("Nome " + figura1.getNomeFigura()
        + " Area:" + figura1.getArea()
        + " Perimetro: "+ figura1.getPerimetro());
        System.out.println("Nome " + figura2.getNomeFigura()
        + " Area:" + figura2.getArea()
        + " Perimetro: "+ figura2.getPerimetro());
        System.out.println("Nome " + figura3.getNomeFigura()
        + "Area: " + figura3.getArea()
        + "Perimetro: "+ figura3.getPerimetro());
    }
}