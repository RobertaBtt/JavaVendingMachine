package com.dexma.vmachine.application.actions.supervisor;

import com.dexma.vmachine.application.EnumStateMachine;
import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


public class PowerOffAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter) {

        /*Tips and Tricks: first print, than power off :p*/
        System.out.println("Powerin Off Machine " + parameter.getParameterContent());

        VendingMachine.getInstance().setState(EnumStateMachine.OFF);
    }
}
