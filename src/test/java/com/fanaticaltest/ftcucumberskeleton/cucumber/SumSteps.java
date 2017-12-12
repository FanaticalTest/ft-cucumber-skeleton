package com.fanaticaltest.ftcucumberskeleton.cucumber;

import com.fanaticaltest.ftcucumberskeleton.features.Sum;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SumSteps extends Sum {


    @Given("^the first value is \"([^\"]*)\"$")
    public void the_first_value_is(String firstValue) throws Exception {
        setFirstIntValue(Integer.valueOf(firstValue));
    }

    @Given("^the second value is \"([^\"]*)\"$")
    public void the_second_value_is(String secondValue) throws Exception {
        setSecondIntValue(Integer.valueOf(secondValue));
    }

    @Then("^the sum is equal to \"([^\"]*)\"$")
    public void the_sum_is_equal_to(String sumValue) throws Exception {
        Assert.assertEquals(Long.valueOf(sumValue),Long.valueOf(calculate()));
    }


}