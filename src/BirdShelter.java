public class BirdShelter {

//    parameters in birdsheltertest
    public void shelterSounds(Bird[] birdsOfTheShelter){
        for (int i = 0; i < birdsOfTheShelter.length; i++){
            birdsOfTheShelter[i].makeNoise();
        }
    }

    boolean camerasOn;
    boolean alarmsArmed;
    boolean guardsAlert;
    public final void securityProcedures(){
        camerasOn = true;
        alarmsArmed = true;
        guardsAlert = true;
    }
}
