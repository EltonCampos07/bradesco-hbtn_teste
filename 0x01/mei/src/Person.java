import java.util.Calendar;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private Boolean anotherCompanyOwner;
    private Boolean pensioner;
    private Boolean publicServer;
    private float salary;

    public String fullName() {
        return this.name + " " + this.surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return this.salary * 12;
    }

    public boolean isMEI() {
        int age = calculateAge(birthDate);
        return (age >= 18) &&
                (this.salary * 12 <= 130000f) &&
                (Boolean.FALSE.equals(this.anotherCompanyOwner)) &&
                (Boolean.FALSE.equals(this.pensioner)) &&
                (Boolean.FALSE.equals(this.publicServer));
    }

    private int calculateAge(Date birthDate) {
        Calendar today = Calendar.getInstance();
        Calendar dob = Calendar.getInstance();
        dob.setTime(birthDate);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(Boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public Boolean getPensioner() {
        return pensioner;
    }

    public void setPensioner(Boolean pensioner) {
        this.pensioner = pensioner;
    }

    public Boolean getPublicServer() {
        return publicServer;
    }

    public void setPublicServer(Boolean publicServer) {
        this.publicServer = publicServer;
    }
}
