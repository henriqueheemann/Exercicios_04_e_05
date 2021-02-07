package questao_04;

public class SalaConferencia extends Sala {
    
    short qtdCamera;

    public short getQtdCamera() {
        return qtdCamera;
    }

    public void setQtdCamera(short qtdCamera) {
        this.qtdCamera = qtdCamera;
    }

    public SalaConferencia(short qtdCamera, short capacidadePessoas, short qtdQuadro, short qtdMesa, short qtdReprojetor, short qtdTelaProjecao, short qtdTelevisao, String numeroIdentificacaoSala, String tipoSalaAula) {
        super(capacidadePessoas, qtdQuadro, qtdMesa, qtdReprojetor, qtdTelaProjecao, qtdTelevisao, numeroIdentificacaoSala, tipoSalaAula);
        this.qtdCamera = qtdCamera;
    }
    
    public void construirSalaVideoConferencia() {
        System.out.println("Quantidade de cadeiras: " + capacidadePessoas + 
                           "\nQuantidade de quadros: " + qtdQuadro + 
                           "\nQuantidade de mesas para o professor: " + qtdMesa +
                           "\nQuantidade de reprojetores: " + qtdReprojetor + 
                           "\nQuantidade de tela para projeção: " + qtdTelaProjecao +
                           "\nQuantidade de televisões: " + qtdTelevisao +
                           "\nQuantidade de câmeras: " + qtdCamera);
    }
}
