/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.common.NeedHelp;
import business.networkpkg.Network;
import business.organizationpkg.Organization;
import business.rolepkg.Role;
import business.rolepkg.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class EcoSystem extends Organization{
 
   private ArrayList<Network> networkList;
   private static EcoSystem ecoSystem;
   private ArrayList<NeedHelp> helpList;
    
   public EcoSystem()
   {
       super(null);
       networkList = new ArrayList<>();
       helpList = new ArrayList<>();
      
   }
   
   public static EcoSystem getInstance()
   {
    if(ecoSystem == null)
    {
      ecoSystem = new EcoSystem();
    }
    return ecoSystem;
   }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
   
    public Network addNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
      if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        return false;
      }
      return true;
    }
   
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
   
    public NeedHelp addNeedHelp()
    {
        NeedHelp needHelp = new NeedHelp();
        helpList.add(needHelp);
        return needHelp;
    }
    
    public void deleteHelp(NeedHelp needHelp)
    {
        helpList.remove(needHelp);
    }

    public ArrayList<NeedHelp> getHelpList() {
        return helpList;
    }
    
    
    
}
