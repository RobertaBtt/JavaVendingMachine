package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

/**
 * With this method the user cancel the action, and the machine retrieve the money back, if any
 */
public class CancelAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter) {

        System.out.println("Retrieving back the money - Action cancelled");
        VendingMachine.getInstance().incrementAmount( - VendingMachine.getInstance().getCurrentAmount());

    }
}
