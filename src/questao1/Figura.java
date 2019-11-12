
package questao1;


public abstract class Figura {
    
    private double perimetro;
    private double area;
            
    public abstract double calcArea();
    public abstract double calcPerimetro();

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}

