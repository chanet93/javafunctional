package org.amigoscode.functioninterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumbValid("07000000012"));
        System.out.println(isPhoneNumbValid("09956521231"));
        System.out.println(isPhoneNumbValidPredicate.test("07000000012"));

        //combine Predicates using "and" all of them have to be true
        System.out.println(isPhoneNumbValidPredicate.and(containsNumber3).test("07000030012"));
        //combine Predicates using "or" means either one of them is true
        System.out.println(isPhoneNumbValidPredicate.or(containsNumber3).test("07000000012"));

        System.out.println(isPhoneNumbValidPredicateBi.test("07000000012", true));

    }
    //Normal function of java
    static boolean isPhoneNumbValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    //Functional Predicate takes un argument and return a boolean
    static Predicate<String> isPhoneNumbValidPredicate = phoneNumber ->
        phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    //Functional BiPredicate takes to arguments and return true or false

    static BiPredicate<String,Boolean> isPhoneNumbValidPredicateBi = (phoneNumber, showPhoneNumber) ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11 && showPhoneNumber;

}
