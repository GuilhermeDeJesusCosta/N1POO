package AtividadeN1;

public class Entidade {
    String nome = "SEM NOME";
    String telefone;
    String documento = "Documento não encontrado";
    float valorContaBancaria;
    Imovel moradia = new Imovel();

  //métodos{

    void exibirCapitalLiquido(){
        System.out.println("Olá "+ nome + ", você tem R$" + valorContaBancaria + " em sua conta Bancaria.");
    }

    void somarCapital(float valorContaBancaria){
        this.valorContaBancaria = this.valorContaBancaria + valorContaBancaria;
    }

    void escreverNomeTelefone(){
        System.out.println(nome + " " +"+55"+telefone);        
    }

    void escreverNomeDocumento(){
        System.out.println(nome + " " +documento);         
    }

}//}
