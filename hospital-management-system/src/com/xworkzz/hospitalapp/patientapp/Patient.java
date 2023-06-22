package com.xworkzz.hospitalapp.patientapp;

import com.xworkzz.hospitalapp.constant.Gender;
import com.xworkzz.hospitalapp.constant.GovtProof;
import lombok.Data;

@Data
public class Patient {
    private int patientId;
    private String name;
    private long phoneNumber;
    private boolean isInsuranceAvailable;
    private String attenderName;
    private String bloodGroup;
    private String diseaseName;
    Gender gender;
    GovtProof govtProof;
    private String address;
    private int WardNo;



}
