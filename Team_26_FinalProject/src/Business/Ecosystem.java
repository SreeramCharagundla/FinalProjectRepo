/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author balin
 */
public class Ecosystem {
    private static Ecosystem ecosystem;
    static Ecosystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new Ecosystem();
           // return ecosystem;
        }
        return ecosystem;
    }
}
