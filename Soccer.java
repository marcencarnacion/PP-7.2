public class Soccer
{
  public String name;
  public boolean hasChampionship;
  public int points;
  public Soccer (String name, boolean hasChampionship, int points)
  {
    this.name = name;
    this.hasChampionship = hasChampionship;
    this.points = points;
  }//end Soccer
  public void printStatistics()
  {
    System.out.println("Barcelona has " + name + ", has won a championship: " + hasChampionship + " and has scored " + points + " points in their most recent game.");
  }//end printStatistics
}//end Soccer