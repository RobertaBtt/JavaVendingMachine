package com.dexma.vmachine.application.parameters;

import com.dexma.vmachine.resources.ParameterInterface;

public class StringParameter implements ParameterInterface {

    private String parameter;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }


    @Override
    public String getParameterDescription() {

        return "This parameter is a text";
    }

    @Override
    public String getParameterContent() {
        return null;
    }
}
