package java8;

import java.util.Optional;

public class OptionalTest {
    public static void testOptional(String s){
        Optional<String> stringOptional = Optional.ofNullable(s);
        if(stringOptional.isPresent()){
            System.out.println("Value is:"+stringOptional.get());
        }else {
            System.out.println("Value is:"+stringOptional);
        }
    }

    public static void main(String[] args) {
        testOptional("Hi");
        testOptional(null);
        testOptional("");
    }

}
