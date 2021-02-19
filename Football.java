public class Football
{
  public String name;
  public boolean hasChampionship;
  public int points;
  public Football (String name, boolean hasChampionship, int points)
  {
    this.name = name;
    this.hasChampionship = hasChampionship;
    this.points = points;
  }//end Football
  public void printStatistics()
  {
    System.out.println("The Buccaneers have " + name + ", has won a championship: " + hasChampionship + " and has scored " + points + " points in their most recent game.");
  }//end printStatistics
}//end Football