package iplstats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



import java.util.Scanner;
public class PlayerMain  {

	public static void main(String[] args)
	{
	     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of a player");
        String name=sc.nextLine();
        
        BufferedReader br=null;
        
        PlayerData b=new PlayerData();
        b.readfile(br,name);
      
         
	}
}


