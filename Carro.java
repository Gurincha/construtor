public class Carro {
    private String motor;
    private String modelo;
    private int roda;
    private double preco;
    private String tracao;

    public Carro(){

        
    }   
    public Carro(String motor, String modelo, int roda, double preco){

        this.motor=motor;
        this.modelo=modelo;
        this.roda=roda;
        this.preco=preco;


    }

    public Carro(String motor, String modelo, String tracao){
        this.motor=motor;
        this.modelo=modelo;
        this.tracao=tracao;
}
    public void dados(){
        System.out.println(this.motor +" "+ this.modelo +" "+ this.roda +" "+ this.preco+" "+this.tracao);
        //System.out.println(this.motor+" "+this.modelo+" "+this.tracao );
    }
    
}