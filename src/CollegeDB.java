import java.util.ArrayList;

public class CollegeDB {
    //variables
    private ArrayList<College> colleges;

    //constructors
    public CollegeDB(){                                 //default constructor
    }

    public CollegeDB(ArrayList<College> colleges){      //overloaded constructor
        this.colleges = colleges;
    }

    //methods
    //getters and setters
    public ArrayList<College> getColleges() {               //retrieve "colleges" databases to use
        return this.colleges;
    }
    public void setColleges(ArrayList<College> colleges){   //if you want to alter the database, need to pass in a DB to change first
        this.colleges = colleges;
    }


}
