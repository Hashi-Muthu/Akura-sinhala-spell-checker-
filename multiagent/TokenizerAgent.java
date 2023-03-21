/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiagent;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
 
import masmt.*;
public class TokenizerAgent extends  MaSMTAgent {
      int Result=0; 
String sentence;
public static List<String> words ;
MaSMTMessage m;
 MaSMTMessage n;
 MaSMTMessage k;

public TokenizerAgent(String t)
{
    sentence=t;
   
}

    TokenizerAgent(String group, String role, int id) {
      super(group,role,id);
    }

   
    @Override
   public void active() {
     
          n=new MaSMTMessage();
      // k=new MaSMTMessage();
    }

    @Override
    public void end() {
       
 
    }
    public void  tokenizer(String sentence){

  
          TokenizerAgent obj=new TokenizerAgent(sentence);
    //Split the sentence 
    words = new ArrayList<String>();
    BreakIterator breakIterator = BreakIterator.getWordInstance();
    breakIterator.setText(sentence);
    int lastIndex = breakIterator.first();
    while (BreakIterator.DONE != lastIndex) {
        int firstIndex = lastIndex;
        lastIndex = breakIterator.next();
        if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(sentence.charAt(firstIndex))) {
            words.add(sentence.substring(firstIndex, lastIndex));
        }
    }
     System.out.println(words);
     
       for(int i=0;i<words.size();i++){
            
          Result+=1;
       
       }
 if(Result==words.size())
         {
             n.setMessage("Done");
             
         }
 else
 {
     n.setMessage("");
   
   
 }
        // n.setMessage("Done");
           n.setHeader("broadcast");
           //n.setReceiver(new MaSMTAbstractAgent("sword","s",3));
           n.setSender(agent);
    sendMessage(n);  
     System.out.println(n.getMessage());
     }
    
    @Override
    public void live() {
         
        m = waitForMessage();
      System.out.println(agent + " -GET- " + m);
      String k=m.getMessage();
        System.out.println(k);
      if(k.isEmpty())
      {
          System.out.println("Text is empty");
      }
   else
      {
          tokenizer(k);
      }
    
    wait(2000);
}

}   

    

/*public void tokenizer()
        {
               System.out.println("Please enter the String");
    Scanner input=new Scanner(System.in);
            String Text=input.nextLine();
            //input.nextLine();
    
  
int counter=0;
        for(int i=0;i<Text.length();i++)
        {
            if(Text.charAt(i)==' ')
            counter++;
        }
        
     String[] word=new String[1000];
          TokenizerAgent obj=new TokenizerAgent(Text);
    //Split the sentence 
   List<String> words = new ArrayList<String>();
    BreakIterator breakIterator = BreakIterator.getWordInstance();
    breakIterator.setText(Text);
    int lastIndex = breakIterator.first();
    while (BreakIterator.DONE != lastIndex) {
        int firstIndex = lastIndex;
        lastIndex = breakIterator.next();
        if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(Text.charAt(firstIndex))) {
            words.add(Text.substring(firstIndex, lastIndex));
        }
    }
     System.out.println(words);
     for(int i=0;i<counter-1;i++){
         TokenizerAgent obj2=new TokenizerAgent(words.get(i));   
    int k=obj2.Splitword(words.get(i));
        }
     
     }

    private int Splitword(String get) {
 
     for (int i = 0;i <get.length(); i++){
    word[i]=str.charAt(i);
    }*/