public class Course extends College {
    private String name;

    public Course(){

    }


    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void cheer(){
        System.out.println("Cheering for the course ....");
    }

}
