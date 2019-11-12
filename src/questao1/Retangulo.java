
package questao1;


public class Retangulo extends Figura {
    
    private double altura;
    private double largura;
    

    @Override
    public double calcArea(){
        
        super.setArea( altura*largura );
        
        return super.getArea();
    }
    
    @Override
    public double calcPerimetro(){
        
        super.setPerimetro( altura + altura + largura + largura);
        
        return super.getPerimetro();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    
}
