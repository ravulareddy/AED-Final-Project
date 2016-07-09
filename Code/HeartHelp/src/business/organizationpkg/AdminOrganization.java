/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;


import business.rolepkg.AdminRole;
import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
     
}
