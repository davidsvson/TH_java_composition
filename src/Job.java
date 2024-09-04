public class Job {
    private String company;
    private String title;
    private double salary;

    public Job(String company, String title, double salary) {
        this.company = company;
        this.title = title;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
