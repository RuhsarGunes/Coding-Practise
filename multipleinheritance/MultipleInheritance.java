/*
 How to simulate multiple inheritance in JAVA?
 */
package multipleınheritance;

public class MultipleInheritance {
    
    public static void main(String[] args) {
        Poodle myPoodle = new Dog();
        Golden myGolden = new Dog();
        
        myPoodle.poodleSpeak();
        myPoodle.poodleWalk();
        
        myGolden.goldenWalk();
        myGolden.goldenSpeak();
    }
    
}
