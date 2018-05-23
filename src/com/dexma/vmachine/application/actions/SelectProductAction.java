package com.dexma.vmachine.application.actions;

import com.dexma.vmachine.application.parameters.ProductParameter;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.ProductInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


public class SelectProductAction implements VendingMachineActionInterface {

    @Override
    public MachineInterface execute(ParameterInterface parameter, MachineInterface machine) {

        ProductInterface productTocheck = (ProductInterface)parameter.getParameterContent();

        if(machine.productAvailable(productTocheck)){
            if (machine.getCurrentAmount()>= productTocheck.getPrice()){
                System.out.println("Product Selected: " + productTocheck.getDescription());
                machine = machine.removeProduct(productTocheck, machine);
//                if (machine.getCurrentAmount()> productTocheck.getPrice()){
//                    System.out.println("Here it is the rest of your money : " + (machine.getCurrentAmount() - (productTocheck.getPrice())));
//                }
                machine = machine.decrementAmount(productTocheck.getPrice(), machine);

            }
            else{
                System.out.println("Please add : " + (productTocheck.getPrice() - machine.getCurrentAmount()));
            }

        }
        else{
            System.out.println("Not present: " + productTocheck.getDescription());
        }

        return machine;


    }

}
