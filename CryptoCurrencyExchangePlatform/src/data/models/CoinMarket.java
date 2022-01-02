/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.models;


import data.repo.CoinApi;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author hasan
 */
public class CoinMarket implements IEntrance{
    public static Trader trader;
    static Map<String, Coins> prices = new HashMap<>(); // DATA FROM API WILL BE STORED HERE
    
    
    Trader getTrader(Trader trader){
        return trader;  
    }
    public static void refreshCoins(){
        CoinApi coinApi=new CoinApi();
        coinApi.takenApiValues();
    }
    public static double getCoinPrice(String coinName){
        return prices.get(coinName).getPrice();
    }
    void setTrader(Trader trader){
        this.trader = trader;
    }
    
    public static void setPrices(Map<String, Coins> prices){
        CoinMarket.prices = prices;
        
    }
    public static Map<String, Coins> getPrices(){
  
  
        return prices;
    }
    public boolean checkIfEmailExist(String iEmail){
          try {
            File file = new File("users.txt");
            Scanner input = new Scanner(file);
            
            while(input.hasNext()){
                String email = input.next();
                if(email.matches(iEmail)){
                    String userId;
                    
                    return true;
                    //fetch data by id
                }else{
                    input.nextLine();
                }
            }            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        }
        return false;
    
    }
    
    @Override
    public String signUp(String İEmail, String iPassword) {
         try {
            System.out.println(İEmail);
            System.out.println(iPassword);
            FileWriter fileWriter = new FileWriter("users.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if(!checkIfEmailExist(İEmail)){
            String userId = İEmail + iPassword + "blabla"; // THIS REQUIRES SOME PACKAGES
            bufferedWriter.write(İEmail + " " + iPassword + " " + userId);
            bufferedWriter.newLine();
            bufferedWriter.close();
            return userId;
            }else{
                return null;
            }
      
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       return "id";
       
    }
       
    
                
    @Override
    public String signIn(String iEmail, String iPassword) {
          try {
            File file = new File("users.txt");
            Scanner input = new Scanner(file);
            
            while(input.hasNext()){
                String email = input.next();
                String password = input.next();
                if(email.matches(iEmail) && password.matches(iPassword)){
                    String userId;
                    userId = input.next();
                    return userId;
                    //fetch data by id
                }else{
                    input.next();
                }
            }            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean logOut() {
        //GET BACK YO LOGIN PAGE
        return true;
    }
    
}
