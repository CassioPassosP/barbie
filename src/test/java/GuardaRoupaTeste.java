import org.example.GuardaRoupa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Sistema do guarda-roupa da Barbie.
 *
 * <p>ATENÇÃO: este código foi entregue pela equipe e a Barbie
 * relatou comportamentos estranhos. Sua missão é descobrir
 * onde ele está errado - e provar com testes.</p>
 */
public class GuardaRoupaTeste {

    private double orcamento;

//    /**
//     * Cria o guarda-roupa com um orçamento disponível.
//     *
//     * @param orcamento valor máximo para gastar em looks
//     */

//    /**
//     * Calcula o preço de um look com desconto.
//     *
//     * <p>Regra: o desconto deve estar entre 0 e 100.
//     * Fora disso, é erro de cadastro e deve avisar.</p>
//     *
//     * @param preco      preço original do look
//     * @param percentual desconto de 0 a 100
//     * @return preço final
//     */

    @Test
    @DisplayName("Nao deve aceitar desconto abaixo de 0 e a cima de 100")
    public void devePrecoComDesconto() {

        // ARRANGE - Criar objeto e definir os valores.

        GuardaRoupa guardaRoupa = new GuardaRoupa(200.00);

        // ACT - Chamar o método

        double resultado = guardaRoupa.precoComDesconto(100,100);

        // ASSERT - Conferir se o valor bate com o esperado da regra

        assertTrue(resultado >= 0 && resultado <= 100,
                () -> "O resultado deveria estar entre 0 e 100, mas foi: " + resultado);

    }

//    /**
//     * Diz se um look cabe no orçamento.
//     *
//     * <p>Regra: o orçamento inclui o valor exato.</p>
//     *
//     * @param preco preço do look
//     * @return true se couber no orçamento
//     */

    //esse metodo nao esta funcionando corretamente
    @Test
    @DisplayName("Deve aceitar um look com preço igual ou abaixo do orçamentoo")
    public void deveCabeNoOrcamento() {

        // ARRANGE - Criar objeto e definir os valores.
        double orcamento = 200.00;
        GuardaRoupa guardaRoupa = new GuardaRoupa(orcamento);
        double preco = 200.00;

        // ACT - Chamar o método

        boolean resultado = guardaRoupa.cabeNoOrcamento(preco);

        // ASSERT - Conferir se o valor bate com o esperado da regra

        assertTrue(resultado,
                () -> "O resultado deve ser verdadeiro enquanto o preco for igual ou menor a :" + orcamento);

    }

//    /**
//     * Diz se um look é de gala.
//     *
//     * <p>Regra: acima de 200 reais é gala.</p>
//     *
//     * @param preco preço do look
//     * @return true se for de gala
//     */

    @Test
    @DisplayName("Deve considerar look de gala quando o preço for superior a R$ 200")
    public void deveEhDeGala() {
        // ARRANGE - Criar objeto e definir os valores.
        double orcamento = 200.00;
        GuardaRoupa guardaRoupa = new GuardaRoupa(orcamento);
        double preco = 200.00;

        // ACT - Chamar o método

        boolean resultado = guardaRoupa.ehDeGala(preco);

        // ASSERT - Conferir se o valor bate com o esperado da regra

        assertTrue(resultado,
                () -> "O resultado deve ser verdadeiro enquanto o preco for maior que 200");

    }

//    /**
//     * Registra uma compra e desconta do orçamento.
//     *
//     * @param preco valor pago pelo look
//     */

    @Test
    public void deveRegistrarCompra() {
        // ARRANGE - Criar objeto e definir os valores.
        double orcamento = 200.00;
        GuardaRoupa guardaRoupa = new GuardaRoupa(orcamento);
        double preco = 200.00;

        double orcamentoFinal = preco - orcamento;

        // ACT - Chamar o método

        guardaRoupa.registrarCompra(preco);

        // ASSERT - Conferir se o valor bate com o esperado da regra

        assertEquals(guardaRoupa.getOrcamento(),
                orcamentoFinal);

    }

    /**
     * Devolve o orçamento restante.
     *
     * @return valor ainda disponível
     */


    public double getOrcamento() {
        return orcamento;
    }

}
