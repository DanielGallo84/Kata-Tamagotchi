package com.kata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
@Disabled("Just an example")
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Disabled("Just an example")
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithTrueUsinHamcrest() 
    {
        assertThat(true, is(true));
    }
}
