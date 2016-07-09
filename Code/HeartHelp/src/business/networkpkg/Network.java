/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.networkpkg;

import business.enterprisepkg.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class Network {

    private String country;

    private String state;

    private String city;
    
    private String name;

    private EnterpriseDirectory enterpriseDirectory;
    

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return this.city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public ArrayList<Integer> getZipCodesInRange(String city)
    {
        ArrayList<Integer> zipCodeList = new ArrayList<>();
        zipCodeList.add(01245);
        zipCodeList.add(02135);
        
        return zipCodeList;
    }
}
