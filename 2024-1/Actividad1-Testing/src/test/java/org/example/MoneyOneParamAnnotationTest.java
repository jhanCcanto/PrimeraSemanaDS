package org.example;

import org.junit.jupiter.params.ParameterizedTest;//JUnit Para recibir parametros de entrada
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

public class MoneyOneParamAnnotationTest {

    @ParameterizedTest
    @ValueSource(ints = {10,15,50})//Proveedor de datos de prueba ValueSource
    void constructorShouldSetAmountAndCurrency(int amount){//Firma de metodo: Nombre del metodo mas la lista de los parametros
        Money money = new Money(amount,"USD");
        assertThat(money.getAmount()).isEqualTo(amount);
    }
}
