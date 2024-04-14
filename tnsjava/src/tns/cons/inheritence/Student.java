package tns.cons.inheritence;

// Student class inheriting from Citizen class
public class Student extends Citizen {
    private int rollno;
    private String collegename;

    public Student() {

    }

    public Student(int rollno, String collegename) {
        this.rollno = rollno;
        this.collegename = collegename;
    }

    public Student(String name, String address, long aadharno, long phoneno) {
        super(name, address, aadharno, phoneno);
       
    }

    // getter and setter methods
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    @Override
    public String toString() {
    	return super.toString()+"Student [rollno=" + rollno + ", collegename=" + collegename + "]";
    	//return "Student [name=" + getName() + ", address=" + getAddress() + ", aadharno=" + getAadharno() + ", phoneno=" + getPhoneno() + ", rollno=" + rollno + ", collegename=" + collegename + "]";
    }
    
}


