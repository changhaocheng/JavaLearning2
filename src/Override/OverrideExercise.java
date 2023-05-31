package Override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",10);
        person.say();
        Student student = new Student("july",10.0,"bully",20);
        student.say();

    }
}
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void say(){

        System.out.println("name is" + name + "age is" + age);
    }

}
class Student extends Person{
    private String id;
    private double score;
    public Student(String id , double score,String name,int age){
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public void say(){
        System.out.println("id is" + id + "score is" + score );
    }
}