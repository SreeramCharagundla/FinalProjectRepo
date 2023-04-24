/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Thalassemia_Centre_Coordinator_Role;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anchitha
 */
public class Thalassemia_Centre_Organization extends Organization {
     public Thalassemia_Centre_Organization() {
        super(Organization.ThalassemiaCentreType.ThalassemiaCentre.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Thalassemia_Centre_Coordinator_Role());
        return roles;
    }
    
}
