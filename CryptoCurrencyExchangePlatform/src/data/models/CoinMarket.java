/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.models;


import data.repo.CoinApi;
import data.repo.CoinMarketDatabase;
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
    public Trader trader;
    private static Map<String, Coin> prices = new HashMap<>(); // DATA FROM API WILL BE STORED HERE
    CoinMarketDatabase coinMarketDatabase = new CoinMarketDatabase();
    CoinApi coinApi=new CoinApi();
    public Trader getTrader(){
        return trader;  
    }
    public void refreshCoins(){
        setPrices(coinApi.fetchApiValues());
    }  
    public void setPrices(Map<String, Coin> prices){
        CoinApi coinApi=new CoinApi();
       prices = coinApi.fetchApiValues(); 
    }
    public Map<String, Coin> getPrices(){
        return prices;
    }
     
    @Override
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
    public void signUp(String IEmail, String iPassword) {
         try {
            System.out.println(IEmail);
            System.out.println(iPassword);
            FileWriter fileWriter = new FileWriter("users.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if(!checkIfEmailExist(IEmail)){
            String userId = IEmail + iPassword + "blabla"; // THIS REQUIRES SOME PACKAGES
            bufferedWriter.write(IEmail + " " + iPassword + " " + userId);
            bufferedWriter.newLine();
            bufferedWriter.close();
            trader = new Trader(IEmail, userId);
            CoinMarketDatabase database = new CoinMarketDatabase();
            database.insertUser(IEmail, userId);
            }else{
                System.out.println("User has alread an account");
            }
      
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
       
    
                
    @Override
    public boolean signIn(String iEmail, String iPassword) {
          try {
            File file = new File("users.txt");
            Scanner input = new Scanner(file);
            
            while(input.hasNext()){
                String email = input.next();
                String password = input.next();
                if(email.matches(iEmail) && password.matches(iPassword)){
                    String userId;
                    userId = input.next(); 
                    trader = coinMarketDatabase.callUser(userId, iEmail);
                    return true;
                }else{
                    input.next();
                }
            }
            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        }
         return false;
    }

    @Override
    public boolean logOut() {
        //GET BACK YO LOGIN PAGE
        return true;
    }
    
}
