/* This is a stub for the House class */

import java.util.ArrayList;

/**
 * Extends the Building Class
 */
public class House extends Building{

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /**
   * Creates a house with name, the address, the number of floors, and if it has a dining room or not
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    residents = new ArrayList<String>(residents);
    System.out.println("You have built a house: 🏠");
    this.hasDiningRoom = hasDiningRoom;
  }

  /**
   * Returns whether or not the house has a dining room (true or false)
   * @return this.hasDining (Dining room: true or false)
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
  
  /**
   * Returns the number of residents
   * @return this.residents.size (Amount of residents in the ArrayList)
   */
  public int nResidents(){
    return this.residents.size();
  }

  /**
   * Updates ArrayList of residents with name (if they are not already there)
   * @param name
   */
  public void moveIn(String name) {
    if (!isResident(name)){
      residents.add(name);
    }
    else if (isResident(name)){
      System.out.println(name + " already lives here!");
    }
  }

  /**
   * Updates ArrayList of residents by removing name (if they live in this building)
   * @param name
   * @return name + "has moved out"/" does not live in this building."
   */
  public String moveOut(String name) {
    if (isResident(name)){
      residents.remove(name);
      return name + " has moved out.";
    }
    else {
      return name + " does not live in this building.";
    }
  }


  /**
   * Checks if the person live in the house (if they're a resident)
   * @param person
   * @return true/false (Depending on if the person lives in the house)
   */
  public boolean isResident(String person){
    if (residents.contains(person)){
      return true;
    } else{
      return false;
    }
  }

  public static void main(String[] args) {
    House myHouse = new House("Emily's House", "123 Drury Lane", 3, true);
  }

}