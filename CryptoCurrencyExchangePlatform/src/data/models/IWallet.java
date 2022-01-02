package data.models;

import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFil
eSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hasan
 */
interface IWallet {
    Map<String, Integer> getSpotWallet();
    boolean addCoinToWallet(String coin_name, int amount);
    boolean sellCoin(String coin_name, int amount);
    double getFiat();
    String getWalletAddress();
  
    }
