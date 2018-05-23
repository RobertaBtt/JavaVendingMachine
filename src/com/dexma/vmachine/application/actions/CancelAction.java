package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

/**
 * With this method the user cancel the action, and the machine retrieve the money back, if any
 */
public class CancelAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter, MachineInterface machine) {

        System.out.println("Cancelling request of product " + parameter.getParameterContent());
        machine.incrementAmount( - machine.getCurrentAmount(), machine);

    }
}
