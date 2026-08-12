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
        if(dinheiro<=0){
            System.out.println("erro vaor deve ser maior que zero");
        }
        if (dinheiro<=this.saldo){
            this.saldo -= dinheiro;
            System.out.println("sacado com sucesso");
        }
        if (dinheiro<=(this.saldo + this.limite)){
            double diferenca= dinheiro -this.saldo;
            this.saldo = 0.0;
            this.limite-=diferenca;
            System.out.println("Sucesso seu dinheiro foi sacado: " + dinheiro);
        }
        else {
            System.out.println("ERRO valor maior que saldo e limite");
        }
    }
    public void getSaldo(){
        System.out.println("seu saldo: R$" + saldo );
        System.out.println("seu limite: R$" + limite);
    }
}
