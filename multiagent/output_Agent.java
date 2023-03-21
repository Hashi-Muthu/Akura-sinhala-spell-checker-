/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiagent;

import static multiagent.SinhalaWord.list;

/**
 *
 * @author HASHINI
 */
import masmt.*;

public class output_Agent {//extends MaSMTAgent{
    MaSMTMessage m;
 MaSMTMessage n;
//     public output_Agent(String group, String role, int id) {
//        super(group,role,id);
//    }

    output_Agent() {
    }

  public void output_status(){
        for(int j=0;j<SinhalaWord.getListcount();j++)
        {

//            if(list[j].getGrammar_Status()==1)
//            {
//                  list[j].setStatus((list[j].getStatus())-1);
//            }
//            if(list[j].getCorpus_Status()==1)
//            {
//                list[j].setStatus((list[j].getStatus())-1);
//            }
//           else
//            {
//                list[j].setStatus(2);
//            }
    if(list[j].getGrammar_Status()==0&&list[j].getCorpus_Status()==1)
            {
                list[j].setStatus(1);
            }
    if(list[j].getGrammar_Status()==1&&list[j].getCorpus_Status()==0)
            {
                list[j].setStatus(1);
            }
     if(list[j].getGrammar_Status()==1&&list[j].getCorpus_Status()==1)
    {
         list[j].setStatus(0);
    }
  
                      System.out.println("The output Status of "+list[j].getWord()+" is "+list[j].getStatus());
                      // System.out.println("The output Result is "+list[j].getResult());
                                      
    }
    }

//    @Override
//    public void active() {
//        n=new MaSMTMessage();
//       
//    }
//
//    @Override
//    public void live() {
//         m=new MaSMTMessage();
//         m = waitForMessage();
//       
//        m.setReceiver(agent);
//        
//      System.out.println(agent + " -GET- " + m);
//      String k=m.getMessage();
//       
//        if(k.equals("Done"))
//      {
//          output_status();
//     
//      }
//   else
//      {
//          System.out.println("Error");
//      }
//       
//    }
//
//    @Override
//    public void end() {
//        
//    }
}


