/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anchitha
 */
public class Blood_Bank_Enterprise extends Enterprise {
    
    public Blood_Bank_Enterprise(String name){
        super(name,EnterpriseType.BloodBank);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
