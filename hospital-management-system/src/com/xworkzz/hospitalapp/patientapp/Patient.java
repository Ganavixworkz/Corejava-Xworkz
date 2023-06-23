package com.xworkzz.hospitalapp.patientapp;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import com.xworkzz.hospitalapp.address.Address1;
import com.xworkzz.hospitalapp.constant.Gender;
import com.xworkzz.hospitalapp.constant.GovtProof;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
   // private String address;
    private int WardNo;
    private  int age;
    Address1 address;


}
