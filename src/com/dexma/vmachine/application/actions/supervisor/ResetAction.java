package com.dexma.vmachine.application.actions.supervisor;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


public class ResetAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter) {

        System.out.println("Resetting Machine " + parameter.getParameterContent());
        VendingMachine.getInstance().decrementAmount(VendingMachine.getInstance().getCurrentAmount());

    }
}
