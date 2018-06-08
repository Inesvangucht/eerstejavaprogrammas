package Animals;

public class Zoo {
    public static void main(String[] args) {




        Animal catm = new Cat( "Moortje", 9);
        Animal catf = new Cat("Marie-Charlotte", 9);

        Animal lionm = new Lion ("Simba", 5);
        Animal lionf = new Lion ("Nala", 9);

        Animal birdm = new Bird ("Koko");
        Animal birdf = new Bird ("Kiki");


        Animal dogm = new Dog ("Brutus");
        Animal dogf = new Dog ("Rini");

        Animal rabbitm = new Rabbit ("Benny");
        Animal rabbitf = new Rabbit ("Jacky");


        Animal[] zoo = {catm, catf, lionm, lionf, birdm, birdf, dogm, dogf, rabbitm, rabbitf};

        System.out.println("\n");
        ((Cat) catf).scratch((Cat)lionf);

        lionm.sound();

        ((Dog) dogm).perform();
        ((Dog) dogf).perform();

        ((Rabbit) rabbitf).fluf();
        ((Rabbit) rabbitm).fluf();





        catf.sound();
        birdm.sound();
        rabbitf.sound();


        ((Bird) birdm).fly();




    }
}
