package questao_04;

public class SalaInteligente extends Sala {

    short qtdComputadorAluno;

    public short getQtdComputadorAluno() {
        return qtdComputadorAluno;
    }

    public void setQtdComputadorAluno(short qtdComputadorAluno) {
        this.qtdComputadorAluno = qtdComputadorAluno;
    }

    public SalaInteligente(short qtdComputadorAluno, short capacidadePessoas, short qtdQuadro, short qtdMesa, short qtdReprojetor, short qtdTelaProjecao, short qtdTelevisao, String numeroIdentificacaoSala, String tipoSalaAula) {
        super(capacidadePessoas, qtdQuadro, qtdMesa, qtdReprojetor, qtdTelaProjecao, qtdTelevisao, numeroIdentificacaoSala, tipoSalaAula);
        this.qtdComputadorAluno = qtdComputadorAluno;
    }

    public void construirSalaInteligente() {
        System.out.println("Quantidade de cadeiras: " + capacidadePessoas
                + "\nQuantidade de quadros: " + qtdQuadro
                + "\nQuantidade de mesas para o professor: " + qtdMesa
                + "\nQuantidade de reprojetores: " + qtdReprojetor
                + "\nQuantidade de tela para projeção: " + qtdTelaProjecao
                + "\nQuantidade de televisões: " + qtdTelevisao
                + "\nQuantidade de computadores para os alunos: " + qtdComputadorAluno);
    }
}
