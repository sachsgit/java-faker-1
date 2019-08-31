package com.github.javafaker;

import static org.hamcrest.Matchers.isOneOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class BoolTest extends AbstractFakerTest {

    @Test
    public void testBool() {
        for (int i = 0; i < 100; i++) {
            assertThat(faker.bool().bool(), isOneOf(true, false));
        }
    }
}
