public class Funcionario {
    String cpf, nome;
    double salario, valRefeicao=550.00;

    public String returnDados(){
        return "{Nome : " + nome + " - CPF : " + cpf + " - Salario : " + salario + "}";
    }

    public void aumentSalario(double porcentagem){
        porcentagem = 1 + (porcentagem/100);
        salario = salario * porcentagem;    
    }

    public void ajustValeRefeicao(double porcentagem){
        porcentagem = 1 + (porcentagem/100);
        valRefeicao = valRefeicao * porcentagem;
    }