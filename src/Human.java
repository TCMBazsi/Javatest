package gyak;

public class Human extends asd{

    private String name;
    private int age;
    private int number;

    public void writemyname() {
        System.out.println("Az én nevem: " + name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String incoming) {
        this.name = incoming;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void IF(){
       System.out.println(name == null ? "Üres" : "Nem Üres, értéke: "+ name);
    }

    public int getNumber() {
        System.out.println("Az eredmény: " + number);
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
