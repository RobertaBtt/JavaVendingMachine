package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

import java.util.List;

public class ProductEmissionAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter) {

        System.out.println("Here it is your " + parameter.getParameterContent());
    }
}
