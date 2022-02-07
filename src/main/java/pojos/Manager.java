package pojos;

public class Manager {

    private String name;

    //constructor

    public Manager (String name){
        this.name = name;
    }

    // default constructr

    public Manager (){

    }

    // getter
    public String getName (){
        return this.name
    }

    // setter
    public void setName (){
        this.name =name;
    }
}
