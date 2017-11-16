/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit.calculatorTest;

import JUnit.calculator.Sum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Producer
 */
public class SumTest {

    public SumTest() {
    }


    @Test
    public void testSummation() {
        System.out.println("summation");
        int[] nums = {1, 2, 3, 4, 5};
        Sum instance = new Sum();
        int expResult = 15;
        int result = instance.summation(nums);
        assertEquals(expResult, result);

    }

}
