package modelo;

public class Consulta {
    private int id;
    private String data;
    private boolean realizada;
    private String receita;
    private int pacienteId; // Chave estrangeira para o paciente

    public Consulta() {}

    public Consulta(int id, String data, boolean realizada, String receita, int pacienteId) {
        this.id = id;
        this.data = data;
        this.realizada = realizada;
        this.receita = receita;
        this.pacienteId = pacienteId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public boolean isRealizada() { return realizada; }
    public void setRealizada(boolean realizada) { this.realizada = realizada; }

    public String getReceita() { return receita; }
    public void setReceita(String receita) { this.receita = receita; }

    public int getPacienteId() { return pacienteId; }
    public void setPacienteId(int pacienteId) { this.pacienteId = pacienteId; }
}