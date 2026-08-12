import static java.lang.IO.*;
void main() {
    Conta_corrente c1=new Conta_corrente();
    c1.setTitular("casio");
    c1.depositar(1000);
    c1.sacar(200);
    c1.getSaldo();
}
