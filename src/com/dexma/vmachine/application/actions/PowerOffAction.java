package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

import java.util.List;

public class PowerOffAction implements VendingMachineActionInterface {

    @Override
    public void execute(List<ParameterInterface> parameters) {

        for (ParameterInterface parameter : parameters) {
            System.out.println("Powerin Off Machine " + parameter.getParameterContent());
        }

    }
}
