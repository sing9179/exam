/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase 
{

    double calculate() {
        return 0;
       
    }
    public enum Base{Plus, Minus, TIMES, Divide};
    private Base value;
    public enum Add{"x+y","x-y", "x*y", "x/y"};
    private Add  user;

    public ArithmeticBase(Base va, Add users)
    {
       this.value = va;
       this.user = users;
    }


    /**
     * @return the value
     */
    public Base getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Base value) {
        this.value = value;
    }
}
