package com.xworkzz.hospitalapp;

import com.xworkzz.hospitalapp.constant.Gender;
import com.xworkzz.hospitalapp.constant.GovtProof;
import com.xworkzz.hospitalapp.hospital.ApoloImpl;
import com.xworkzz.hospitalapp.hospital.Hospital;
import com.xworkzz.hospitalapp.patientapp.Patient;

public class Tester {
    public static void main(String[] args) {
        Hospital hospital= new ApoloImpl();
        Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setName("Aishwarya");
        patient.setPhoneNumber(897678678);
        patient.setInsuranceAvailable(true);
        patient.setAttenderName("Ashwini");
        patient.setBloodGroup("o+");
        patient.setDiseaseName("thalenovu");
        patient.setGovtProof(GovtProof.AADHAR);
        patient.setGender(Gender.FEMALE);
        hospital.addPatient(patient);

        Patient patient1=new Patient();
        patient1.setPatientId(2);
        patient1.setName("Krishna");
        patient1.setPhoneNumber(9876787678l);
        patient1.setInsuranceAvailable(true);
        patient1.setAttenderName("laxmamma");
        patient1.setBloodGroup("A+");
        patient1.setDiseaseName("stomachpain");
        patient1.setGovtProof(GovtProof.AADHAR);
        patient1.setGender(Gender.MALE);
        hospital.addPatient(patient1);

        Patient patient2=new Patient();
        patient2.setPatientId(3);
        patient2.setName("Bharath");
        patient2.setPhoneNumber(8767887667l);
        patient2.setInsuranceAvailable(true);
        patient2.setAttenderName("devi");
        patient2.setBloodGroup("B+");
        patient2.setDiseaseName("fever");
        patient2.setGovtProof(GovtProof.AADHAR);
        patient2.setGender(Gender.MALE);
        hospital.addPatient(patient2);

        Patient patient3=new Patient();
        patient3.setPatientId(4);
        patient3.setName("Ram");
        patient3.setPhoneNumber(8876787877l);
        patient3.setInsuranceAvailable(true);
        patient3.setAttenderName("devamma");
        patient3.setBloodGroup("AB+");
        patient3.setDiseaseName("viral fever");
        patient3.setGovtProof(GovtProof.AADHAR);
        patient3.setGender(Gender.MALE);
        hospital.addPatient(patient3);

        Patient patient4=new Patient();
        patient4.setPatientId(5);
        patient4.setName("Suresh");
        patient4.setPhoneNumber(6876787877l);
        patient4.setInsuranceAvailable(true);
        patient4.setAttenderName("shreya");
        patient4.setBloodGroup("AB+");
        patient4.setDiseaseName("dengue fever");
        patient4.setGovtProof(GovtProof.AADHAR);
        patient4.setGender(Gender.MALE);
        hospital.addPatient(patient4);


        Patient patient5=new Patient();
        patient5.setPatientId(6);
        patient5.setName("Geetha");
        patient5.setPhoneNumber(897678678);
        patient5.setInsuranceAvailable(true);
        patient5.setAttenderName("sharadha");
        patient5.setBloodGroup("o+");
        patient5.setDiseaseName("throatissue");
        patient5.setGovtProof(GovtProof.AADHAR);
        patient5.setGender(Gender.FEMALE);
        hospital.addPatient(patient5);


        Patient patient6=new Patient();
        patient6.setPatientId(7);
        patient6.setName("roopa");
        patient6.setPhoneNumber(9786543234l);
        patient6.setInsuranceAvailable(true);
        patient6.setAttenderName("Asha");
        patient6.setBloodGroup("A+");
        patient6.setDiseaseName("viral fever");
        patient6.setGovtProof(GovtProof.AADHAR);
        patient6.setGender(Gender.FEMALE);
        hospital.addPatient(patient6);

        Patient patient7=new Patient();
        patient7.setPatientId(8);
        patient7.setName("suresh");
        patient7.setPhoneNumber(876565432l);
        patient7.setInsuranceAvailable(true);
        patient7.setAttenderName("seetha");
        patient7.setBloodGroup("AB+");
        patient7.setDiseaseName("smallpox");
        patient7.setGovtProof(GovtProof.AADHAR);
        patient7.setGender(Gender.FEMALE);
        hospital.addPatient(patient7);

        Patient patient8=new Patient();
        patient8.setPatientId(9);
        patient8.setName("Ramesh");
        patient8.setPhoneNumber(9878989897l);
        patient8.setInsuranceAvailable(true);
        patient8.setAttenderName("raghu");
        patient8.setBloodGroup("o+");
        patient8.setDiseaseName("thalenovu");
        patient8.setGovtProof(GovtProof.AADHAR);
        patient8.setGender(Gender.MALE);
        hospital.addPatient(patient8);

        Patient patient9=new Patient();
        patient9.setPatientId(10);
        patient9.setName("saroja");
        patient9.setPhoneNumber(678678678l);
        patient9.setInsuranceAvailable(true);
        patient9.setAttenderName("yashodha");
        patient9.setBloodGroup("b+");
        patient9.setDiseaseName("cold");
        patient9.setGovtProof(GovtProof.AADHAR);
        patient9.setGender(Gender.FEMALE);
        hospital.addPatient(patient9);

        Patient patient10=new Patient();
        patient10.setPatientId(11);
        patient10.setName("keerthi");
        patient10.setPhoneNumber(9089890876l);
        patient10.setInsuranceAvailable(true);
        patient10.setAttenderName("harsha");
        patient10.setBloodGroup("o+");
        patient10.setDiseaseName("fever");
        patient10.setGovtProof(GovtProof.AADHAR);
        patient10.setGender(Gender.FEMALE);
        hospital.addPatient(patient10);

        Patient patient11=new Patient();
        patient11.setPatientId(12);
        patient11.setName("roja");
        patient11.setPhoneNumber(997678678);
        patient11.setInsuranceAvailable(true);
        patient11.setAttenderName("Aishu");
        patient11.setBloodGroup("A+");
        patient11.setDiseaseName("legpain");
        patient11.setGovtProof(GovtProof.AADHAR);
        patient11.setGender(Gender.FEMALE);
        hospital.addPatient(patient11);

        Patient patient12=new Patient();
        patient12.setPatientId(13);
        patient12.setName("hema");
        patient12.setPhoneNumber(999678678);
        patient12.setInsuranceAvailable(true);
        patient12.setAttenderName("veera");
        patient12.setBloodGroup("o+");
        patient12.setDiseaseName("viral fever");
        patient12.setGovtProof(GovtProof.AADHAR);
        patient12.setGender(Gender.FEMALE);
        hospital.addPatient(patient12);

        Patient patient13=new Patient();
        patient13.setPatientId(14);
        patient13.setName("parvathi");
        patient13.setPhoneNumber(8897678678l);
        patient13.setInsuranceAvailable(true);
        patient13.setAttenderName("hema");
        patient13.setBloodGroup("AB+");
        patient13.setDiseaseName("thalenovu");
        patient13.setGovtProof(GovtProof.AADHAR);
        patient13.setGender(Gender.FEMALE);
        hospital.addPatient(patient13);

        Patient patient14=new Patient();
        patient14.setPatientId(15);
        patient14.setName("guru");
        patient14.setPhoneNumber(777678678);
        patient14.setInsuranceAvailable(true);
        patient14.setAttenderName("savithri");
        patient14.setBloodGroup("o+");
        patient14.setDiseaseName("thalenovu");
        patient14.setGovtProof(GovtProof.AADHAR);
        patient14.setGender(Gender.MALE);
        hospital.addPatient(patient14);



        hospital.getAllPatients();



    }
}
