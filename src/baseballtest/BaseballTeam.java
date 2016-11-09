/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author ofadj3940
 */
public class BaseballTeam extends Sport implements Stats {
    private int  win, loose, tie;
    private String teamN;
    private int stats;
    
    public BaseballTeam(String tn){
        super(tn);
        
    }
    
    public int overallPoints(String wlt){
      
       if (wlt.equalsIgnoreCase("w") ){
           stats+=2;
           win++;
       } else if(wlt.equalsIgnoreCase("l") ){
           stats+=0;
           loose++;
       }else if(wlt.equalsIgnoreCase("t") ){
           stats++;
           tie++;   
    }
       return stats;
    }
    
  public void setWLT(int w, int l, int t){
      w = win;
      l = loose;
      t = tie;
      
  }
    public String toString(){
        String output;
        output = "Baseball team Name: "+teamN
                +"Number of wins: " + win
                +"Number of losses: " + loose
                +"Number of draws: "+tie;
        
     return output;   
    }
}
