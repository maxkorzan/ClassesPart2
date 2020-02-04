public class College {
    //variables
    private String collegeName;
    private String location;
    private String phoneNumber;
    private final int STUDENTCAP = 1000;


    //constructors
    public College(){
    }

    public College(String collegeName, String location, String phoneNumber){
        this.collegeName = collegeName;
        this.location = location;
        this.phoneNumber = phoneNumber;

    }

    //methods - getters and setters
    public String getCollegeName(){
        return this.collegeName;
    }
    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void cheer(){
        System.out.println("Cheering for the college ....");
    }

    public int getSTUDENTCAP() {
        return STUDENTCAP;
    }

}
