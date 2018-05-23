package com.dexma.vmachine.application.actions.user;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.parameters.ProductParameter;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.ProductInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;


public class SelectProductAction implements VendingMachineActionInterface {

    @Override
    public void execute(ParameterInterface parameter) {

        ProductInterface productTocheck = (ProductInterface)parameter.getParameterContent();

        if(VendingMachine.getInstance().productAvailable(productTocheck)){
            if (VendingMachine.getInstance().getCurrentAmount()>= productTocheck.getPrice()){

                System.out.println("Product Selected: " + productTocheck.getDescription());
                VendingMachine.getInstance().removeProduct(productTocheck);
//                if (machine.getCurrentAmount()> productTocheck.getPrice()){
//                    System.out.println("Here it is the rest of your money : " + (machine.getCurrentAmount() - (productTocheck.getPrice())));
//                }
                VendingMachine.getInstance().decrementAmount(productTocheck.getPrice());

            }
            else{
                System.out.println("Please add : " + (productTocheck.getPrice() - VendingMachine.getInstance().getCurrentAmount()));
            }

        }
        else{
            System.out.println("Not present: " + productTocheck.getDescription());
        }


    }

}
