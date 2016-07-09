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
import userInterface.supervisor.SupervisorWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author tejageetla
 */
public class SupervisorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SupervisorWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
