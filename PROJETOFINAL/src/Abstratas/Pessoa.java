package Abstratas;

public abstract class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}