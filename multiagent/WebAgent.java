/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiagent;
import static multiagent.SinhalaWord.list;
import masmt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class WebAgent  extends  MaSMTAgent{
MaSMTMessage m;
MaSMTMessage n;
       String fWord;
int count=0; 
   WebAgent(String group, String role, int id) {
      super(group,role,id);
    } 
  public WebAgent()
  {
      
  }
    @Override
    public void active() {
//       n= new MaSMTMessage();
//            n.setMessage("Done");
//           n.setHeader("local");
//           n.setReceiver(new MaSMTAbstractAgent("output","o",6));
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
        
        
        if(k.equals("Done"))
      {
   //Rule 1
          for(int j=0;j<SinhalaWord.getListcount();j++)
          { 

             
              try {
//                  list[j].setWeb_status( webScrapping(list[j].getWord(),list[j].getWeb_status()));
//                      list[j].setResult(list[j].getResult()+1);
//                      System.out.println("web status  of "+list[j]+" is "+list[j].getWeb_status());

              } catch (Exception ex) {
                  System.out.println("Error");
              }
          
                      
         
      }
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

    public int webScrapping(String myString,int status) throws Exception 
    {
        System.out.println("*************"+myString+"*********************************");
                       
                    
                      
   
        String cnv;
    
        cnv = URLEncoder.encode(myString, StandardCharsets.UTF_8.toString());
    
                //      System.out.println(cnv);
                    String url = "https://glosbe.com/si/si/" + cnv ;   
                  
                 //    System.out.println(url);
                      
	Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
               .referrer("http://www.google.com").timeout(6000).get();
	Element content =  doc.getElementById("tmem_first_examples");
                   Elements subContent = content.getElementsByTag("span");
                                       // for(Element e: subContent)
                                      //  System.out.println(e.text());
                                     for(Element e: subContent) {
fWord = e.text();
    if ("යුදෙව් අනන්යතාවය දෙමාපියන් දෙදෙනාම යුදෙව් සිටිය යුතු බවට නියම , සහ පමණක් නොව පියා බව විශ්වාස නවීන Karaites සුළුතරයක් වුවද.".equals(fWord)){
System.out.println("Sorry there are no examples");
System.exit(0);
}
 else if(count<1){
     if("".equals(fWord))
     {
         System.out.println("Sorry there are no examples");
          break;
     }
     else{
System.out.println(fWord);
count++;
status=1;
        break;
     }
}
else
    {
        System.exit(0);
    }
}

                                  
    return status;  
    }
    
    
    public String getUrlForSearch(String myString) throws UnsupportedEncodingException{

            String cnv;
          
   
       cnv = URLEncoder.encode(myString, StandardCharsets.UTF_8.toString());
   
                   System.out.println(cnv);
                  String url = "https://www.google.com/search?q=" + cnv ;  
                  String newS="<a  href="+url+">"+myString+"</a>";
return newS;
}
}

