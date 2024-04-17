public class Person
{
    private String name;
    private int age;
    public Person(String aName, int anAge)
    {
        this.name=aName;
        this.age=anAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }




    public void Birthday()
    {
        this.age++;
    }

    /**
     * Outputs a standard greeting
     */
    public void greeting()
    {
        System.out.println("Hello");
    }


    /**
     * Returns a string describing the state of the Person object
     * @return a string describing the state of the Person object
     */
    @Override
    public String toString()
    {
        return "\nAn object of " + this.getClass() + " with the name of " + getName() + " of age " + getAge();
        //return "Name: " + getName() + ", Age: " + getAge() + "\n";
    }



}
