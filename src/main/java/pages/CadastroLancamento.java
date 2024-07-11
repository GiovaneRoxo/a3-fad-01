package pages;

import lancamento.LancamentoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CadastroLancamento extends LancamentoPage {

    @FindBy(id = "Adicionar")
    private WebElement btnAdicionar;
    @FindBy(id = "Editar")
    private WebElement btnEditar;
    @FindBy(id = "Exibir")
    private WebElement btnExibir;
    @FindBy(id = "Excluir")
    private WebElement btnExcluir;
    @FindBy(id = "idLancamento")
    private WebElement txIdLancamento;
    @FindBy(id = "idBase")
    private WebElement txIdBase;
    @FindBy(id = "idUsuario")
    private WebElement txIdUsuario;


    @FindBy(id = "idDespesa")
    private WebElement txIdDespesa;
    @FindBy(id = "competenciaDespesa")
    private WebElement txCompetenciaDespesa;
    @FindBy(id = "dataVencimento")
    private WebElement txDataVencimento;
    @FindBy(id = "valorLiquido")
    private WebElement txValorLiquido;
    @FindBy(id = "valorMulta")
    private WebElement txValorMulta;
    @FindBy(id = "valorCorrecao")
    private WebElement txValorCorrecao;
    @FindBy(id = "dataCadastro")
    private WebElement txDataCadastro;



    @FindBy(id = "sim")
    private WebElement rdSim;
    @FindBy(id = "nao")
    private WebElement rdNao;
    @FindBy(id = "cadastro")
    private WebElement btnCadastro;

    public CadastroLancamento clicarAdicionar() {
        btnAdicionar.click();
        return this;
    }
    public CadastroLancamento clicarEditar() {
        btnEditar.click();
        return this;
    }
    public CadastroLancamento clicarExibir() {
        btnExibir.click();
        return this;
    }
    public CadastroLancamento clicarExcluir() {
        btnExcluir.click();
        return this;
    }

    public CadastroLancamento informarIdLancamento(String idLancamento){
        txIdLancamento.sendKeys(idLancamento);
        return this;
    }

    public CadastroLancamento informarIdBase (String idBase){
        txIdBase.sendKeys(idBase);
        return this;
    }
    public CadastroLancamento informarIdUsuario (String idUsuario){
        txIdUsuario.sendKeys(idUsuario);
        return this;
    }
    
    public CadastroLancamento informarCompetenciaDespesa (String competenciaDespesa){
        txCompetenciaDespesa.sendKeys(competenciaDespesa);
        return this;
    }

    public CadastroLancamento informarDataVencimento (String dataVencimento){
        txDataVencimento.sendKeys(dataVencimento);
        return this;
    }

    public CadastroLancamento informarValorLiquido (float valorLiquido){
        txValorLiquido.sendKeys(String.valueOf(valorLiquido));
        return this;
    }

    public CadastroLancamento informarValorMulta (float valorMulta){
        txValorMulta.sendKeys(String.valueOf(valorMulta));
        return this;
    }

    public CadastroLancamento informarValorCorrecao (float valorCorrecao){
        txValorCorrecao.sendKeys(String.valueOf(valorCorrecao));
        return this;
    }

    public CadastroLancamento informarDataCadastro (String dataCadastro){
        txDataCadastro.sendKeys(dataCadastro);
        return this;
    }

    public CadastroLancamento selecionarSim() {
        rdSim.click();
        return this;
    }

    public CadastroLancamento clicarCadastro() {
        btnCadastro.click();
        return this;
    }


public CadastroLancamento(WebDriver driver){
        super(driver);
    }
}
