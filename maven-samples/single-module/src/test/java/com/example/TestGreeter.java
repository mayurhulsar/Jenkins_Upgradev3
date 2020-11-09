package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "Hello";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

    @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "How ARE YOU ALL?";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

    @Test
  public void greetShouldIncludeContinueMessage() {
    String someone = "So What We have Here?";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
