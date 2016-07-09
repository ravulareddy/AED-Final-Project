/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizationpkg;

import business.organizationpkg.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
      organizationList = new ArrayList<>();
    }
    
    public Organization addOrganization(Type type)
    {
       Organization organization = null;
        if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HelpSeeker.getValue())){
            organization = new HelpSeekerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new SupervisorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.Mayor.getValue())){
            organization = new MayorOrganization();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void deleteOrganization(Organization organization)
    {
      organizationList.remove(organization);
    }
    
}
