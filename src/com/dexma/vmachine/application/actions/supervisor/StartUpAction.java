package com.dexma.vmachine.application.actions.supervisor;

import com.dexma.vmachine.application.EnumStateMachine;
import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

public class StartUpAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter) {

        VendingMachine.getInstance().setState(EnumStateMachine.ON);

        /*Tips and Tricks: first power, than print :p*/
        System.out.println("Powering Machine " + parameter.getParameterContent());

    }
}
