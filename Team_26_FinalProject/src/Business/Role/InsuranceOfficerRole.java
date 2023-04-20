/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.InsuranceOfficerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import UI.InsuranceConsultantRole.InsuranceOfficerWorkAreaJPanel;

/**
 *
 * @author anchitha
 */
public class InsuranceOfficerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new InsuranceOfficerWorkAreaJPanel(account, (InsuranceOfficerOrganization) organization, enterprise, business, network);
    }
}
