/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.rolepkg;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author tejageetla
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Volunteer("Volunteer"),
        Supervisor("Supervisor"),
        HelpSeeker("Help Seeker"),
        Driver("Driver"),
        Mayor("Mayor"),
        HeartHelpManager("Heart Help Manager"),
        Doctor("Doctor"),
        Donor("Donor");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    
    
}
