package questao_04;

public class SalaLaboratorio extends Sala {

    public SalaLaboratorio(short capacidadePessoas, short qtdQuadro, short qtdMesa, short qtdReprojetor, short qtdTelaProjecao, short qtdTelevisao, String numeroIdentificacaoSala, String tipoSalaAula) {
        super(capacidadePessoas, qtdQuadro, qtdMesa, qtdReprojetor, qtdTelaProjecao, qtdTelevisao, numeroIdentificacaoSala, tipoSalaAula);
    }

    public void construirSalaComputacao() {
        System.out.println("Quantidade de cadeiras: " + capacidadePessoas + 
                           "\nQuantidade de quadros: " + qtdQuadro + 
                           "\nQuantidade de mesas para o professor: " + qtdMesa +
                           "\nQuantidade de reprojetores: " + qtdReprojetor + 
                           "\nQuantidade de tela para projeção: " + qtdTelaProjecao +
                           "\nQuantidade de televisões: " + qtdTelevisao);
    }
    
    public void construirSalaQuimica() {
        System.out.println("Quantidade de cadeiras: " + capacidadePessoas + 
                           "\nQuantidade de quadros: " + qtdQuadro + 
                           "\nQuantidade de mesas para o professor: " + qtdMesa +
                           "\nQuantidade de reprojetores: " + qtdReprojetor + 
                           "\nQuantidade de tela para projeção: " + qtdTelaProjecao +
                           "\nQuantidade de televisões: " + qtdTelevisao);
    }
    
    public void construirSalaFisica() {
        System.out.println("Quantidade de cadeiras: " + capacidadePessoas + 
                           "\nQuantidade de quadros: " + qtdQuadro + 
                           "\nQuantidade de mesas para o professor: " + qtdMesa +
                           "\nQuantidade de reprojetores: " + qtdReprojetor + 
                           "\nQuantidade de tela para projeção: " + qtdTelaProjecao +
                           "\nQuantidade de televisões: " + qtdTelevisao);
    }
    
    public void construirSalaBiologia() {
        System.out.println("Quantidade de cadeiras: " + capacidadePessoas + 
                           "\nQuantidade de quadros: " + qtdQuadro + 
                           "\nQuantidade de mesas para o professor: " + qtdMesa +
                           "\nQuantidade de reprojetores: " + qtdReprojetor + 
                           "\nQuantidade de tela para projeção: " + qtdTelaProjecao +
                           "\nQuantidade de televisões: " + qtdTelevisao);
    }
}
