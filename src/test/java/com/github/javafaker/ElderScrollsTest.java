

package com.github.javafaker;

import static org.hamcrest.Matchers.emptyOrNullString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class ElderScrollsTest extends AbstractFakerTest  {

    @Test
    public void testCity() {
        assertThat(faker.elderScrolls().city(), not(emptyOrNullString()));
    }

    @Test
    public void testCreature() {
        assertThat(faker.elderScrolls().creature(), not(emptyOrNullString()));
    }

    @Test
    public void testDragon() {
        assertThat(faker.elderScrolls().dragon(), not(emptyOrNullString()));
    }

    @Test
    public void testFirstName() {
        assertThat(faker.elderScrolls().firstName(), not(emptyOrNullString()));
    }

    @Test
    public void testLastName() {
        assertThat(faker.elderScrolls().lastName(), not(emptyOrNullString()));
    }

    @Test
    public void testRace() {
        assertThat(faker.elderScrolls().race(), not(emptyOrNullString()));
    }

    @Test
    public void testRegion() {
        assertThat(faker.elderScrolls().region(), not(emptyOrNullString()));
    }
}