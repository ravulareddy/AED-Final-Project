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
import userInterface.transport.DriverWorkAreaJPanel;

/**
 *
 * @author tejageetla
 */
public class DriverRole extends Role{
    
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DriverWorkAreaJPanel(userProcessContainer, account, organization, enterprise.getOrganizationDirectory());
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
}
