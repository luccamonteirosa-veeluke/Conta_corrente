public class Conta_corrente {
    private String titular;
    private double saldo=0;
    private double limite=0;



    public  void getTitular(){
        System.out.println(this.titular);
    }

    public Conta_corrente(double limite , String titular) {
        this.limite = limite;
        this.limite = limite;
    }

    public void depositar(double dinheiro){
        if (dinheiro<0){
            System.out.println("ERRO valor invalido");
        }
        else {
            System.out.println("O dinheiro foi depositado");
            this.saldo= saldo + dinheiro;
        }
    }
    public void sacar(double dinheiro){
        if (dinheiro>saldo && dinheiro>limite){
            System.out.println("ERRO valor invalido ");
        }
        else if (dinheiro<=limite && dinheiro>saldo){
            this.limite=(saldo+limite)-dinheiro;
        }
        else {
            this.saldo=saldo-dinheiro;
            System.out.println("seu valor foi sacado");
        }
    }
    public void getSaldo(){
        System.out.println("seu saldo: R$" + saldo );
        System.out.println("seu limite: R$" + limite);
    }
}
