class Main {
  public static void main(String[] args) {

    int value = ;
    String size;

  
    switch (value) {

      case 10:
        size = "Small";
        break;

      case 20:
        size = "Medium";
        break;

     
      case 50:
        size = "Large";
        break;

      case 100:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
  }
}
