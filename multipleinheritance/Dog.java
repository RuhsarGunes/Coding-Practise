/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleınheritance;

/**
 *
 * @author Gunes
 */
public class Dog implements Poodle, Golden{

    @Override
    public void poodleSpeak() {
        System.out.println("Poodle Bark");
    }

    @Override
    public void poodleWalk() {
        System.out.println("Poodle Walk");    
    }

    @Override
    public void goldenSpeak() {
        System.out.println("Golden Bark");
    }

    @Override
    public void goldenWalk() {
        System.out.println("Golden Walk");
    }   
}
