public class Main {
    public static void main(String[] args){

        Course course = new Course();
        course.cheer();


        College maryland = new College();
        maryland.setCollegeName("UNIVERSIY OF MARYLAND");
        maryland.setLocation("colelge paradmfkasdj");

        System.out.println(maryland.getCollegeName() +" "+ maryland.getLocation());


        //abstract one
        //Animal animal = new Animal();     <-- doesnt work because abstract cannot be instantiated
        Dog dog = new Dog();                //this does work
        dog.talk();


        //final
        College college = new College();
        System.out.println(college.getSTUDENTCAP());

    }
}
