package exercicio9;

public class Circulo {

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double calcularPerimetro(){
        return(2*Math.PI);
    }    
    public double calcularArea(){
    return(Math.PI * (raio * raio));
}
    public double calcularDiametro(){
        return (2 * raio);
    }
public void mostrarResultados(){
    System.out.println("Perimetro do circulo"+this.calcularPerimetro());
    System.out.println("Area do circulo:"+this.calcularArea());
    System.out.println("diametro do circulo:"+this.calcularDiametro());
}
}
