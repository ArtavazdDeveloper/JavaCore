package homeworks.medicalCenter.model;

import homeworks.medicalCenter.utill.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {
   private Date registerDateTime;

   public Patient() {
   }

   public Patient(String id, String name, String surname, String email, String doctor, Date registerDateTime) {
      super(id, name, surname, email, doctor);
      this.registerDateTime = registerDateTime;
   }

   public Date getRegisterDateTime() {
      return registerDateTime;
   }

   public void setRegisterDateTime(Date registerDateTime) {
      this.registerDateTime = registerDateTime;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;

      Patient patient = (Patient) o;

      return Objects.equals(registerDateTime, patient.registerDateTime);
   }

   @Override
   public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + (registerDateTime != null ? registerDateTime.hashCode() : 0);
      return result;
   }


   @Override
   public String toString() {
      return "Patient{" +
              "registerDateTime=" + DateUtil.dateTime((java.sql.Date) registerDateTime) +
              "} " + super.toString();
   }
}
