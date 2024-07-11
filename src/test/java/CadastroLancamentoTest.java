import lancamento.LancamentoTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CadastroLancamentoTest extends LancamentoTest {
    @Test
    public void validarCadastro() {
        CadastroLancamentoTest page = new CadastroLancamentoTest(getDriver());

        String resultado = page.clicarAdicionar()
                .informarIdLancamento("01")
                .informarIdBase("01")
                .informarIdUsuario("01")
                .informarIdDespesa("01")
                .informarCompetenciaDespesa("teste")
                .informarDataVencimento("0000-00-00")
                .informarValorLiquido(300.00)
                .informarValorMulta(300.00)
                .informarValorCorrecao(300.00)
                .informarDataCadastro("0000-00-00")
                .selecionarSim()
                .clicarCadastro()
                .buscarResultadoCadastro();
        try{
            getDriver().wait();
            Assert.assertTrue(resultado.contains("Lancamento cadastrado com sucesso!"));
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
