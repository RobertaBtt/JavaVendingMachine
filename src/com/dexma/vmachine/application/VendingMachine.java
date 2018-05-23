package com.dexma.vmachine.application;


/*Macchina a stati - State Machine */

import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.ProductInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements MachineInterface {

    private EnumStateMachine state;
    private List<VendingMachineActionInterface> machineActions = new ArrayList<VendingMachineActionInterface>();
    private List<String> products = new ArrayList<String>();
    private float totalMoney = 0.0f;


    public VendingMachine() {
        this.state = EnumStateMachine.TURNED_ON;
    }

    /**
     *
     * @return
     */
    public EnumStateMachine getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(EnumStateMachine state) {

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

    @Override
    public boolean productAvailable(String productDescription) {
        return this.products.contains(productDescription);
    }

    @Override
    public float getCurrentAmount() {
        return totalMoney;
    }

    /**
     *
     * @param money
     */
    @Override
    public void incrementAmount(float money) {
        this.totalMoney += money;
    }


    /***
     *
     * @param machineAction that comes from the user
     * @param parameter
     * @param machine
     */
    @Override
    public void callUserAction(VendingMachineActionInterface machineAction, ParameterInterface parameter, MachineInterface machine) {

        machineAction.execute(parameter, machine);

    }

    /**
     * Action that come from the Machine Supplier
     * @param product
     */
    @Override
    public void addProduct(String product) {
        products.add(product);
    }


}
