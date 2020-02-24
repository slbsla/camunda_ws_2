package com.example.workflow;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Created by Samir on 23/02/2020.
 */
public class MyDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        try {

            String s = null;
            s.toCharArray();

        }catch(Exception ex) {
            ex.printStackTrace();
            delegateExecution.getProcessInstance().createIncident("10","a problem is occured");
            throw  new BpmnError("Problem while executing service");
        }
    }
}
