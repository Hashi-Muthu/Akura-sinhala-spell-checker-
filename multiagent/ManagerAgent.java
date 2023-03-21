/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiagent;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import masmt.*;
import static multiagent.SinhalaWord.list;
public class ManagerAgent extends MaSMTManager{ 
    MaSMTMessage n;
    public static int complete;
    @Override
    public void active() {
             System.out.println("I am manager in the active");
        
        setNumberofClients(4);
      
       agents[0]=new TokenizerAgent("Tokenizer","Token",1);
     agents[1]=new CorpusAgent("Corpus","c",2);
     agents[2]=new SinhalaWord("sword","s",3);
         agents[3]=new GrammarAgent1("Grammar","g1",4);
   // agents[4]=new WebAgent("WebScrapping","w",5); 
  //  agents[4]=new output_Agent("output","o",6);
        activeAllClients();
        activeMessageParsing();
      
  
    }
    public void StartChecking(String Text){
    
    MaSMTMessage m=new MaSMTMessage();
    //String Text1=Text.replaceAll("[a-z]|[A-Z]|[0-9]","");
    
            m.setMessage(Text);
        
        m.setReceiver(new MaSMTAbstractAgent("Tokenizer","Token",1));
      
        sendToClient(m);
        
    
}
   
    @Override
    public void live() {
     
          wait(4000);
    }

    @Override
    public void end() {
       
    }

    
}
