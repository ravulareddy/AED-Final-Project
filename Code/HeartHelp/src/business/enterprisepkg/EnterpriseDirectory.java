/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprisepkg;

import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type)
    {
      Enterprise enterprise = null;
      if(type ==Enterprise.EnterpriseType.HeartHelp)
      {
       enterprise = new HeartHelpEnterprise(name);
       enterpriseList.add(enterprise);     
      }
      else if (type == Enterprise.EnterpriseType.Government){
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        }
       else if (type == Enterprise.EnterpriseType.NonProfit){
            enterprise = new NonProfitEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else  if(type ==Enterprise.EnterpriseType.School)
        {
         enterprise = new SchoolEnterprise(name);
         enterpriseList.add(enterprise);     
        }
      else  if(type ==Enterprise.EnterpriseType.Hospital)
        {
         enterprise = new HospitalEnterprise(name);
         enterpriseList.add(enterprise);     
        }

      return enterprise;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void deleteEnterprise(Enterprise enterprise)
    {
        enterpriseList.remove(enterprise);
    }
}
