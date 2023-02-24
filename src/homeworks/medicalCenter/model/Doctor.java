package homeworks.medicalCenter.model;

import java.util.Objects;

public class Doctor extends  Person {
    private String profession;


    public Doctor(String id, String name, String surname, String email, String doctor) {
        super(id, name, surname, email, doctor);
    }

    public Doctor(String id, String name, String surname, String email, String doctor, String profession) {
        super(id, name, surname, email, doctor);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doctor doctor = (Doctor) o;

        return Objects.equals(profession, doctor.profession);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "profession='" + profession + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", doctor='" + doctor + '\'' +
                '}';
    }
}
