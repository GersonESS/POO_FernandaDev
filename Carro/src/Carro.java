public class Carro {
    String nome;
    String marca;
    int ano;
    int vel;

    // metodo
    void acelarar(int aceleracao) {
        vel += aceleracao;
    }

    void freiar(int reduzir) {
        vel -= reduzir;
    }

    void buzinar() {
        System.out.println("bibibib");
    }
}
