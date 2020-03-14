import java.util.ArrayList;
import java.util.List;

public class PainelDeControle {
    private List<Livro> livros = new ArrayList<>();


    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado! " + livro.getTitulo());
    }

    public void consultarLivroPorCodigo(Integer codigoLivro) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigoLivro) {
                System.out.println(
                        "------- Livro encontrado -------" + "\n" +
                                "Titulo: " + livro.getTitulo() + "\n" +
                                "Quantidade em estoque: " + livro.getQuantidadeEstoque()
                );
            }
        }
    }

    public void efetuarVendaPorCodigo(Integer codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigo) {
                System.out.println("------- Iniciando compra -------");
                System.out.println("Checando estoque...");
                if (livro.getQuantidadeEstoque() > 0) {
                    livro.setQuantidadeEstoque(livro.getQuantidadeEstoque() - 1);
                    System.out.println("Codigo do livro: " + livro.getCodigo());
                    System.out.println("Titulo: " + livro.getTitulo());
                    System.out.println("Quantidade em estoque: " + livro.getQuantidadeEstoque());
                    System.out.println("------- Compra Finalizada -------");
                } else {
                    System.out.println("Estoque vazio");
                }
            }

        }
    }
}
;