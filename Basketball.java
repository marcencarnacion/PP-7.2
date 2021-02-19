public class Basketball
{
  public String name;
  public boolean hasChampionship;
  public int points;
  public Basketball (String name, boolean hasChampionship, int points)
  {
    this.name = name;
    this.hasChampionship = hasChampionship;
    this.points = points;
  }//end Basketball
  public void printStatistics()
  {
    System.out.println("The Lakers have " + name + ", has won a championship: " + hasChampionship + ", and has scored " + points + " points in their most recent game.");
  }//end printStatistics
}//end Basketball