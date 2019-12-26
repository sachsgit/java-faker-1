package com.github.javafaker;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BusinessTest extends AbstractFakerTest {
    @Test
    public void creditCardNumber() {
        assertThat(faker.business().creditCardNumber(), isStringWithContents());
    }

    @Test
    public void creditCardType() {
        assertThat(faker.business().creditCardType(), isStringWithContents());
    }

    @Test
    public void creditCardExpiry() {
        assertThat(faker.business().creditCardExpiry(), isStringWithContents());
    }

}
