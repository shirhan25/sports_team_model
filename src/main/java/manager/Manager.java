package manager;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(name, manager.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
