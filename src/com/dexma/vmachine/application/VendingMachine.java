package com.dexma.vmachine.application;


/*Macchina a stati - State Machine */

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements MachineInterface {

    private int state;
    private List<VendingMachineActionInterface> machineActions = new ArrayList<VendingMachineActionInterface>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void addAction(VendingMachineActionInterface machineAction){
        machineActions.add(machineAction);

    }

    public void removeAction(VendingMachineActionInterface machineAction){
        machineActions.remove(machineAction);

    }


}
