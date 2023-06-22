package com.xworkzz.hospitalapp;

import com.xworkzz.hospitalapp.constant.Gender;
import com.xworkzz.hospitalapp.constant.GovtProof;
import com.xworkzz.hospitalapp.hospital.ApoloImpl;
import com.xworkzz.hospitalapp.hospital.Hospital;
import com.xworkzz.hospitalapp.patientapp.Patient;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("main is invoked");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the patient details to be added");
        int size=sc.nextInt();
        Hospital hospital= new ApoloImpl(size);
        for(int patientIndex=0;patientIndex<size;patientIndex++){
            Patient patient=new Patient();
            System.out.println("Enter the patient Id");
            patient.setPatientId(sc.nextInt());
            System.out.println("Enter the patient Name");
            patient.setName(sc.next());
            System.out.println("Enter the patient PhoneNum");
            patient.setPhoneNumber(sc.nextLong());
            System.out.println("Is insurance available");
            patient.setInsuranceAvailable(sc.nextBoolean());
            System.out.println("Enter the attender name");
            patient.setAttenderName(sc.next());
            System.out.println("enter the address");
            patient.setAddress(sc.next());
            System.out.println("Enter the bloodgroup");
            patient.setBloodGroup(sc.next());
            System.out.println("Enter the disease name");
            patient.setDiseaseName(sc.next());
            System.out.println("Enter the gender type");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter the govt ID");
            patient.setGovtProof(GovtProof.valueOf(sc.next()));
            System.out.println("enter the wardno");
            patient.setWardNo(sc.nextInt());
            hospital.addPatient(patient);
        }
        /*Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setName("Aishwarya");
        patient.setPhoneNumber(897678678);
        patient.setInsuranceAvailable(true);
        patient.setAttenderName("Ashwini");
        patient.setBloodGroup("o+");
        patient.setDiseaseName("thalenovu");
        patient.setGovtProof(GovtProof.AADHAR);
        patient.setGender(Gender.FEMALE);
        hospital.addPatient(patient);*/




        hospital.getAllPatients();
        System.out.println("enter the patient address");
hospital.getPatientByAddress(sc.next());
 System.out.println("Enter the wardno");
 hospital.getPatientNameByWard(sc.nextInt());
 System.out.println("Enter the Disease name");
 hospital.getPatientNameByDiseaseName(sc.next());
        System.out.println("enter the updated disease name");
        hospital.updatePatientDiseaseByPatientName(sc.next(),sc.next());
        System.out.println("enter the updated wardno");
        hospital.updatePatientWardNoByPatientId(sc.nextInt(),sc.nextInt());

    }
}
