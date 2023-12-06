package Classes;

import Abstratas.ProfissionalSaude;
import Exception.SinaisVItaisException;
import Interface.Monitoramento;

public class Medico extends ProfissionalSaude {
    public Medico(String nome, int idade, String especialidade) {
        super(nome, idade, especialidade);
    }

    @Override
    public void realizarAtendimento(Paciente paciente) throws SinaisVItaisException {
        System.out.println(getNome() + " esta realizando atendimento para o paciente "+paciente.getNome()+".");

    }

    public void mostraInfo() {
        System.out.println(getNome() + " sua especialidade é como " + getEspecialidade() + ".Trabalhando a 20 anos no hospital.");
    }


}
