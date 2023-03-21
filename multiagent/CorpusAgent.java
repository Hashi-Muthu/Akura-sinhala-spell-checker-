/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiagent;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import masmt.*;
import static multiagent.SinhalaWord.list;
import static multiagent.TokenizerAgent.words;
public class CorpusAgent extends  MaSMTAgent {
    
String Text;
MaSMTMessage k;
 MaSMTMessage j;
 output_Agent obj=new output_Agent();
         //List <Sinhala> sinhalaList=new ArrayList<>();
/*public CorpusAgent(String t)
{
    Text=t;
}*/

    CorpusAgent(String group, String role, int id) {
      super(group,role,id);
    }

   
    @Override
   public void active() {
   j = new MaSMTMessage();
            j.setMessage("Done");
           j.setHeader("local");
           j.setReceiver(new MaSMTAbstractAgent("WebScrapping","w",5));
           j.setSender(agent);
    sendMessage(j);  
     System.out.println(j.getMessage());
    }

    @Override
    public void live() {
                
      k = waitForMessage();
        k.setReceiver(agent);
      System.out.println(agent + " -GET- " + k);
      String s=k.getMessage();
        
       
      if(s.equals("Done"))
      {
          for(int j=0;j<SinhalaWord.getListcount();j++)
          {
              
                list[j].setCorpus_Status(CheckCorpus(list[j].getWord()));
                System.out.println("corpus status of "+list[j].getWord()+" is "+list[j].getCorpus_Status());
               
           //   System.out.println(words.get(j));
          }
           obj.output_status();
      }
   else
      {
          System.out.println("Error");
      }
    
    }
    

    @Override
    public void end() {
       
 
    }

    public int CheckCorpus(String nWord){
        Sinhala sinhala;
       int Value=1;

         String sql="SELECT id,word From sinhala WHERE word=?";
         
          try (Connection conn = this.connect();
             PreparedStatement pst  = conn.prepareStatement(sql)){
            
            // set the value
            pst.setString(1,nWord);
            //
            ResultSet rs  = pst.executeQuery();
            int i=rs.getInt("id");
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("word") );
              if(i>0)
              {
                  Value=0;
              } 
            }
              
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
          
         return Value;
    }
    
 public Connection connect(){
        String url= "jdbc:sqlite:Database.db";
        
        Connection conn = null;
        try {
        //    SQLiteConfig config=new SQLiteConfig();
          //  config.setEncoding(SQLiteConfig.Encoding.UTF8);
        conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
         
            
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;   
    } 
    /*public static void main(String[] args) {
                Scanner input = new Scanner(System.in); 
        //Checker obj1 = new Checker();
                 System.out.println("Please enter your word");
                String theWord = input.nextLine();
                CorpusAgent obj=new CorpusAgent(theWord);
                System.out.println(obj.CheckCorpus(theWord));  

    }*/
// public void set_the_status(int value,int id)
// {
//     if(value==0)
//     {
//          //System.out.println(list[id].getCorpus_Status());
//       
//             list[id].setResult(list[id].getResult()+1);
//
//         System.out.println("c  "+list[id].getCorpus_Status());
//     }
// }
}