package iplstats;
import java.awt.*;
import java.awt.geom.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.*;

	
	
	import javax.swing.JFrame;  
	import javax.swing.SwingUtilities;  
	  
	import org.jfree.chart.ChartFactory;  
	import org.jfree.chart.ChartPanel;  
	import org.jfree.chart.JFreeChart;  
	import org.jfree.chart.plot.PlotOrientation;  
	import org.jfree.data.category.CategoryDataset;  
	import org.jfree.data.category.DefaultCategoryDataset;  
	  
	public class BarChartExample extends JFrame {  
	  
		public static  void  readfile(BufferedReader br,String name)
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
		
	static int x=0;
		
		public static void display(BufferedReader br,String name)
		{
			try {
				int totrun=0;
				
				
				
				String onerowdata="";
				int f=0;
				String[] runs=new String[4];
				String year[]=new String[4];
				String team[]=new String[4];
				int y=0;
				int r=0;
				int t=0;
				//System.out.println("Team              |            Player  | Tournament   |   Mat |   BattingInn  | NotOuts |  Runs |  HighestSc |   BatAvg  |  BallsFaced  |  BatStrRate |  100s  |  50s  | 0s |  4s |  6s |BowlInn| OversBowled |MaidensBowled | RunsConceded| wicks| BowlFig |  BowlAvg  |  BowlEcoRate | BowlStrRate| 4+InnWick | 5+InnWicks |Catches|StumpingsMade");
				while((onerowdata=br.readLine())!=null)
				{
					String[] datafromrow=onerowdata.split(",");
					
					for(int j=0;j<datafromrow.length;j++)
					{
					  if(datafromrow[j].contains(name)) {
						  f=1;
						
						System.out.println("Team:"+datafromrow[0]);
						team[t]=datafromrow[0];
						System.out.println("Player:"+datafromrow[1]);
						System.out.println("Tournament:"+datafromrow[2]);
						year[y]=datafromrow[2];
						System.out.println("Matches:"+datafromrow[3]);
						System.out.println("Batting Innings:"+datafromrow[4]);
						System.out.println("NotOuts:"+datafromrow[5]);
						System.out.println("Runs:"+datafromrow[6]);
						runs[r]=datafromrow[6];
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
						
						System.out.println("Bowling strike rate :"+datafromrow[24]);
						System.out.println("4+Innings Wickets :"+datafromrow[25]);
						System.out.println("5+Innings Wickets :"+datafromrow[26]);
						System.out.println("Catches :"+datafromrow[27]);
						System.out.println("Stumpings Made :"+datafromrow[28]);
						System.out.println();
						System.out.println("|||||||||||||||||||||||");
						
						r++;
						y++;
						t++;
						
						
						
					  }
					  
					  
					}
						
					  
					  
					  
					} 
				 if(f==0)
						System.out.println("No Data");
					else
						System.out.println("Total Runs in four years:"+totrun);
					
					System.out.println("for graph press 1");
				   Scanner sc=new Scanner(System.in);
					 x=sc.nextInt();
					 int prun[]=new int[4];
					 for(int i=0;i<4;i++)
					 {
						 prun[i]=Integer.parseInt(runs[i]);
					 }
					 if(x==1)
					 {
						getruns(prun); 
						getteam(team);
						getyear(year);
					 }
					
					  
					 
						
						
						
						
						
					   System.out.println();
						
					  
					  
					
				
				
			
				
				
				
				
				
			}
			catch(Exception e)
			{
			
			}
			
			} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		private static final long serialVersionUID = 1L;  
	  
	  public BarChartExample(String appTitle) {  
	    super(appTitle);  
	  
	    // Create Dataset  
	    CategoryDataset dataset = createDataset();  
	      
	    //Create chart  
	    JFreeChart chart=ChartFactory.createBarChart(  
	        "Runs made yearwise", //Chart Title  
	        "Year", // Category axis  
	        "Runs", // Value axis  
	        dataset,  
	        PlotOrientation.VERTICAL,  
	        true,true,false  
	       );  
	  
	    ChartPanel panel=new ChartPanel(chart);  
	    setContentPane(panel);  
	  }
	static  int run[];
	 static String team[];
	  static String year[];
	 public static void getruns(int[] runs)
	 {
		 run=runs;
	 }
	 public static void getteam(String[] teams)
	 {
		 team=teams;
	 }
	 public static void getyear(String[] years)
	 {
		 year=years;
	 } 
	

	 protected CategoryDataset createDataset() { 
		  
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
	  
	    
	  
	      dataset.addValue((run[0]), team[0],year[0]);
	 
	     
	  
	    
	    dataset.addValue((run[1]),team[1],year[1]);  

	    
	    dataset.addValue((run[2]),team[2],year[2]);  
	    dataset.addValue((run[3]),team[3],year[3]);
	  
	  
	    return dataset;  
	  }  
	
	  public static void main(String[] args) throws Exception {
		  
		  Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the name of a player");
	        String name=sc.nextLine();
	        
	        BufferedReader br=null;
	        readfile(br,name);
	        
	       sc.close();
	       
	    SwingUtilities.invokeAndWait(()->{  
	    	
	     BarChartExample example=new BarChartExample("Statistics per year");
	    
	      
	      example.setSize(400,200);  
	      example.setLocationRelativeTo(null);  
	      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
	      example.setVisible(true);  
	    });  
	  }  
	} 

    


