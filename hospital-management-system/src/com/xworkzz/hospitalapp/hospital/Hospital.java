package com.xworkzz.hospitalapp.hospital;

import com.xworkzz.hospitalapp.patientapp.Patient;

public interface Hospital {
    boolean addPatient(Patient patient);
    void getAllPatients();
}
