/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;

import business.rolepkg.DriverRole;
import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class TransportOrganization extends Organization{
    
        public TransportOrganization()
    {
        super(Organization.Type.Transport.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DriverRole());
        return roles;
    }
}
