public class Rectangulo {

    private double base, altura;


    public double getArea(){
        return base * altura;
    }

    

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
}