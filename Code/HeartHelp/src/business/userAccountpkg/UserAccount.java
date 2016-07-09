/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccountpkg;

import business.networkpkg.Network;
import business.personpkg.Person;
import business.rolepkg.Role;
import business.workQueuepkg.WorkQueue;


/**
 *
 * @author tejageetla
 */
public class UserAccount {
    
    private String userName;
    private String password;
    private Person person; 
    private Role role;
    private WorkQueue workQueue;
    private boolean enabled = true;
    private Network network;
   
    
    public UserAccount() {
        workQueue = new WorkQueue();
    }
  
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return userName; //To change body of generated methods, choose Tools | Templates.
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Network getNetwork() {
        return network;
    }

    
    
    
}
