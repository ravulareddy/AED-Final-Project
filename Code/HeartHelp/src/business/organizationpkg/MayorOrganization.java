/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;

import business.rolepkg.MayorRole;
import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class MayorOrganization extends Organization {
    
     public MayorOrganization()
    {
        super(Organization.Type.Mayor.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MayorRole());
        return roles;
    }
    
}
