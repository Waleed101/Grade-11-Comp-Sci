import java.util.Scanner;

class Team2D
{
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Scanner scString = new Scanner(System.in);
      int numOfTeams, numOfPlayers;
      String[][] playersName;
      
      System.out.print("Enter Number of Teams: ");
      numOfTeams = sc.nextInt();
      System.out.print("Enter number of players on each team: ");
      numOfPlayers = sc.nextInt();
      playersName = new String[numOfTeams][numOfPlayers];
      
      for(int teams = 0; teams < numOfTeams; teams++)
         for (int player = 0; player < numOfPlayers; player++)
         {
            System.out.print("Enter team " + (teams+1) + " player " + (player+1)+": ");
            playersName[teams][player] = scString.nextLine();  
         }
      
      System.out.println("Here are the teams: ");
      for(int teams = 0; teams < numOfTeams; teams++)
       {  
         System.out.print("Team " + (teams+1) + ":\t");
         for (int player = 0; player < numOfPlayers; player++)
         {
            System.out.print(playersName[teams][player] + " ");  
         }
         System.out.println();
       }  
      
   }
}