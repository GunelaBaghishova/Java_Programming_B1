package my_util;

import day33_b_ecapsulation.access_modifiers.AccessModifiers;

public class AccessOutsidePackage {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        //System.out.println(obj.b);  // since the access modifier for instance b is default, it is accessible only in the same package.
        // System.out.println(obj.c);  // Since it is a different class and private is not accessible outside of the class.



        // System.out.println(obj.z); // Since it is a different class and private is not accessible outside of the class.
        // System.out.println(obj.y); // since the access modifier for startic variable y is default, it is accessible only in the same package.


    }


}
