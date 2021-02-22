package operation;

import av.exam.jbehave.Calculator;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.junit.Assert;

public class OperationTest1 {
//    @Steps

    Calculator calc;

    @Given("create instance of calculator")
    public void create() {
        calc = new Calculator();
    }

    @When("add argument <value1> and <value2>")
    public void add(long value1, long value2) {
        calc.add(value1, value2);
    }

    @Then("result should be <result>")
    public void result(long result) {
        Assert.assertEquals(result, calc.getLastResult());
    }

}
