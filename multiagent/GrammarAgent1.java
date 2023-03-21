
package multiagent;


import static multiagent.TokenizerAgent.words;

import static multiagent.SinhalaWord.list;
import masmt.*;
public class GrammarAgent1 extends  MaSMTAgent {
     
String Text;
MaSMTMessage m;
     MaSMTMessage n;
     
public GrammarAgent1(String t)
{
    Text=t;
}

    GrammarAgent1(String group, String role, int id) {
      super(group,role,id);
    }

    public GrammarAgent1() {
    }

   
    @Override
   public void active() {
//n= new MaSMTMessage();
//            n.setMessage("Done");
//           n.setHeader("local");
//           n.setReceiver(new MaSMTAbstractAgent("Corpus","c",2));
//           n.setSender(agent);
//    sendMessage(n);  
//     System.out.println(n.getMessage());
    }

    @Override
    public void live() {
                
       m = waitForMessage();
       
        m.setReceiver(agent);
        
      System.out.println(agent + " -GET- " + m);
      String k=m.getMessage();
//          for(int j=0;j<SinhalaWord.getListcount();j++)
//   {
//     System.out.println(list[j].getGrammar_Status());
//   }
       
        if(k.equals("Done"))
      {
   //Rule 1
          for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
    list[j].setGrammar_Status(SpellRule1(word,list[j].getGrammar_Status()));
 //   SpellRule1(word,Grammar_Status);
   // list[j].setResult(list[j].getResult()+1);
   }
   //Rule 2
          for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
    list[j].setGrammar_Status(SpellRule2(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
   }
   //Rule 3
          for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
    list[j].setGrammar_Status(SpellRule3(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
   }
          //Rule 4
                 for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
   list[j].setGrammar_Status(SpellRule4(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
   }
   //Rule 5
               for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
 list[j].setGrammar_Status(SpellRule5(word,list[j].getGrammar_Status()));
  //  list[j].setResult(list[j].getResult()+1);
   }
               //Rule 6
    for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
   
   list[j].setGrammar_Status(SpellRule6(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
   } 
    //Rule 7
     for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
 list[j].setGrammar_Status(SpellRule7(word,list[j].getGrammar_Status()));
    //list[j].setResult(list[j].getResult()+1);
   }  
     //Rule 8
         for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
    list[j].setGrammar_Status(SpellRule8(word,list[j].getGrammar_Status()));
  //  list[j].setResult(list[j].getResult()+1);
   }
    //Rule 9
         for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
  list[j].setGrammar_Status(SpellRule9(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
   }
         //Rule 10
              for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
     list[j].setGrammar_Status(SpellRule10(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
   } 
         
              //Rule 11
       for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
  list[j].setGrammar_Status(SpellRule11(word,list[j].getGrammar_Status()));
    //ist[j].setResult(list[j].getResult()+1);
   } 
       //Rule 12
          for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
     list[j].setGrammar_Status(SpellRule12(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
   }   
      //Rule 13
              for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
     list[j].setGrammar_Status(SpellRule13(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
   } 
             //Rule 14
              for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
     list[j].setGrammar_Status(SpellRule14(word,list[j].getGrammar_Status()));
   // list[j].setResult(list[j].getResult()+1);
    
   } 
          //Rule 15
                   for(int j=0;j<SinhalaWord.getListcount();j++)
   {
     
    String word=list[j].getWord();
   list[j].setGrammar_Status(SpellRule15(word,list[j].getGrammar_Status()));
    list[j].setResult(list[j].getResult()+1);
       
  
   }      
        for(int j=0;j<SinhalaWord.getListcount();j++)       
        {
            System.out.println("grammar status of "+list[j].getWord()+" is "+list[j].getGrammar_Status());
        }
      }
  
   else
      {
          System.out.println("Error");
      }
    
    }
    
   //Rule 1
public int SpellRule1(String word,int status) {
  
    
       if(word.charAt(0)=='ණ')    

       {
           if(word.charAt(1)!='ය')
           {    
               status=1;
               System.out.println("1 waradi");
               
           }
       }
       
     return status;
       }
//Rule 2
  public int SpellRule2(String word,int status)     
  {

         if(word.length()>3) {
           
       
       if(word.charAt(word.length()-3)=='ර')    

       {
           if(word.charAt(word.length()-2)=='ණ'){
                if(word.charAt(word.length()-1)=='්')
                {
                  status=1;
                    System.out.println("2 waradi");
                }
           }else{
              
               //System.out.println("hriii");
           }
           
       }
    }
      return status;
  }
  //Rule 3
  public int SpellRule3(String word,int status)
  {

       for(int k=0;k<word.length();k++){
       if(word.charAt(k)=='ඍ' )    
       {

           if(k+1<=word.length()-1)
           {    
               if (word.charAt(k+1)=='න'){
                 status=1;
           System.out.println("3 waradi");
               }
               }
           }
        }
       
       for(int k=0;k<word.length();k++){
       System.out.print("");
       if(word.charAt(k)=='ර'|word.charAt(k)=='ෂ' )    
       { if(k+2<word.length()-1)
               {
           if(k+1<=word.length()-1)
           {  
               if (word.charAt(k+1)=='්'){
                
           if (word.charAt(k+2)=='න'){
                status=1;
           System.out.println("3 waradi");
               }
               }
           }
       }
       }
       }
       return status;
  }
  //Rule 4
  public int SpellRule4(String word,int status)
  {
      if(word.length()-2>0)
      {
   if(word.charAt(word.length()-2)=='ණ'){
                if(word.charAt(word.length()-1)=='්')
                {
                    status=1;
                    System.out.println(" 4 waradi");
                }
           
   }
      }
      return status;
  }
  //Rule 5
        public int SpellRule5(String word,int status)
        {
            
            
               for(int k=0;k<word.length()-1;k++){
      
       if(word.charAt(k)=='ශ' | word.charAt(k)=='ස' )
       {
          
           if(word.charAt(k+1)=='ණ')
           {
                status=1;
           System.out.println("5 waradi");
               
           }
           else if(k+2<word.length()&(word.charAt(k+1)=='ා'
                  |word.charAt(k+1)=='ැ'|
                   word.charAt(k+1)=='ෑ'|
                   word.charAt(k+1)=='ි'|
                   word.charAt(k+1)=='ී'|word.charAt(k+1)=='ු'|word.charAt(k+1)=='ූ'|word.charAt(k+1)=='ෘ'|
                   word.charAt(k+1)=='ෲ'|word.charAt(k+1)=='ෙ'|word.charAt(k+1)=='ේ'|word.charAt(k+1)=='ෛ'|
                   word.charAt(k+1)=='ො'|word.charAt(k+1)=='ෝ'|word.charAt(k+1)=='ෞ'|word.charAt(k+1)=='ං'|word.charAt(k+1)=='ඃ'|word.charAt(k+1)=='ඃ')) 
           {
               if(word.charAt(k+2)=='ණ')
               {
                   status=1;
                   System.out.println(" 5 waradi");
              
               }
           }
       
       }
       }
            return status;
        }
        // Rule 6
          public int SpellRule6(String word,int status)
          {
                    if(word.length()-2>=0)
    {     
     if(word.charAt(word.length()-2)=='ළ')

{

if(word.charAt(word.length()-1)=='්')
{
status=1;
System.out.println(" 6 waradi");

}
}
    }
              return status;
          }
          //Rule 7
           public int SpellRule7(String word,int status) 
           {
                if(word.length()-1>=3)
       {
     if(word.charAt(0)=='ප'&word.charAt(1)=='ි')
     {
        
           if(word.charAt(2)=='ල'&word.charAt(3)=='ි')
           {
               status=1;
               System.out.println("7 waradi");
           }
           else
           {
              // System.out.println("Hari");
           }
           }
     }
               return status;
           }
     //Rule 8
           public int SpellRule8(String word,int status) 
           {
               if(word.length()-3>0)
    {     
     if(word.charAt(word.length()-3)=='ව')
     {
        if(word.charAt(word.length()-2)=='ළ')

{

if(word.charAt(word.length()-1)=='්')
{
status=1;
System.out.println(" 8 waradi");

}
}
}
     }
          return status;
     }
 //Rule 9
           public int SpellRule9(String word,int status)
           {
               for(int k=0;k<word.length()-1;k++){
      
           
       System.out.print("");
       if(word.charAt(k)=='ශ' | word.charAt(k)=='ස' )
       {
           
      
           if(word.charAt(k+1)=='ණ')
           {
               status=1;
           System.out.println("9 waradi");
               
           }
           else if(k+2<word.length()&(word.charAt(k+1)=='ා'
                  |word.charAt(k+1)=='ැ'|
                   word.charAt(k+1)=='ෑ'|
                   word.charAt(k+1)=='ි'|
                   word.charAt(k+1)=='ී'|word.charAt(k+1)=='ු'|word.charAt(k+1)=='ූ'|word.charAt(k+1)=='ෘ'|
                   word.charAt(k+1)=='ෲ'|word.charAt(k+1)=='ෙ'|word.charAt(k+1)=='ේ'|word.charAt(k+1)=='ෛ'|
                   word.charAt(k+1)=='ො'|word.charAt(k+1)=='ෝ'|word.charAt(k+1)=='ෞ'|word.charAt(k+1)=='ං'|word.charAt(k+1)=='ඃ'|word.charAt(k+1)=='ඃ'))  

           {
               if(word.charAt(k+2)=='ණ')
               {
                   status=1;
                   System.out.println("9 waradi");
              
               }
           }
       
       }
       }
               return status;
           }
           //Rule 10
           public int SpellRule10(String word,int status)
           {
                  for(int k=1;k<word.length();k++){
   
       if(word.charAt(k)=='ච' )
       {
         
           if(word.charAt(k-1)=='ෂ')
           {
               status=1;
           System.out.println("10 waradi");
               
           }
           else if(k-2>0&(word.charAt(k-1)=='ා'
                  |word.charAt(k-1)=='ැ'|
                   word.charAt(k-1)=='ෑ'|
                   word.charAt(k-1)=='ි'|
                   word.charAt(k-1)=='ී'|word.charAt(k-1)=='ු'|word.charAt(k-1)=='ූ'|word.charAt(k-1)=='ෘ'|
                   word.charAt(k-1)=='ෲ'|word.charAt(k-1)=='ෙ'|word.charAt(k-1)=='ේ'|word.charAt(k-1)=='ෛ'|
                   word.charAt(k-1)=='ො'|word.charAt(k-1)=='ෝ'|word.charAt(k-1)=='ෞ'|word.charAt(k-1)=='ං'|word.charAt(k-1)=='ඃ'|word.charAt(k-1)=='ඃ'|
                   word.charAt(k-1)=='්'))  

           {
               if(word.charAt(k-2)=='ෂ')
               {
                   status=1;
                   System.out.println("10 waradi");
              
               }
           }
       
       }
       }
                  return status;
           }
                  //Rule 11
          public int SpellRule11(String word,int status)
          {
                for(int k=1;k<word.length();k++){
   
       if(word.charAt(k)=='ත' )
       {
         
           if(word.charAt(k-1)=='ෂ'|word.charAt(k-1)=='ශ')
           {
               status=1;
           System.out.println("11 waradi");
               
           }
           else if(k-2>0&(word.charAt(k-1)=='ා'
                  |word.charAt(k-1)=='ැ'|
                   word.charAt(k-1)=='ෑ'|
                   word.charAt(k-1)=='ි'|
                   word.charAt(k-1)=='ී'|word.charAt(k-1)=='ු'|word.charAt(k-1)=='ූ'|word.charAt(k-1)=='ෘ'|
                   word.charAt(k-1)=='ෲ'|word.charAt(k-1)=='ෙ'|word.charAt(k-1)=='ේ'|word.charAt(k-1)=='ෛ'|
                   word.charAt(k-1)=='ො'|word.charAt(k-1)=='ෝ'|word.charAt(k-1)=='ෞ'|word.charAt(k-1)=='ං'|word.charAt(k-1)=='ඃ'|word.charAt(k-1)=='ඃ'|
                   word.charAt(k-1)=='්'))  

           {
               if(word.charAt(k-2)=='ෂ')
               {
                   status=1;
                   System.out.println("11 waradi");
              
               }
           }
       
       }
                }
                return status;
          }
          //Rule 12
        public int SpellRule12(String word,int status)
          {
          for(int k=1;k<word.length();k++){
     
           
       System.out.print("");
       if(word.charAt(k)=='ට' |word.charAt(k)=='ඨ'|word.charAt(k)=='ඩ'|word.charAt(k)=='ඪ'|word.charAt(k)=='ණ')
       {
           if((word.charAt(k-1)=='ශ'| word.charAt(k-1)=='ස')&word.charAt(0)=='ස')
           {
               status=1;
           System.out.println("12 waradi");
               
           }
           else if(k-2>=0&(word.charAt(k-1)=='ා'
                  |word.charAt(k-1)=='ැ'|
                   word.charAt(k-1)=='ෑ'|
                   word.charAt(k-1)=='ි'|
                   word.charAt(k-1)=='ී'|word.charAt(k-1)=='ු'|word.charAt(k-1)=='ූ'|word.charAt(k-1)=='ෘ'|
                   word.charAt(k-1)=='ෲ'|word.charAt(k-1)=='ෙ'|word.charAt(k-1)=='ේ'|word.charAt(k-1)=='ෛ'|
                   word.charAt(k-1)=='ො'|word.charAt(k-1)=='ෝ'|word.charAt(k-1)=='ෞ'|word.charAt(k-1)=='ං'|word.charAt(k-1)=='ඃ'|word.charAt(k-1)=='ඃ'|
                   word.charAt(k-1)=='්'))  

           {
              if(word.charAt(k-2)=='ශ'| word.charAt(k-2)=='ස')
               {
                   status=1;
                   System.out.println("12 waradi");
              
               }
           }
       
       }
       }
          return status;
          }
        //Rule 13
                public int SpellRule13(String word,int status)
                {
                    for(int k=0;k<word.length();k++){


System.out.print("");
if(word.charAt(k)=='ක' )
{

// System.out.println("dshbx");
if(k+1<=word.length()-1)
{
if (word.charAt(k+1)=='්'){

if(k+2<=word.length()-1)
{
  if(word.charAt(k+2)=='ශ'| word.charAt(k+2)=='ස'){
     status=1;
System.out.println(" 13 waradi");
}
}
}
}   
}
}
                    return status;
                }
                //Rule 14
                public int SpellRule14(String word,int status)
                {
                    
                    for(int k=1;k<word.length();k++){
   
       if(word.charAt(k)=='ණ')
       {
     
           if(word.charAt(k-1)=='ශ'| word.charAt(k-1)=='ස')
           {
              status=1;
           System.out.println(" 14 waradi");
               
           }
           else if(k-2>=0&(word.charAt(k-1)=='ා'
                  |word.charAt(k-1)=='ැ'|
                   word.charAt(k-1)=='ෑ'|
                   word.charAt(k-1)=='ි'|
                   word.charAt(k-1)=='ී'|word.charAt(k-1)=='ු'|word.charAt(k-1)=='ූ'|word.charAt(k-1)=='ෘ'|
                   word.charAt(k-1)=='ෲ'|word.charAt(k-1)=='ෙ'|word.charAt(k-1)=='ේ'|word.charAt(k-1)=='ෛ'|
                   word.charAt(k-1)=='ො'|word.charAt(k-1)=='ෝ'|word.charAt(k-1)=='ෞ'|word.charAt(k-1)=='ං'|word.charAt(k-1)=='ඃ'|word.charAt(k-1)=='ඃ'|
                   word.charAt(k-1)=='්'))  

           {
              if(word.charAt(k-2)=='ශ'| word.charAt(k-2)=='ස')
               {
                  status=1;
                   System.out.println("14 waradi");
              
               }
           }
       
       }
       }
               return status;
                }
 //Rule 15
                public int SpellRule15(String word,int status)
                {
                         for(int k=0;k<word.length();k++){

       System.out.print("");
       if(word.charAt(k)=='ඟ' | word.charAt(k)=='ඳ' |word.charAt(k)=='ඹ'|word.charAt(k)=='ඬ'|word.charAt(k)=='ඦ')    

       {
    
           if(k+1<=word.length()-1)
           {    
               if (word.charAt(k+1)=='්'){
                   status=1;
           System.out.println("15 waradi");
               }
           }
       }
       }
                    return status;
                   
                }


                
     
    @Override
    public void end() {
       
    }


   
}

   //ණකරය මිනිරණ් ඍන කණ් ඊශණ කළ් පිලිබඳ ගෙවළ් ආසණ අෂචර්ය උෂ්ත කනිශ්ඨ අක්ශි උශ්ණත්වය අහඟ් 
