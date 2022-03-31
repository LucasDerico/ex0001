public class CartCred {
    int numero;
    double TotalFatura;

    public double consultarFatura(){
        return TotalFatura;
    }
    
    public String retornarDados(){
        return "{ Número cartão: " + numero + "| Valor fatura: " + TotalFatura + "}";
    }

}
