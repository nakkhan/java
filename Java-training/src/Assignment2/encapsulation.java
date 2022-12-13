package Assignment2;

public class encapsulation {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main (String args[]){

        encapsulation e = new encapsulation();
        e.setName("nabeel");

       // boolean getname;
        System.out.println(e.getName());
    }
}
