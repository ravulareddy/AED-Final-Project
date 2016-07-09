/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccountpkg;

import business.personpkg.Person;
import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory()
    {
      userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount addUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        boolean flag = true;
        for (UserAccount ua : userAccountList){
            if (ua.getUserName().equals(username))
            {
              flag =  false;
            }
            else
            {
            flag =  true;
            }
        }
        return flag;
    }
    
    public void deleteUserAccount(UserAccount userAccount)
    {
        userAccountList.remove(userAccount);
    }
    
}
