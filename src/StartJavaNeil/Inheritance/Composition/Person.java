package StartJavaNeil.Inheritance.Composition;

public class Person {
    //используем отношение has-a
    private Job job;
    private MotoPeople mp;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);

        this.mp = new MotoPeople();
        mp.setMoto("Kawasaki");
    }
    public long getSalary() {
        return job.getSalary();
    }
    public String getMoto(){
        return mp.getMoto();
    }
}
