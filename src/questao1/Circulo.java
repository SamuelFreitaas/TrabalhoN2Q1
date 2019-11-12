
package questao1;


public class Circulo extends Figura {
    
    private double r;
    

    @Override
    public double calcArea(){
        
        super.setArea( (r*r)*3.14 );
        
        return super.getArea();
    }
    
    @Override
    public double calcPerimetro(){
        
        super.setPerimetro( 2*3.14*r );
        
        return super.getPerimetro();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
   
}
