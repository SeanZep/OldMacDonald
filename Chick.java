class Chick implements Animal{     
     private String myType;
     private String mySound;
     public Chick(String type, String sound){
     	myType = type;
     	mySound = sound;
     }
     public String getType(){return myType;}
     public String getSound(){return mySound;}
}
