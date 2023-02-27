package homeworks.medicalCenter.model;

public enum Profession {
    FAMILY_PHYSICIANS("Family doctor"),
    INTERNISTS("Internist"),
    EMERGENCY_PHYSICIANS("Ambulance"),
    PSYCHIATRISTS("Psychiatrist");
    private String specialization;

    Profession(String specialization){
        this.specialization = specialization;
    }
    public String getSpecialization(){
        return specialization;
    }
    Profession(){}
}
