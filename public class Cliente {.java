public class Cliente {
    String nome, cpf;
    Conta conta = new Conta();
    CartaoDeCredito CartdCred = new CartdCred);

    public String retornarDados(){
        return "{Nome:" + nome + "| CPF: " + cpf + 
               "}\nCartão de crédito-> " + CartdCred.retornarDados() + 
               "\nConta=> " + conta.retornarDados() + "}"