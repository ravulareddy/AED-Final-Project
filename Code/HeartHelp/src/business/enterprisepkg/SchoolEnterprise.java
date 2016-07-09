/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprisepkg;

import business.enterprisepkg.Enterprise.EnterpriseType;
import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class SchoolEnterprise extends Enterprise{
    
     public SchoolEnterprise(String name) {
        super(name, EnterpriseType.School);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
