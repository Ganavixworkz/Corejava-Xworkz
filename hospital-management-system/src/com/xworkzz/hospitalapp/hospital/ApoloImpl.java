package com.xworkzz.hospitalapp.hospital;

import com.xworkzz.hospitalapp.exception.DiseaseNotFoundException;
import com.xworkzz.hospitalapp.exception.NotFoundWardException;
import com.xworkzz.hospitalapp.exception.PatientIdNotFoundException;
import com.xworkzz.hospitalapp.patientapp.Patient;
import lombok.Data;

@Data
public class ApoloImpl implements Hospital {
    Patient patient[];
    int index;

    public ApoloImpl(int size) {
        patient = new Patient[size];
    }

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("invoked addPatient method");
        boolean isAdded = false;{
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
    public Patient getPatientByAddress(String address1) {
        Patient p1=null;
        for (Patient p : patient) {
            if (p.getPatientAddress().equals(address1)) {
                System.out.println(p1=p);
            }
        }
        return p1;
    }

    @Override
    public String getPatientNameByWard(int WardNo) {
        System.out.println("invoked");
        String str=null;
        for (Patient pa :patient){
            if (pa.getWardNo()==WardNo) {
                System.out.println(str=pa.getName());
            }
            else {
                NotFoundWardException exception = new NotFoundWardException(WardNo);
                throw exception;
            }
        }
        return str;
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("invoked");
        String[] patientName = new String[2];
        for (Patient p : patient){
            if (p.getDiseaseName().equals(diseaseName)) {
                System.out.println(p);
            }
            else {
                DiseaseNotFoundException d = new DiseaseNotFoundException();
                throw d;
            }
        }
            return patientName;
        }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingName, String updateDisease) {
        boolean isUpdated=false;
        for(Patient p:patient) {
            if (p.getName().equals(existingName)) {
                p.setDiseaseName(updateDisease);
                isUpdated = true;
                System.out.println("Disease name is updated");
                System.out.println(p);
            }
        }
        return isUpdated;

        }


    @Override
    public boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo) {
        boolean isUpdate=false;
        for (Patient p:patient){
            if(p.getPatientId()==(existingId)){
                p.setWardNo( updateWardNo);
                isUpdate=true;
                System.out.println("Ward Number updated");
                System.out.println(p);
            }
        }
        return isUpdate;
    }

    @Override
    public boolean updatePatientsAgeByPatientId(int existingPatientId, int updateAge) {
        boolean isUpdated=false;
        for(Patient p:patient){
            if(p.getPatientId()==(existingPatientId)){
                p.setAge(updateAge);
                isUpdated=true;
                System.out.println("Age updated");
                System.out.println(p);
            }
        }
        return isUpdated;
    }

    @Override
    public Patient getPatientById(int patientId) {
        System.out.println("invoked");
        Patient p1=null;
        for (Patient p : patient) {
            if (p.getPatientId() == patientId) {
                System.out.println(p1=p);
            }
            else {
                PatientIdNotFoundException pat = new PatientIdNotFoundException();
                throw pat;
            }
        }
            return p1;
        }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) {
            System.out.println("invoked");
            String str=null;
            for (Patient p:patient) {
                if (p.getPatientId()==(patientId)) {
                    System.out.println(str=p.getAttenderName());
                }
            }
        return str;
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


