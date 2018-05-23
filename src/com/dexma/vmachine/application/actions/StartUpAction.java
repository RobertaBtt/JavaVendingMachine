package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

public class StartUpAction implements VendingMachineActionInterface {

    @Override
    public MachineInterface execute(ParameterInterface parameter, MachineInterface machine) {

        System.out.println("Powering Machine " + parameter.getParameterContent());
        return machine;

    }
}
