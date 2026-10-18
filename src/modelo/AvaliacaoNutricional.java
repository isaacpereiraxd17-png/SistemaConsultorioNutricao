package modelo;

public class AvaliacaoNutricional {
    private int id;
    private double peso;
    private double altura;
    private double imc;
    private int pacienteId; // Chave estrangeira para o paciente

    public AvaliacaoNutricional() {}

    public AvaliacaoNutricional(int id, double peso, double altura, int pacienteId) {
        this.id = id;
        this.peso = peso;
        this.altura = altura;
        this.pacienteId = pacienteId;
        this.imc = calcularImc(peso, altura);
    }

    private double calcularImc(double p, double a) {
        if (a > 0) {
            return p / (a * a);
        }
        return 0.0;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { 
        this.peso = peso; 
        this.imc = calcularImc(this.peso, this.altura);
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { 
        this.altura = altura; 
        this.imc = calcularImc(this.peso, this.altura);
    }

    public double getImc() { return imc; }

    public int getPacienteId() { return pacienteId; }
    public void setPacienteId(int pacienteId) { this.pacienteId = pacienteId; }
}