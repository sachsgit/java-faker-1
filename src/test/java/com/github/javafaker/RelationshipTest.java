package com.github.javafaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyOrNullString;
import static org.hamcrest.core.IsNot.not;

import org.junit.Test;

public class RelationshipTest extends AbstractFakerTest {
    
    @Test
    public void anyTest() {
        assertThat(faker.relationships().any(), not(emptyOrNullString()));
    }
    
    @Test
    public void directTest() {
        assertThat(faker.relationships().direct(), not(emptyOrNullString()));
    }
    
    @Test
    public void extendedTest() {
        assertThat(faker.relationships().extended(), not(emptyOrNullString()));
    }
    
    @Test
    public void inLawTest() {
        assertThat(faker.relationships().inLaw(), not(emptyOrNullString()));
    }
    
    @Test
    public void spouseTest() {
        assertThat(faker.relationships().spouse(), not(emptyOrNullString()));
    }
    
    @Test
    public void parentTest() {
        assertThat(faker.relationships().parent(), not(emptyOrNullString()));
    }
    
    @Test
    public void siblingTest() {
        assertThat(faker.relationships().sibling(), not(emptyOrNullString()));
    }

}