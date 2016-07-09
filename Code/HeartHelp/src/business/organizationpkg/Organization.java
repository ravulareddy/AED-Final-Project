/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;

import business.personpkg.PersonDirectory;
import business.rolepkg.Role;
import business.userAccountpkg.UserAccountDirectory;
import business.workQueuepkg.WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author tejageetla
 */
public abstract class Organization {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private WorkQueue workQueue;
    private int orgId;
    private static int counter = 000;

    public Organization(String name) {
    this.name = name;
    userAccountDirectory = new UserAccountDirectory();
    personDirectory = new PersonDirectory();
    workQueue = new WorkQueue();
    counter++;
    orgId = counter;
    }
    
    public enum Type
    {
     Admin("Admin"),
     Volunteer("Volunteer Organization"),
     HelpSeeker("HelpSeeker Organization"),
     Supervisor("Supervisor Organization"),
     Donor("Donor Organization"),
     Transport("Transport Organization"),
     Mayor("Mayor Organization"),
     Doctor("Doctor Organization");
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }

        public String getValue() {
            return value;
        }
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getName() {
        return name;
    }
    
     public abstract ArrayList<Role> getSupportedRole();

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
}
