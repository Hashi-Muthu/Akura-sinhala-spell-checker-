/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiagent;

/**
 *
 * @author HASHINI
 */
public class Sinhala {
     private int id;
    private String word;
     //constructors
    public Sinhala(){}
    public Sinhala(int i,String w){
        id=i;
        word=w;
    
    }
    
    //getters
    public String word(){
    return this.word;
    }
    public int id(){
    return this.id;
    }
    //setters
    public void word(String w){
     this.word=w;
    }
    public void id(int i){
       this.id=i;
    }
}
