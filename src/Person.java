public class Person {
    private String name;
    private String email;
    private Job job;


    public Person(String name, String email, Job job) {
        this.name = name;
        this.email = email;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Job getJob() {
        return job;
    }

    public double getSalary() {

        return job.getSalary();
    }


    public String toString() {
        return " name: " + name + " company: " + job.getCompany() + " salary: " + job.getSalary();
    }


}


//