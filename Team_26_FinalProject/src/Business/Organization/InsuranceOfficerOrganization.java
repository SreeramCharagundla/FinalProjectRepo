/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anchitha
 */
public class InsuranceOfficerOrganization extends Organization {
        public InsuranceOfficerOrganization() {
        super(Organization.InsuranceType.InsuranceOfficer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceOfficerRole());
        return roles;
    }
     
    
}
