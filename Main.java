//Marc Encarnacion
//PP 7.2
//2/18/21
class Main 
{
  public static void main(String[] args) 
  {
    Basketball lakers = new Basketball("Lebron James", true, 20);
    Soccer barcelona = new Soccer ("Lionel Messi", true, 3);
    Football buccaneers = new Football("Tom Brady", true, 4);
    System.out.println();
    System.out.println("Marc Encarnacion, PP 7.2");
    lakers.printStatistics();
    System.out.println();
    barcelona.printStatistics();
    System.out.println();
    buccaneers.printStatistics();
  }//end main method
}//end class main