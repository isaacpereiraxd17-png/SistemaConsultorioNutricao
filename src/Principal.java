package sistemaconsultorionutricao;

import modelo.Paciente;
import modelo.Consulta;
import modelo.AvaliacaoNutricional;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== PROTÓTIPO DO SISTEMA DE NUTRIÇÃO ===");
        
        // 1. Cadastrando um Paciente (Simulação de registro)
        Paciente p = new Paciente(1, "Ana Maria", "123.456.789-00", "(11) 98765-4321", 30);
        System.out.println("Paciente cadastrado: " + p.getNome() + " | CPF: " + p.getCpf());
        
        // 2. Registrando uma Consulta para o Paciente
        Consulta c = new Consulta(1, "25/08/2026", false, "", p.getId());
        System.out.println("Consulta agendada para o dia: " + c.getData() + " (Realizada: " + c.isRealizada() + ")");
        
        // 3. Realizando uma Avaliação Nutricional
        AvaliacaoNutricional aval = new AvaliacaoNutricional(1, 65.5, 1.68, p.getId());
        System.out.println("Avaliação Física -> Peso: " + aval.getPeso() + "kg | Altura: " + aval.getAltura() + "m | IMC: " + String.format("%.2f", aval.getImc()));
        
        // 4. Finalizando a Consulta (Simulando a regra de negócio)
        c.setReceita("Dieta rica em fibras e ingestão de 2L de água diários.");
        c.setRealizada(true);
        System.out.println("\n--- APÓS FINALIZAÇÃO DA CONSULTA ---");
        System.out.println("Status Realizada: " + c.isRealizada());
        System.out.println("Prescrição/Observações: " + c.getReceita());
    }
}