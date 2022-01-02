/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data.models;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;

/**
 *
 * @author hasan
 */
public interface ApiFunctions {
    Map<String,Coin> fetchApiValues();
   String makeApiCall(String uri, List<NameValuePair> parameters) throws URISyntaxException, IOException;
}
