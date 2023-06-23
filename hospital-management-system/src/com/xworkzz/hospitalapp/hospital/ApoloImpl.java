package com.xworkzz.hospitalapp.hospital;

import com.xworkzz.hospitalapp.patientapp.Patient;

import java.sql.SQLOutput;

public class ApoloImpl implements Hospital {
    Patient patient[];
    int index;

    public ApoloImpl(int size) {
        patient = new Patient[size];
    }

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("invoked addPatient method");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("Patient check is completed...proceed to add patient");
            if (patient.getName() != null &&
                    !patient.getName().isEmpty() && patient.getBloodGroup() != null
                    && !patient.getBloodGroup().isEmpty()) {
                this.patient[index] = patient;
                index++;
                isAdded = true;
                System.out.println("patient name is added");

            } else {
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
        for (Patient pat : this.patient) {
            System.out.println(pat);
        }

    }

    @Override
    public String getPatientByAddress(String address1) {
        for (int i = 0; i < this.patient.length; i++)
            if (this.patient[i].getAddress().equals(address1)) {
                System.out.println(this.patient[i]);
            } else {
                System.out.println("address not matched");
            }
        return null;
    }

    @Override
    public String getPatientNameByWard(int WardNo) {
        System.out.println("invoked");
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getWardNo() == WardNo) {
                StringBuilder patientName = new StringBuilder();
                patientName = patientName.append(this.patient[i].getName());
                System.out.println(patientName);
            }
        }
        return "not found";
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("invoked");
        for (int i=0; i < this.patient.length; i++) {
            if (this.patient[i].getDiseaseName().equals(diseaseName)) {
                StringBuilder patientName = new StringBuilder();
                patientName = patientName.append(this.patient[i].getName());
                System.out.println(patientName);
            }
        }
            return null;
        }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingName, String updateDisease) {
        boolean isUpdated=false;
        for(int i=0;i<patient.length;i++) {
            if (this.patient[i].getName().equals(existingName)) {
                this.patient[i].setDiseaseName(updateDisease);
                isUpdated = true;
                System.out.println("Disease name is updated");
                System.out.println(this.patient[i]);
            }
        }
        return isUpdated;

        }


    @Override
    public boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo) {
        boolean isUpdate=false;
        for (int i=0;i< patient.length;i++){
            if(this.patient[i].getPatientId()==(existingId)){
                this.patient[i].setWardNo( updateWardNo);
                isUpdate=true;
                System.out.println("Ward Number updated");
                System.out.println(this.patient[i]);
            }
        }
        return isUpdate;
    }

    @Override
    public boolean updatePatientsAgeByPatientId(int existingPatientId, int updateAge) {
        boolean isUpdated=false;
        for(int i=0;i<patient.length;i++){
            if(this.patient[i].getPatientId()==(existingPatientId)){
                this.patient[i].setAge(updateAge);
                isUpdated=true;
                System.out.println("Age updated");
                System.out.println(this.patient[i]);
            }
        }
        return isUpdated;
    }

    @Override
    public Patient getPatientById(int patient) {
        System.out.println("invoked");
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getPatientId() == patient) {
                StringBuilder patientId = new StringBuilder();
                patientId = patientId.append(this.patient[i].getName());
                System.out.println(patientId);
            }
        }
            return  null;
        }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) {
            System.out.println("invoked");
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getPatientId()==(patientId)) {
                    StringBuilder AttenderName = new StringBuilder();
                    AttenderName = AttenderName.append(this.patient[i].getAttenderName());
                    System.out.println(AttenderName);
                }
            }
        return null;
    }

    @Override
    public String getStreetNameByPatientId(int existingId) {
        System.out.println("invoked");
        String streetName=null;
        for(   Patient p1 :patient){
            if(p1.getPatientId()==existingId){
                streetName=p1.getAddress().getCountry().getState().getCity().getArea().getStreet().getStreetName();}
        }
        return streetName;
    }
}


