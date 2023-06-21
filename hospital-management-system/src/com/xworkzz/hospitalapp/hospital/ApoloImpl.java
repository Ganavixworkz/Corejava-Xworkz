package com.xworkzz.hospitalapp.hospital;

import com.xworkzz.hospitalapp.patientapp.Patient;

public class ApoloImpl implements Hospital {
    Patient patient[]=new Patient[15];
    int index;

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("invoked addPatient method");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("Patient check is completed...proceed to add patient");
            if (patient.getName()!= null &&
                    !patient.getName().isEmpty() && patient.getBloodGroup()!= null
                    && !patient.getBloodGroup().isEmpty())


            {
                this.patient[index] = patient;
                index++;
                isAdded = true;
                System.out.println("patient name is added");

            }else{
                System.out.println("patient name is exeeded");
            }
        } else {


            System.out.println("no patient");
        }
        return isAdded;

    }



    @Override
    public void getAllPatients() {
        System.out.println("invoked getAllPatients");
        System.out.println("list of patients are:");
        for(Patient pat:this.patient){
            System.out.println(pat);
        }

    }
}
