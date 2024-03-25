package org.example;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
    @Test
    void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(10,"USD"); //SUT

        assertThat(money.getAmount()).isEqualTo(10);//El SUT se pone a prueba
        assertThat(money.getCurrency()).isEqualTo("USD"); //El SUt se pone a prueba
    }

}