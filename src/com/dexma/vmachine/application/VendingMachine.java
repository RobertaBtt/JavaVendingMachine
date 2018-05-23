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
    private List<ProductInterface> products = new ArrayList<ProductInterface>();
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
    public boolean productAvailable(ProductInterface product) {

        return this.products.contains(product);
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
    public MachineInterface incrementAmount(float money, MachineInterface machine) {

        this.totalMoney += money;
        return this;
    }

    @Override
    public MachineInterface decrementAmount(float money, MachineInterface machine) {
        if (this.totalMoney > money)
            this.totalMoney -= money;
        return  machine;
    }


    /***
     *
     * @param machineAction that comes from the user
     * @param parameter
     * @param machine
     */
    @Override
    public MachineInterface callUserAction(VendingMachineActionInterface machineAction, ParameterInterface parameter, MachineInterface machine) {

        return machineAction.execute(parameter, machine);
    }

    /**
     * Action that come from the Machine Supplier
     * @param product
     */
    @Override
    public void addProduct(ProductInterface product) {
        products.add(product);
    }

    @Override
    public MachineInterface removeProduct(ProductInterface product, MachineInterface machine) {

        if (products.contains(product)){
            products.remove(product);
        }

        return machine;
    }


}
