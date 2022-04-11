import javax.swing.plaf.synth.SynthScrollBarUI;

public class Principal{
    public static void main(String[] args) {
        
        Bicicleta bike=new Bicicleta();

        Carro car=new Carro();
        Carro car2= new Carro("1.0", "Up", 4, 63000);
        Carro car3=new Carro("1.0", "john aaa", "total");

        car2.dados();
        car3.dados();


    
    
    Calculadora calc=new Calculadora(){

        System.out.println(calc.soma(38,1));
        }  
    }
}
