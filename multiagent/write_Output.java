/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiagent;

import java.io.BufferedReader;
import javax.swing.JTextArea;
import static multiagent.SinhalaWord.list;



/**
 *
 * @author HASHINI
 */
public class write_Output extends NewGui{
           
  

          public void output()
{
    for(int j=0;j<SinhalaWord.getListcount();j++)
          {
             
              output.append(list[j].getWord());
          }
          
}

}
