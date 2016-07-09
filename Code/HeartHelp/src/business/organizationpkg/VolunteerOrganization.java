/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;

import business.rolepkg.Role;
import business.rolepkg.VolunteerRole;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class VolunteerOrganization extends Organization {
    
    public VolunteerOrganization()
    {
        super(Organization.Type.Volunteer.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VolunteerRole());
        return roles;
    }
}
