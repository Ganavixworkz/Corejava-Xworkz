package com.xworkzz.hospitalapp.hospital;

import com.xworkzz.hospitalapp.patientapp.Patient;

public interface Hospital {
    boolean addPatient(Patient patient);
    void getAllPatients();
    String getPatientByAddress(String address);

    String getPatientNameByWard(int WardNo);

    String getPatientNameByDiseaseName(String diseaseName);

    boolean updatePatientDiseaseByPatientName(String existingName,String updateDisease);

    boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo);
    }


