package AtividadeN1;

public class Atividade {
    public static void main(String[] args) {
        
        Entidade usuario = new Entidade();

        usuario.escreverNomeTelefone();
        usuario.exibirCapitalLiquido();
        usuario.escreverNomeDocumento();

        usuario.nome = "Guilherme";
        usuario.telefone = "1140028922";
        usuario.valorContaBancaria = 156.97f;
        usuario.documento = "999.999.999-99";

        usuario.escreverNomeTelefone();
        usuario.escreverNomeDocumento();
        usuario.exibirCapitalLiquido();
        usuario.somarCapital(53.85f);
        usuario.exibirCapitalLiquido();



        Imovel meuImovel = new Imovel();

        meuImovel.nome = "Kitnet";
        meuImovel.cidade = "Sorriso";
        meuImovel.rua = "Avenida Brasil";
        meuImovel.numero = "999";
        meuImovel.bairro = "Jardim Bela Vista";
        meuImovel.complemento = "";
  

    }
}
