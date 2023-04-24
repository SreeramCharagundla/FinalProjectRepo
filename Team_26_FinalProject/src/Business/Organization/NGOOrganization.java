/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.NGOCoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sreeram
 */
public class NGOOrganization extends Organization{

    public NGOOrganization() {
        super(Organization.NGOType.NGO.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOCoordinatorRole());
        return roles;
    }
     
}