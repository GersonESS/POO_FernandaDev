public class Carro {
    String nome;
    String marca;
    int ano;
    int vel;

    // construtores padrao
    Carro() {

    }

    Carro(String nome) {
        this.nome = nome;
    }

    Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    Carro(String nome, String marca, int vel) {
        this.nome = nome;
        this.marca = marca;
        this.vel = vel;
    }

    // System.out.println("A velocidade é " + c1.vel + "KM/H");
    // metodo
    void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    void freiar(int reduzir) {
        vel -= reduzir;
    }

    void buzinar() {
        System.out.println("bibibib");
        System.out.println("A velocidade é " + vel + "KM/H");
    }
}
