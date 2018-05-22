package com.dexma.vmachine.application;


/*Macchina a stati - State Machine */

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.ProductInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements MachineInterface {

    private int state;
    private List<VendingMachineActionInterface> machineActions = new ArrayList<VendingMachineActionInterface>();

    /**
     *
     * @return
     */
    public int getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     *
     * @param machineAction
     */
    public void addAction(VendingMachineActionInterface machineAction){
        machineActions.add(machineAction);

    }

    /**
     *
     * @param machineAction
     */
    public void removeAction(VendingMachineActionInterface machineAction){
        machineActions.remove(machineAction);

    }

    /***
     *
     * @param machineAction
     * @return
     */
    @Override
    public boolean actionAvailable(VendingMachineActionInterface machineAction) {
        return this.machineActions.contains(machineAction);
    }

    /**
     *
     * @param machineAction
     * @param parameter
     */
    @Override
    public void callAction(VendingMachineActionInterface machineAction, ParameterInterface parameter) {

        machineAction.execute(parameter);

    }

    /**
     *
     * @param product
     */
    @Override
    public void addProduct(ProductInterface product) {

    }


}
