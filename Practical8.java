public abstract class Animal {
protected String species;
protected int age;
}
public Animal(String species,int age){
this.species=species;
this.age=age;
}
public abstract void sound();
@override
public String toString{
    return "Species:"+species+",Age:"+age;
}
@override
public Boolean equals(Object obj){

}
public class Mammal extends Animal{
}
public void sound(){
    System.out.println("The animal sound");
}
public class Bird extends Animal {
private String featherColor;
public Bird(String species,int age,String featherColor){
    super(species,age);
    this.featherColor=featherColor;
}
public void sound(){
System.out.println("The  bird sound");
}
}
public class Parrot extends Bird {
private boolean canSpeak;
public Parrot(String species,int age,String featherColor,boolean canSpeak){
    super(species,age,featherColor);
    this.canSpeak=canSpeak;
}
public void sound(){
    System.out.println("Parrot Speaking");
}
else{
    System.out.println("Parrot sound");
}
}
public class Practical8{
public static void main(String[] args) {
    Mammal lion=new Mammal("Lion",5,"Grasslands");
    Bird eagle=new Bird("Eagle",3,"Brown");
    Parrot talkingParrot=new Parrot("Talking Parrot",2,"Green",true);
    System.out.println("Are lion and eagle equal?"+lion.equals(eagle));
    System.out.println("Are lion and lion equal?"+lion.equals(new Mammal("Lion",5,"Grasslands")));
}
}