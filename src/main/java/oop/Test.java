package oop;

public class Test {
    public static void main(String[] args) {
        Breed frenchBulldog = new Breed("French Bulldog",
                "Meduim size, playfull, 12-20kg", "sick stomach");
        Breed shepard = new Breed("Shepard", "35-50kg...", "-");
        Breed persian = new Breed("Persian", "fur is long", "-");
        Breed aga = new Breed("Polly", "long neck", "-");
        Address address1 = new Address();
        Address address5 = new Address();
        Address address2 = new Address("Bulgaria");
        Address address4 = new Address( );
        Address address3 = new Address("GB", "London", 2000, "no data");
        Dog frenchie = new Dog(frenchBulldog);//calling the constructor in order to create a new
        // object from that type (Class)
        Dog sharo = new Dog(shepard);
        Cat fur = new Cat(persian);
        Parrot polly =  new Parrot(aga);

        fur.setAge((byte) 5);
        fur.setName("Snowbowl");
        fur.setSex("Female");
        fur.setWeight(4.3f);
        fur.setAddress(address1);


        polly.setAge((byte) 3 );
        polly.setName("Polly");
        polly.setSex("Male");
        polly.setWeight(1.3f);



        //frenchie and sharo are object from type Dog - instances
        frenchie.setName("Morti");
        frenchie.setAge((byte) 2);
        frenchie.setSex("Male");
        //frenchie.setBreed("French Bulldog");
        //frenchie.setBreed("blah blah");
        frenchie.setWeight(15.0f);
        frenchie.setAddress(address2);

        frenchie.bark("Blah blah");
        frenchie.eat();
        frenchie.sleep();

        sharo.sleep();
        sharo.eat();
        sharo.bark();
        sharo.setAddress(address5);

        System.out.println(sharo.getAge());
        System.out.println(frenchie.getAge());
        System.out.println(frenchie.getWeight());
        System.out.println(polly.getAge());
        System.out.println(polly.getName());



        sharo.walk();
        sharo.sleep();
        sharo.makeNoise();

        frenchie.makeNoise();
        frenchie.sleep();
        frenchie.walk();

        fur.sleep();
        fur.makeNoise();
        fur.walk();
        fur.goingToTheVet();

        polly.sleep();
        polly.makeNoise();
        polly.walk();


        System.out.println(fur.getAddress());
        System.out.println(frenchie.getAddress());
        System.out.println(sharo.getAddress());
        System.out.println(polly.getAddress());


    }
}
