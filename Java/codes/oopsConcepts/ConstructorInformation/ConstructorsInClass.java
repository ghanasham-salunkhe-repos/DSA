package oopsConcepts.ConstructorInformation;

public class ConstructorsInClass {

    public static void main(String[] args) {

//        lets create some objects of animals class
        Animals cat=new Animals("cat");
        Animals dog=new Animals(4,"dog","bhowbhow",false);
        Animals elephant=new Animals(4,"elephant");
        Animals rabbit =new Animals(4,"rabbit","CHIII");

//        lets print data
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(elephant);
        System.out.println(rabbit);


//        lets make animal raise voice
        dog.makeNoice();
        rabbit.makeNoice();

        // default constructor
        System.out.println(new Animals());

        // lets create object of serpent
        Serpent serpent=new Serpent(0,"snake","shii",true,true);
        System.out.println(serpent);// as tostring function is pointing out and doesAnimalCrawl attribute from child cant be accessed by ANimals sowe will not get that attribute
        // super keyword is usefull we use

    }

}
