package homeworks.medicalCenter.storage;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;
import homeworks.medicalCenter.model.Doctor;
import homeworks.medicalCenter.model.Patient;
import homeworks.medicalCenter.model.Person;
import homeworks.medicalCenter.utill.DateUtil;

import java.util.Date;

public class MedicalCentrStorage {

    private  Person[] persons = new Person[100];

    private  int size = 0;
    public  void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(persons[i]);
        }
    }
    public void printDoctors(){
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor){
                System.out.println(persons[i]);
            }
        }
    }
    public void printPatient(){
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient){
                System.out.println(persons[i]);
            }
        }
    }

    public void searchDoctorByProfession(String profession){
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof  Doctor){
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)){
                    System.out.println(doctor);
                }
            }
        }
    }
    public void deleteDoctorById(String id){
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)){
                DeletePersonByIndex(i);
            }
        }
    }

    public Doctor getDoctorById(String id){
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)){
            return (Doctor) person;
            }
        }
        return null;
    }
    public void searchPatientsByDoctor(Doctor doctor){
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof  Patient){
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)){
                    System.out.println(patient);
                }
            }
        }
    }
    public void printAllTodaysPatients(){
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient){
                Patient patient = (Patient)persons[i];
                if (DateUtil.isSameDay((java.sql.Date) today, (java.sql.Date) patient.getRegisterDateTime())){
                    System.out.println(patient);
                }
            }
        }
    }
    private  void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons,0,tmp,0,size);
        persons = tmp;
    }
    private  void DeletePersonByIndex(int i) {
        for (int j = i; j < persons.length; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    public boolean isDoctorAvailable(Date registerDateTime, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient){
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor)
                        && patient.getRegisterDateTime().equals(registerDateTime));
                return false;
            }
        }
        return true;
    }
}
