/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

import java.util.Scanner;

/**
 *
 * @author ofadj3940
 */
public class BaseballTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      
      Scanner x = new Scanner(System.in);
        
      System.out.println("What is your team name and what is the name of your coach?");
      
      String userIn = x.nextLine();
      
      Sport bTeam = new BaseballTeam(userIn);
      
      
      System.out.println("How many wins do you have?");
      int teamW = x.nextInt();
      
      System.out.println("How many losses do you have?");
      int teamL = x.nextInt();
      
      System.out.println("How many draws do you have?");
      int teamT = x.nextInt();
      
      bTeam.setWLT(teamW, teamL, teamT);
      
      System.out.println("In your most recent game how did you win, loose or tie");
      String teamWLT = x.nextLine();
      
      bTeam.overallPoints(teamWLT);
     
      
    }
    
}
