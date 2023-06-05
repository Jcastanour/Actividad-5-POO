package ejercicio_2;

public class Esfera extends FiguraGeometrica {
    private Double radio;
    
    //constructor
    public Esfera(Double radio){
        this.radio=radio;
        
        //dandole valor a los parametros heredados:
        this.setVolumen(calcVolumen());
        this.setSuperficie(calcSuperficie());
    }
    
    //volumen
    public Double calcVolumen(){
        Double volumen;
        volumen=(4*Math.PI*Math.pow(radio, 3))/3;
        return volumen;
     }
    
    //superficie
    public Double calcSuperficie(){
        Double superficie;
        superficie=4*Math.PI*Math.pow(radio, 2);
        return superficie;
    } 
}
