

public class Player {
    //making the properties private to stop users from accessing it
    private String name;
    private String position;
    private int number;
    private int contractLength;

    //constructor
    public Player(String name, String position, int number, int contractLength) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.contractLength = contractLength;
    }


    //default constructor
    public player() {}
   // Getters and Setters - encapsulation

    //getter method

    public String getName(){
        return this.name
    }

    public String getPosition(){
        return this.position
    }
    public int getNumber() {
        return this.number
    }
    public int getContractLength(){
        return this.contractLength
    }


    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setPosition (String position){
        this.position= position;
    }
     public void setNumber(int number){
         this.number= number;
    }
    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

}