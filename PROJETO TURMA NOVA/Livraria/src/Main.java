public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro(1, "Diario de um Banana", "Um Banana", "2002", 455, 10.0);
        Livro livro2 = new Livro(2, "Senhor dos Aneis", "O Senhor", "2001", 554, 20.0);
        Livro livro3 = new Livro(3, "Star Wars", "Jorge Lucas", "2002", 655, 40.0);

        livro1.setQuantidadeEstoque(5);
        livro2.setQuantidadeEstoque(2);
        livro3.setQuantidadeEstoque(0);

        PainelDeControle painelDeControle = new PainelDeControle();

        painelDeControle.cadastrarLivro(livro1);
        painelDeControle.cadastrarLivro(livro2);
        painelDeControle.cadastrarLivro(livro3);

        painelDeControle.consultarLivroPorCodigo(1);
        painelDeControle.efetuarVendaPorCodigo(1);
        painelDeControle.efetuarVendaPorCodigo(3);
    }
}
