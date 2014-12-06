package fi.trail.jersey;

public class Student {

    private int id;
    private String firstName;
    private String lastName;

    public Student() {}

    public Student(int id, String fname, String lname) {
        this.id = id;
        this.firstName = fname;
        this.lastName = lname;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }


    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return new StringBuffer(" First Name : ").append(this.firstName)
                .append(" Last Name : ").append(this.lastName)
                .append(" ID : ")
                .append(this.id).toString();
    }
}
