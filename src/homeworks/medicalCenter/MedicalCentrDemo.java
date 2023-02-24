package homeworks.medicalCenter;

import homeworks.medicalCenter.storage.MedicalCentrStorage;

import java.util.Scanner;

public class MedicalCentrDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private  static MedicalCentrStorage MedicalCentrStorage = new MedicalCentrStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun){
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command){
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    break;
                case DELETE_DOCTOR_BY_ID:
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    break;
                case ADD_PATIENT:
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    break;
                case PRINT_TODAYS_PATIENTS:


            }
        }
    }
}
