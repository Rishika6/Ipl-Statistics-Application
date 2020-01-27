package iplstats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class PlayerData {

	public static void main(String[] args)
	{
	     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of a player");
        String name=sc.nextLine();
        
        BufferedReader br=null;
        
        
        readfile(br,name);
      
         
	}

	
	
	public static void readfile(BufferedReader br,String name)
	{
		try {
			 br=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\projects\\data.csv"));
			 //br.readLine();
			 //System.out.println("Pos     Name      Matches   Innings  Overs   Runs   Wickets  Bowlfig   Avg Eco  Strikerate  4Wicksin1over  5Wicksin1over  NotOuts   Highest  Balls  100s  50s    4s   6s");
			 display(br,name);
		 }
		 catch(Exception e)
		 {
			 
		 }
	}
	

	
	public static void display(BufferedReader br,String name)
	{
		try {
			int totrun=0;
			String onerowdata="";
			int f=0;
			while((onerowdata=br.readLine())!=null)
			{
				String[] datafromrow=onerowdata.split(",");
				for(int j=0;j<datafromrow.length;j++)
				{
				  if(datafromrow[j].contains(name)) {
					  f=1;
					  
					System.out.println("Team:"+datafromrow[0]);
					System.out.println("Player:"+datafromrow[1]);
					System.out.println("Tournament:"+datafromrow[2]);
					System.out.println("Matches:"+datafromrow[3]);
					System.out.println("Batting Innings:"+datafromrow[4]);
					System.out.println("NotOuts:"+datafromrow[5]);
					System.out.println("Runs:"+datafromrow[6]);
					totrun=totrun+Integer.parseInt(datafromrow[6]);
					System.out.println("Highest Score:"+datafromrow[7]);
					  
					System.out.println("Batting Average:"+datafromrow[8]);
					System.out.println("Balls Faced:"+datafromrow[9]);
					System.out.println("Batting strike Rate:"+datafromrow[10]);
					System.out.println("100s:"+datafromrow[11]);
					System.out.println("50s:"+datafromrow[12]);
					System.out.println("0s:"+datafromrow[13]);
					System.out.println("4s:"+datafromrow[14]);
					System.out.println("6s"+datafromrow[15]);
					System.out.println("Bowling Innings:"+datafromrow[16]);
					System.out.println("Overs Bowled:"+datafromrow[17]);
					System.out.println("Maidens Bowled:"+datafromrow[18]);
					System.out.println("Runs Conceded:"+datafromrow[19]);
					System.out.println("Wickets taken:"+datafromrow[20]);
					System.out.println("Best Bowling Figures:"+datafromrow[21]);
					System.out.println("Bowling average:"+datafromrow[22]);
					System.out.println("Bowling Economy"+datafromrow[23]);
					
					System.out.println("Bowling strike rate:"+datafromrow[24]);
					System.out.println("4+Innings Wickets:"+datafromrow[25]);
					System.out.println("5+Innings Wickets:"+datafromrow[26]);
					System.out.println("Catches:"+datafromrow[27]);
					System.out.println("Stumpings Made:"+datafromrow[28]);
					System.out.println();
					
				  }
				  
				}
			}
			
			
			if(f==0)
				System.out.println("No Data");
			else
				System.out.println("Total Runs in three years:"+totrun);
			}
		catch(Exception e)
		{
		
		}
		
		}
	
}



