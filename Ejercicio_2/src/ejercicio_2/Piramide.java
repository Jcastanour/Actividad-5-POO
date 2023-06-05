package ejercicio_2;

public class Piramide extends FiguraGeometrica{
    private Double base,altura,apotema;
    //base hace referencia al lado de la base
    
    //constructor
    //al construirlo obtengo todo
    public Piramide(Double base, Double altura, Double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        
        //le definimos los parametros heredados
        this.setVolumen(calcVolumen());
        this.setSuperficie(calcSuperficie());
        
    }
    
    //metodo quee calcula el volumen
    public Double calcVolumen(){
        Double volumen;
        volumen = (Math.pow(base,2)*altura)/3;
        return volumen;
    }
    
    //metodo que calcula la superficie
    public Double calcSuperficie(){
        Double areaBase, areaLado;
        areaBase = Math.pow(base, 2);
        areaLado = 2*base*apotema;
        return areaBase+areaLado;
    }       
}
