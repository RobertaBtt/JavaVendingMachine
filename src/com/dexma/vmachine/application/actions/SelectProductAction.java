package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


public class SelectProductAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter) {

        System.out.println("Product Selected: " + parameter.getParameterContent());

    }
}
