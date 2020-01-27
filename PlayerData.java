package iplstats;

import java.io.BufferedReader;
import java.io.FileReader;

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
			
			String onerowdata="";
			int f=0;
			System.out.println("Team              |            Player  | Tournament   |   Mat |   BattingInn  | NotOuts |  Runs |  HighestSc |   BatAvg  |  BallsFaced  |  BatingStrike rate |  100s  |  50s  | 0s |  4s |  6s |  BowlingInnings |   OversBowled  |  MaidensBowled |  RunsConceded |  Wickets  | BowlingFigures |  BowlingAvg  |  BowlingEcoRate |  BowlingStrikeRate |  4+InningsWick  | 5+InningsWicks  | Catches |  StumpingsMade");
			while((onerowdata=br.readLine())!=null)
			{
				String[] datafromrow=onerowdata.split(",");
				for(int j=0;j<datafromrow.length;j++)
				{
				  if(datafromrow[j].contains(name)) {
					  f=1;
					  
					for(int i=0;i<datafromrow.length;i++)
					{
						
						System.out.print(datafromrow[i]+"\t|");
					}
				  
					System.out.println();
				  }
				  
				}
			}
			if(f==0)
				System.out.println("No Data");
			
			
		}
		catch(Exception e)
		{
		
		}
		
		}
	
}



