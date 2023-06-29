package com.xworkzz.hospitalapp.hospital;

import com.xworkzz.hospitalapp.patientapp.Patient;

public interface Hospital {
    boolean addPatient(Patient patient);

    void getAllPatients();

    String getPatientByAddress(String address1);

    String getPatientNameByWard(int WardNo);

    String[] getPatientNameByDiseaseName(String diseaseName);

    boolean updatePatientDiseaseByPatientName(String existingName, String updateDisease);

    boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo);

    boolean updatePatientsAgeByPatientId(int existingPatientId, int updateAge);

    Patient getPatientById(int patient);

    String getPatientAttenderNameByPatientId(int patientId);

    String getStreetNameByPatientId(int existingId);
}


