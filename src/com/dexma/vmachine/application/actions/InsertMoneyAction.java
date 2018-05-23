package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


/**
 * With this method the user insert the money inside the machine
 */
public class InsertMoneyAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter, MachineInterface machine) {

        System.out.println("Inserting money:" + parameter.getParameterContent());
        machine.incrementAmount( Float.parseFloat(String.valueOf(parameter.getParameterContent())));

    }
}
