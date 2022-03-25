package AtividadeN1;

public class Imovel {
    String nome;
    String cidade;
    String rua;
    String numero;
    String bairro;
    String complemento = "NAO POSSUI";

   //funções{

    String nomeNumero(){
        String nomeNumero = nome + " " + numero;
        return nomeNumero;
    }

    String cidadeRuaBairro(){
        String enderecoProximo = cidade + " " + rua + " " + bairro;
        return enderecoProximo;
    }

    String nomeCidadeRuaNumeroBairroComplemento(){
        String enderecocompleto = nome + " " + cidade + " " + rua + numero + " " + bairro + " " + complemento;
        return enderecocompleto;
    }
    
}//}
