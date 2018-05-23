package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.application.parameters.ProductParameter;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.ProductInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


public class SelectProductAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter, MachineInterface machine) {

        if(machine.productAvailable((String) parameter.getParameterContent())){
            System.out.println("Product Selected: " + parameter.getParameterContent());

        }
        else{
            System.out.println("Not present: " + parameter.getParameterContent());
        }



    }

}
