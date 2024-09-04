public class Main {
    public static void main(String[] args) {

    Job job1 = new Job("intel", "programmer", 1000.0);

    Person p1 = new Person("David", "david@david.se", job1);

    Person p2 = new Person("Susan", "s@s.se", new Job("apple", "HR", 2000.0));


    System.out.println(p1.getName());

    //Job j1 = p1.getJob();


    System.out.println(p1.getJob().getSalary());

    System.out.println(p1);


    }
}