package com.dexma.vmachine.application.actions.supervisor;

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


public class RegisterProductAction implements VendingMachineActionInterface {


    @Override
    public void execute(ParameterInterface parameter) {
        System.out.println("Registering product: " + parameter.getParameterContent());

    }
}
