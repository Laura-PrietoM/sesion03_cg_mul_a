
public class Esferica {
    private double radio;
    private double angulo1;
    private double angulo2;

    public Esferica(double radio, double angulo1, double angulo2) {
        this.radio = radio;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
    }

    public Esferica() {
        
    }

    
    public double getRadio() {
        return radio;
    }

    public double getAngulo1() {
        return angulo1;
    }

    public double getAngulo2() {
        return angulo2;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAngulo1(double angulo1) {
        this.angulo1 = angulo1;
    }

    public void setAngulo2(double angulo2) {
        this.angulo2 = angulo2;
    }

   
    
}
