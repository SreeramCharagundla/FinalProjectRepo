/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SystemCoordinatorRole;
import java.util.ArrayList;

/**
 *
 * @author sreeram
 */
public class SystemCoordinatorOrganization extends Organization {
     public SystemCoordinatorOrganization() {
        super(Organization.Type.SystemCoordinator.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemCoordinatorRole());
        return roles;
    }
    
}
