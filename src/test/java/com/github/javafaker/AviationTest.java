package com.github.javafaker;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import com.github.javafaker.repeating.Repeat;

public class AviationTest extends AbstractFakerTest {

    @Test
    @Repeat(times=3)
    public void testAviation() {
        String airport = faker.aviation().airport();
        assertThat(airport, matchesRegularExpression("\\w{4}"));
    }
}