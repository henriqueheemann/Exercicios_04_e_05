package questao_04;

public class Sala {

    short capacidadePessoas, qtdQuadro, qtdMesa, qtdReprojetor, qtdTelaProjecao, qtdTelevisao;
    String numeroIdentificacaoSala;
    String tipoSalaAula;
    int[] assento = new int[40];

    public short getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(short capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public short getQtdQuadro() {
        return qtdQuadro;
    }

    public void setQtdQuadro(short qtdQuadro) {
        this.qtdQuadro = qtdQuadro;
    }

    public short getQtdMesa() {
        return qtdMesa;
    }

    public void setQtdMesa(short qtdMesa) {
        this.qtdMesa = qtdMesa;
    }

    public short getQtdReprojetor() {
        return qtdReprojetor;
    }

    public void setQtdReprojetor(short qtdReprojetor) {
        this.qtdReprojetor = qtdReprojetor;
    }

    public short getQtdTelaProjecao() {
        return qtdTelaProjecao;
    }

    public void setQtdTelaProjecao(short qtdTelaProjecao) {
        this.qtdTelaProjecao = qtdTelaProjecao;
    }

    public short getQtdTelevisao() {
        return qtdTelevisao;
    }

    public void setQtdTelevisao(short qtdTelevisao) {
        this.qtdTelevisao = qtdTelevisao;
    }

    public String getNumeroIdentificacaoSala() {
        return numeroIdentificacaoSala;
    }

    public void setNumeroIdentificacaoSala(String numeroIdentificacaoSala) {
        this.numeroIdentificacaoSala = numeroIdentificacaoSala;
    }

    public String getTipoSalaAula() {
        return tipoSalaAula;
    }

    public void setTipoSalaAula(String tipoSalaAula) {
        this.tipoSalaAula = tipoSalaAula;
    }

    public int[] getAssento() {
        return assento;
    }

    public void setAssento(int[] assento) {
        this.assento = assento;
    }

    public Sala(short capacidadePessoas, short qtdQuadro, short qtdMesa, short qtdReprojetor, short qtdTelaProjecao, short qtdTelevisao, String numeroIdentificacaoSala, String tipoSalaAula) {
        this.capacidadePessoas = capacidadePessoas;
        this.qtdQuadro = qtdQuadro;
        this.qtdMesa = qtdMesa;
        this.qtdReprojetor = qtdReprojetor;
        this.qtdTelaProjecao = qtdTelaProjecao;
        this.qtdTelevisao = qtdTelevisao;
        this.numeroIdentificacaoSala = numeroIdentificacaoSala;
        this.tipoSalaAula = tipoSalaAula;
    }
    
}
