public class BirdShelterTest {
    public static void main(String[] args) {
//       Since subclasses: by declaring all of them birds, we can push them into polymorphic (many shapes) array.
        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Gold Finch");
        birds[1] = new Duck();
        birds[1].setName("Mallard");
        birds[2] = new Penguin();
        birds[2].setName("Emperor Penguin");

//        for (int i = 0; i < birds.length; i++){
//            birds[i].makeNoise();
//        }

        BirdShelter healingWings = new BirdShelter();
        healingWings.shelterSounds(birds);

        BirdLover mrBob = new BirdLover();
        mrBob.takeBirdToVet(birds[1]);

    }
}