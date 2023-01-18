package com.monocept.model;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PlayPig {
	private int totalTurn;
	private int totalScore;
	
	Scanner sc = new Scanner(System.in);
	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getTotalTurn() {
		return totalTurn;
	}

	public void setTotalTurn(int totalTurn) {
		this.totalTurn = totalTurn;
	}

	public void playGame() {
		this.setTotalTurn(1);
		while(this.getTotalScore()<20)
		{
			
			System.out.println("Turn "+this.getTotalTurn());
			this.setTotalTurn(this.getTotalTurn()+1);
			int scoreOfTurn = 0;
			
			while(this.getTotalScore()<20)
			{
				System.out.println("Roll or hold?()r/h");
				char choice = sc.next().charAt(0);
				if(choice=='r')
				{
					int die= ThreadLocalRandom.current().nextInt(1,6);
					System.out.println("Die "+die);
					if(die==1) 
						{
							scoreOfTurn =0;
							//this.setTotalScore(0);
							System.out.println("Turn over. No score");
							System.out.println("Total score "+this.getTotalScore());
							break;
						}
					else
					{
						scoreOfTurn += die;
						this.setTotalScore(die+this.getTotalScore());
					}
					
					
				}
			    if(choice=='h')
			    {
			    	System.out.println("Score for turn "+scoreOfTurn);
			    	System.out.println("Total Score "+this.getTotalScore());
			    	break;
			    }
			    if(this.getTotalScore()>=20) 
			    {
			    	System.out.println("Score for turn "+scoreOfTurn);
			    	System.out.println("Total Score "+this.getTotalScore());
			    	System.out.println("you finished in "+this.getTotalTurn()+" turns!");
			    }
			    
			}
		    
		}
	}

}
