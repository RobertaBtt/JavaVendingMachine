package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


public class ResetAction implements VendingMachineActionInterface {

    @Override
    public MachineInterface execute(ParameterInterface parameter, MachineInterface machine) {

        System.out.println("Resetting Machine " + parameter.getParameterContent());
        return  machine;

    }
}
