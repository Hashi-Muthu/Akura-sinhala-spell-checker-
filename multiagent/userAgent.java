/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiagent;
import masmt.*;
/**
 *
 * @author HASHINI
 */
import static multiagent.TokenizerAgent.words;
public class userAgent extends  MaSMTAgent {
MaSMTMessage m;
   public userAgent(String group, String role, int id) {
        super(group,role,id);
    }

    @Override
    public void active() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void live() {
         m = waitForMessage();
       
        m.setReceiver(agent);
        
      System.out.println(agent + " -GET- " + m);
      String k=m.getMessage();
        
        if(k.equals("Done"))
      {
          
          getUser_Idea();
      }
   else
      {
          System.out.println("Error");
      }
    }

    @Override
    public void end() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getUser_Idea() {
       
    }

    
     
}
