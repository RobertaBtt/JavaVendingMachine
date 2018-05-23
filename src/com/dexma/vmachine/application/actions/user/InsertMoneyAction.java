package com.dexma.vmachine.application.actions.user;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


/**
 * With this method the user insert the money inside the machine
 */
public class InsertMoneyAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter) {

        System.out.println("Inserting money:" + parameter.getParameterContent());
        VendingMachine.getInstance().incrementAmount( Float.parseFloat(String.valueOf(parameter.getParameterContent())));

    }
}
