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
public class SinhalaWord extends  MaSMTAgent {
  private  int status;
  private int grammar_Status;
  private int corpus_Status;
  //private int web_status;
  private int user_status;
  private int result;
  private static int listcount=0;
  private String Word;
  MaSMTMessage m;
   MaSMTMessage n;
  public static SinhalaWord[] list=new SinhalaWord[10000];

   public SinhalaWord(String group, String role, int id) {
        super(group,role,id);
    }

    public SinhalaWord() {
    }
      public SinhalaWord(String word) {
          this.Word=word;
    }
 public void makeobjectarray()
 {
     for(int k=0;k<words.size();k++)
     {
         list[k]=new  SinhalaWord(words.get(k));
        
        listcount+=1;
         setListcount(listcount);
        
     }
     System.out.println(listcount);
   for(int j=0;j<words.size();j++)
   {
    list[j].setStatus(2);
    list[j].setGrammar_Status(0);
            list[j].setCorpus_Status(0);
                //    list[j].setWeb_status(0);
                   
   }
    
 }
    @Override
    public void active() {
//        n= new MaSMTMessage();
//            n.setMessage("Done");
//           n.setHeader("local");
//           n.setReceiver(new MaSMTAbstractAgent("Grammar","g1",4));
//           n.setSender(agent);
//    sendMessage(n);  
//     System.out.println(n.getMessage());
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public static void setListcount(int listcount) {
        SinhalaWord.listcount = listcount;
    }

    public void setWord(String Word) {
        this.Word = Word;
    }

    public int getStatus() {
        return status;
    }

    public int getResult() {
        return result;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

//    public int getWeb_status() {
//        return web_status;
//    }
//
//    public void setWeb_status(int web_status) {
//        this.web_status = web_status;
//    }

    public int getGrammar_Status() {
        return grammar_Status;
    }

    public int getCorpus_Status() {
        return corpus_Status;
    }

    public void setCorpus_Status(int corpus_Status) {
        this.corpus_Status = corpus_Status;
    }

    public void setGrammar_Status(int grammar_Status) {
        this.grammar_Status = grammar_Status;
    }

    public static int getListcount() {
        return listcount;
    }

    public String getWord() {
        return Word;
    }

    @Override
    public void live() {
        m = waitForMessage();
       
        m.setReceiver(agent);
        
      System.out.println(agent + " -GET- " + m);
      String k=m.getMessage();
        
        if(k.equals("Done"))
      {
          
          makeobjectarray();
      }
   else
      {
          System.out.println("Error");
      }
    }

    @Override
    public void end() {
       
    }
    
}
