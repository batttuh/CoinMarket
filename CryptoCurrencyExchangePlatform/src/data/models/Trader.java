/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.models;

import UI.UIMenu;
import data.repo.CoinMarketDatabase;
import java.sql.DatabaseMetaData;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hasan
 */
public class Trader extends User implements IWallet {
   private String wallet_address = "SOME ID";
   private Map<String, Integer> wallet = new HashMap<>();
   private double fiat = 0; // Kullanıcı yükleme yapacağı zaman bura artacak, ama aslında fiatı yok yanlış yapıyoz 0 olmalı şimdi aynen benim hatam farkettim
    public Trader(String email, String wallet_address, Map<String, Integer> wallet, double fiat) {
        super(email);
        this.wallet_address = wallet_address;
        this.wallet=wallet;
        this.fiat=fiat;
    }
    public Trader(String email, String wallet_address){
        super(email);
        this.wallet_address = wallet_address;
    }
    
    @Override
    public String getWalletAddress(){
        return wallet_address;
    }
    @Override
    public void setFiat(double newFiat){
        this.fiat = newFiat;
    }
    @Override
    public double getFiat(){
        return fiat;
    }
    @Override
    public Map<String, Integer> getSpotWallet() { // lan ne oluyoır ammk
        return wallet;
    }
    @Override
    public void setWallet(Map<String, Integer> wallet){
        this.wallet = wallet;
    }

    @Override
    public boolean addCoinToWallet(String coin_name, int amount) {
        fiat-=CoinMarket.getCoinPrice(coin_name)*amount;
        if(!wallet.containsKey(coin_name)){
            UIMenu.transferCoinsBox.addItem(coin_name);
        } 
        
        if(wallet.get(coin_name)!=null){
            int newAmount = wallet.get(coin_name) + amount;
            wallet.replace(coin_name, wallet.get(coin_name) + amount); //yok senin ki daha iyi
            CoinMarketDatabase database = new CoinMarketDatabase();
            database.update(coin_name, newAmount, wallet_address, fiat);
        }else{
            wallet.put(coin_name,amount);
            System.out.println(wallet.get(coin_name));
            CoinMarketDatabase database = new CoinMarketDatabase();
            database.update(coin_name, amount, wallet_address, fiat);
        }
        
        // fiatta düşüyor o zaman yeni fiatı gönderecez database eanladım.
        return true;
    }

    @Override
    public boolean sellCoin(String coin_name,int amount) {
        
        fiat+=CoinMarket.getCoinPrice(coin_name)*amount;
        int newAmount=wallet.get(coin_name)-amount;
        CoinMarketDatabase coinMarketDatabase=new CoinMarketDatabase();
        coinMarketDatabase.update(coin_name, newAmount, wallet_address, fiat);
        if(newAmount==0){
            wallet.remove(coin_name);
            return false;
        }else{
            wallet.replace(coin_name, newAmount);
            return true;
        }

    }
    public boolean sendCoin(String coin_name,int amount,String receiverUserId) {
        int newAmount=wallet.get(coin_name)-amount;
        CoinMarketDatabase coinMarketDatabase=new CoinMarketDatabase();
        coinMarketDatabase.update(coin_name, newAmount, wallet_address, fiat);
        
        if(coinMarketDatabase.updateReceiverUser(receiverUserId, coin_name, amount)){
            if(newAmount==0){
            wallet.remove(coin_name);
            
        }   else{
            wallet.replace(coin_name, newAmount);
            
        }
            return true;
        }else{
            return false;
        }
        

    }
    
    
}
