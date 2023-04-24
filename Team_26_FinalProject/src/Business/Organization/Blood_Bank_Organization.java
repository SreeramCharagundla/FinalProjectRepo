/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.DIG.DiagnosisType;
import Business.DIG.PersonBloodType;
import Business.Role.DoctorRole;
import Business.Role.Blood_Bank_CoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author pravallika
 */
public class Blood_Bank_Organization extends Organization{
        DiagnosisType inventory;
    
    public Blood_Bank_Organization() {
        super(Organization.BloodBankType.BloodBank.getValue());
        inventory = new DiagnosisType();
        PersonBloodType h = new PersonBloodType();
        h.updateDIGlist("B");
        inventory.DIGCountAdd(h,6);
        h = new PersonBloodType();
        h.updateDIGlist("A");
        inventory.DIGCountAdd(h,5);
        h = new PersonBloodType();
        h.updateDIGlist("AB");
        inventory.DIGCountAdd(h,7);
         h = new PersonBloodType();
        h.updateDIGlist("O");
        inventory.DIGCountAdd(h,8);
    }

    public DiagnosisType getInventory() {
        return inventory;
    }
    
    public HashMap<String, Integer> getInventoryData() {
        return this.getInventory().getDigComboCounts();
    }

    public void setInventory(DiagnosisType inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Blood_Bank_CoordinatorRole());
        return roles;
    }
     
    
}
