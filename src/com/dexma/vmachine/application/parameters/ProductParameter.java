package com.dexma.vmachine.application.parameters;

import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.ProductInterface;

public class ProductParameter implements ParameterInterface {

    private ProductInterface parameter;

    @Override
    public String getParameterDescription() {

        return "This parameter is a Product";
    }

    @Override
    public Object getParameterContent() {

        return parameter;
    }


    public void setParameter(ProductInterface parameter) {

        this.parameter = parameter;
    }


}
