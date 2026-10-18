package modelo;

public class Paciente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private int idade;

    // Construtor vazio
    public Paciente() {}

    // Construtor completo
    public Paciente(int id, String nome, String cpf, String telefone, int idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}