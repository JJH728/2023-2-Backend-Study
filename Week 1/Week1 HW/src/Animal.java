public class Animal {
    private String name;
    private String howling;

    public Animal(String name, String howling){
        this.name=name;
        this.howling=howling;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setHowling(String howling){
        this.howling=howling;
    }
    
    public void howl(){
        System.out.println(this.name+" says "+this.howling+"!");
    }
}