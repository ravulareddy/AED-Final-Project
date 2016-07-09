/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprisepkg;

import business.organizationpkg.Organization;
import business.organizationpkg.OrganizationDirectory;

/**
 *
 * @author tejageetla
 */
public abstract class Enterprise extends Organization{
    
    
    private String enterpriseId;
    private static int count = 1;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    
    public Enterprise(String enterpriseName, EnterpriseType enterpriseType)
    {
        super(enterpriseName);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
        StringBuffer sb = new StringBuffer();
        sb.append("ENT");
        sb.append(count);
        enterpriseId = sb.toString();
        count++;
    }
    
    public enum EnterpriseType{
        
       School("School"),
       HeartHelp("HeartHelp"),
       NonProfit("NonProfit"),
       Government("Government"),
       Hospital("Hospital");
    
       
       private String value;
       
       private EnterpriseType(String value)
       {
         this.value = value;  
       }

        public String getValue() {
            return value;
        }
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
}
