
public class Cilindrica {
    private double radio;
    private double angulo;
    private double z;

    public Cilindrica(double radio, double angulo, double z) {
        this.radio = radio;
        this.angulo = angulo;
        this.z = z;
    }

    public Cilindrica() {
    }
    
    public Cilindrica esferica_cilindrica(double radio1, double  angulo1, double angulo2) {   //Conversión de Esferica a Cilindrica
      double radio = radio1* Math.sin(angulo1);
      double angulo = angulo2;
      double z = radio* Math.cos(angulo1);
      return new Cilindrica( radio,  angulo,z);
    }
    
    public Cilindrica esferica_cilindrica(Cilindrica m){    //Conversión de Esferica a Cilindrica 
      return esferica_cilindrica(m.getRadio(),m.getAngulo(),m.getZ());  
    }
    
    public Esferica cilindrica_esferica(double radio, double angulo, double z){ //Conversión de Cilindrica a esferica
       
       double r = (double)Math.sqrt(Math.pow(radio, 2)+Math.pow(z, 2));
       double angulo1=(double)Math.atan(radio/z);
       double angulo2=angulo;
       return new Esferica(r,angulo1,angulo2);
    }
    
    public Esferica cilindrica_esferica(Esferica z){        //Conversión de Cilindrica a esferica 
        return cilindrica_esferica(z.getRadio(),z.getAngulo1(),z.getAngulo2());        
    }
    
    
    //SETTER Y GETTER
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public double getRadio() {
        return radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public double getZ() {
        return z;
    }
    
    

}
