public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        for(int i=0;i<12;i++){
            for(int j=0;j<31;j++){
                cliente.conta.extrato[j][i] ="";
            }
        }    
        

        
        cliente.conta.depositar(500);
        cliente.conta.sacar(200);
        cliente.nome = "Lucas";
        cliente.cpf = "312";

        System.out.println(cliente.conta.retornarDados());
        System.out.println(cliente.conta.gerarExtrato(20));
       

    }
}