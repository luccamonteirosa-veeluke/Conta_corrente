import static java.lang.IO.*;
void main() {
   println("=== Abertura da conta ===");
   String titular= readln("insira o seu nome");
   double limite= Double.parseDouble(readln("insira o seu limite"));

   Conta_corrente conta=new Conta_corrente(limite,titular);

   boolean ex=true;
   while (ex){
       String op = readln("1-depositar . 2-sacar . 3-consultar . 4-sair");

       switch (op){
           case "1" -> {
               double dinheirodep=Double.parseDouble(readln("digite o valor para depositar"));
               conta.depositar(dinheirodep);
           }
           case "2" ->{
               double dinheirosac=Double.parseDouble(readln("digite o valor para sacar"));
               conta.sacar(dinheirosac);
           }
           case "3" ->{
               conta.getSaldo();
               conta.getSaldo();
           }
           case "4"->{
               ex=false;
           }
       }
   }
}
