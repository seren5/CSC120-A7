import java.util.Hashtable;
/* This is a stub for the Library class */
/**
 * Extends the Building class
 */
public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  /**
   * Creates a library with name, an address, and a number of floors
   * @param name
   * @param address
   * @param nFloors
   */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      collection = new Hashtable<String, Boolean>(collection);
      System.out.println("You have built a library: 📖");
    }
  
    /**
     * Updates Hashtable containing collection with the added title
     */
    public void addTitle(String title) {
      this.collection.put(title, true); // This assumes that there can be multiple of a book
    }

    /**
     * Updates Hashtable containing collection and removes title after checking
     * @param title
     * @return Book removed/no existence of book
     */
    public String removeTitle(String title) {
      if (collection.contains(title)){
        this.collection.remove(title);
        return "This book has been removed from the library.";
      }
      else {
        return "There is no such book in the library!";
      }
    }

    /**
     * Modifies value associated with title (the key) to false if the book exists in library and is available
     * @param title
     */
    public void checkOut(String title) {
      if (isAvailable(title)){
        this.collection.replace(title, true, false);
      }
      else if (!isAvailable(title)) {
        System.out.println("This book has been checked out and is unavailable.");
      }
      else {
        System.out.println("We do not have this book, sorry!");
      }
    }

    /**
     * Modifies value associated with title (the key) to true if the title exists in collection
     * @param title
     */
    public void returnBook(String title) {
      if (collection.contains(title)){
        this.collection.replace(title, false, true);
      }
      else {
        System.out.println("This book is not from our library!");
      }
    }

    /**
     * Returns true if the title appears as a key in the Library's collection, false otherwise
     * @param title
     * @return true/false (if title appears as key)
     */
    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }


    /**
     * Returns true if the title is currently available, false otherwise
     * @param title
     * @return true/false (if title is available)
     */
    public boolean isAvailable(String title) {
      return collection.get(title);
    }

  /**
   * Prints out the entire collection in an easy-to-read way (including checkout status)
   */
    public void printCollection() {
      this.collection.toString();
    }



    public static void main(String[] args) {
      Library myLibrary = new Library("Local Library", "124 Drury Lane", 2);
    }
  
  }