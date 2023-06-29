package com.xworkzz.hospitalapp;

import com.xworkzz.hospitalapp.address.*;
import com.xworkzz.hospitalapp.constant.Gender;
import com.xworkzz.hospitalapp.constant.GovtProof;
import com.xworkzz.hospitalapp.hospital.ApoloImpl;
import com.xworkzz.hospitalapp.hospital.Hospital;
import com.xworkzz.hospitalapp.patientapp.Patient;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("main is invoked");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the patient details to be added");
        int size = sc.nextInt();
        Hospital hospital = new ApoloImpl(size);
        for (int patientIndex = 0; patientIndex < size; patientIndex++) {

            Patient patient = new Patient();

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
             patient.setPatientAddress(sc.next());
            System.out.println("Enter the blood group");
            patient.setBloodGroup(sc.next());
            System.out.println("Enter the disease name");
            patient.setDiseaseName(sc.next());
            System.out.println("Enter the gender type");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter the govt ID");
            patient.setGovtProof(GovtProof.valueOf(sc.next()));
            System.out.println("enter the wardno");
            patient.setWardNo(sc.nextInt());
            System.out.println("Enter the  age");
            patient.setAge(sc.nextInt());
            hospital.addPatient(patient);

            Street street = new Street();
            Area area = new Area();
            City city = new City();
            State state = new State();
            Country coun = new Country();
            Address1 address = new Address1();

            System.out.println("Enter the street name");
            street.setStreetName(sc.next());
            System.out.println("Enter the area name");
            area.setAreaName(sc.next());
            System.out.println("Enter the city name");
            city.setCityName(sc.next());
            System.out.println("Enter the State name");
            state.setStateName(sc.next());
            System.out.println("Enter the country name");
            coun.setCountryName(sc.next());

            patient.setAddress(address);
            address.setCountry(coun);
            coun.setState(state);
            state.setCity(city);
            city.setArea(area);
            area.setStreet(street);

        }



        String text = null;
            do {
                System.out.println("1:Get All the patients Details");
                System.out.println("2:Get Patient By Address");
                System.out.println("3:Get PatientName By Ward");
                System.out.println("4:Get PatientName By DiseaseName");
                System.out.println("5:update PatientDisease By PatientName");
                System.out.println("6:update Patient WardNo By PatientId");
                System.out.println("7:update PatientsAge By PatientId");
                System.out.println("8:Get PatientBy Id");
                System.out.println("9:Get PatientAttenderName By PatientId");
                System.out.println("10:Get StreetName By PatientId");

                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("The  List  of patients  are:");
                        hospital.getAllPatients();
                        break;
                     case 2:
                     System.out.println("enter the patient address");
                      hospital.getPatientByAddress(sc.next());
                      break;
                    case 3:
                        System.out.println("enter the patient ward number");
                        hospital.getPatientNameByWard(sc.nextInt());
                        break;
                    case 4:
                        System.out.println("enter the patient Disease name");
                        hospital.getPatientNameByDiseaseName(sc.next());
                        break;
                    case 5:
                        System.out.println("enter the updated disease name");
                        hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());
                         break;
                    case 6:
                        System.out.println("enter the updated wardno");
                        hospital.updatePatientWardNoByPatientId(sc.nextInt(), sc.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter the updated age");
                        hospital.updatePatientsAgeByPatientId(sc.nextInt(), sc.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter the Id");
                        hospital.getPatientById(sc.nextInt());
                        break;
                    case 9:
                        System.out.println("Enter the Patient Id");
                        hospital.getPatientAttenderNameByPatientId(sc.nextInt());
                        break;
                    case 10:
                        System.out.println("Enter the patient Id");
                        String streetName = hospital.getStreetNameByPatientId(sc.nextInt());
                        System.out.println(streetName);
                        break;

                }
                System.out.println("Do  you want to continue: y/n");
                text = sc.next();


            } while (text.equals("y"));


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


            //  System.out.println("enter the patient address");
            //  hospital.getPatientByAddress(sc.next());
         /*   System.out.println("Enter the wardno");
            hospital.getPatientNameByWard(sc.nextInt());
            System.out.println("Enter the Disease name");
            hospital.getPatientNameByDiseaseName(sc.next());
            System.out.println("enter the updated disease name");
            hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());
            System.out.println("enter the updated wardno");
            hospital.updatePatientWardNoByPatientId(sc.nextInt(), sc.nextInt());
            System.out.println("Enter the updated age");
            hospital.updatePatientsAgeByPatientId(sc.nextInt(), sc.nextInt());
            System.out.println("Enter the Id");
            hospital.getPatientById(sc.nextInt());
            System.out.println("Enter the Patient Id");
            hospital.getPatientAttenderNameByPatientId(sc.nextInt());
            System.out.println("Enter the patient Id");
            String streetName = hospital.getStreetNameByPatientId(sc.nextInt());
            System.out.println(streetName);
            hospital.getAllPatients();

        }
    }*/
        }


