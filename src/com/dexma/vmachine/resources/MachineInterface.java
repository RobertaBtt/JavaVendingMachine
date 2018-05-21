package com.dexma.vmachine.resources;


public interface MachineInterface {

    int getState();

    void setState(int state);

    void addAction(VendingMachineActionInterface machineAction);

    void removeAction(VendingMachineActionInterface machineAction);

    boolean actionAvailable(VendingMachineActionInterface machineAction);

    void callAction(VendingMachineActionInterface machineAction,  ParameterInterface parameter);

}
