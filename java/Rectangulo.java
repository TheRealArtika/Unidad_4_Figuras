public class Rectangulo {

    private double base, altura;


    public double getArea(){
        return base * altura;
    }

    public double getPerimetro(){
        return base * 2 + altura * 2;
    }


    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
}