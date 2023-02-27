package homeworks.medicalCenter;

import chapter12.Language;
import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.model.Profession;
import homeworks.medicalCenter.storage.MedicalCentrStorage;
import homeworks.medicalCenter.utill.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCentrDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static MedicalCentrStorage MedicalCentrStorage = new MedicalCentrStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorData();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    MedicalCentrStorage.printAllTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        MedicalCentrStorage.printDoctors();
        System.out.println("please choose doctor's id");
        String id = scanner.nextLine();
        Doctor doctor = MedicalCentrStorage.getDoctorById(id);
        if (doctor != null) {
            MedicalCentrStorage.searchPatientsByDoctor(doctor);
        } else {
            System.out.println("doctor with " + id + "does not exists!");
        }
    }

    private static void addPatient() {
        MedicalCentrStorage.printDoctors();
        System.out.println("Please choose doctor's id");
        String id = scanner.nextLine();
        Doctor doctor = MedicalCentrStorage.getDoctorById(id);
        if (doctor != null) {
            try {
                System.out.println("Please input id(id card),name,surname,phone,registerDateTime(dd-MM-yyyy HH:mm)");
                String patientDataStr = scanner.nextLine();
                String[] patientData = patientDataStr.split(",");
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (MedicalCentrStorage.isDoctorAvailable(registerDateTime, doctor)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhone(patientData[3]);
                    patient.setDoctor(String.valueOf(doctor));

                    patient.setRegisterDateTime(DateUtil.stringToDateTime(patientData[4]));
                    MedicalCentrStorage.add(patient);
                    System.out.println("Patient registered");
                } else {
                    System.out.println("Doctor unavailable in that date time, please choose another!");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect registrDate Time.Please try again!");
            }
        }
    }


    private static void changeDoctorData() {
        MedicalCentrStorage.printDoctors();
        System.out.println("Please input id");
        String id = scanner.nextLine();
        Doctor doctorById = MedicalCentrStorage.getDoctorById(id);
        if (doctorById != null) {
            System.out.println("Please input name,surname,email, phone, profession");
            listProfession();
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            String doctorDatum = doctorData[4];
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setEmail(doctorData[2]);
            doctorById.setPhone(doctorData[3]);
            try{
                doctorById.setProfession(Profession.valueOf(doctorDatum));
            }catch(IllegalArgumentException e){
                System.out.println("Wrong profession!");
            }
            System.out.println("doctor was update");
        } else {
            System.out.println("Doctor with " + id + " does not exists");
        }
    }

    private static void deleteDoctorById() {
        MedicalCentrStorage.printDoctors();
        System.out.println("Please choose id");
        String doctorId = scanner.nextLine();
        Doctor doctor = MedicalCentrStorage.getDoctorById(doctorId);
        if (doctor != null) {
            MedicalCentrStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("Wrong id.Please try again!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        MedicalCentrStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input id,name,surname,email, phone, profession");
        listProfession();
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        String doctorDatum = doctorData[5];
        Doctor doctorById = MedicalCentrStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurname(doctorData[2]);
            doctor.setEmail(doctorData[3]);
            doctor.setPhone(doctorData[4]);
            try {

                doctor.setProfession(Profession.valueOf(doctorDatum));
            } catch (IllegalArgumentException e) {
                System.out.println("Profession wrong!");
            }
            MedicalCentrStorage.add(doctor);
            System.out.println("doctor added");
        } else {
            System.out.println("Doctor with " + doctorId + " already exists");
        }
    }

    private static void listProfession() {
        System.out.println("Please choose profession!");
        Profession[] professions = Profession.values();
        for (Profession profession : professions) {
            System.out.println(profession);
        }
    }
}
