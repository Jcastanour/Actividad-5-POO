package ejercicio_2;

public class Cilindro extends FiguraGeometrica{
    private Double radio, altura;

    public Cilindro(Double radio, Double altura) {
        this.radio = radio;
        this.altura = altura;
        
        //dandole valor a los parametros heredados;
        this.setVolumen(calcVolumen());
        this.setSuperficie(calcSuperficie());
    }
     
    //volumen
    public Double calcVolumen(){
        Double volumen;
        volumen=Math.PI*altura*Math.pow(radio, 2);
        return volumen;
     }
    
    //superficie
    public Double calcSuperficie(){
        Double areaA,areaB;
        areaA=2*Math.PI*radio*altura;
        areaB=2*Math.PI*Math.pow(radio, 2);
        return areaA+areaB;
    } 
}
