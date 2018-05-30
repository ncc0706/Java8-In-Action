package io.arukas.optional;

import javax.sound.midi.Soundbank;
import java.util.Optional;
import java.util.OptionalInt;

public class TestOptional2 {

    public static void main(String[] args) {

        Insurance insurance = new Insurance();
        insurance.setName("平安保险");

        Optional<Insurance> insurance1 = Optional.ofNullable(insurance);

        if (insurance1.isPresent()) {
            System.out.println("---------");
            insurance1.get();
            Optional<Insurance> insurance2 = insurance1.filter(insur -> insur.getName().equals("平安保险"));
            System.out.println("insurance2: " + insurance2.get().getName());
        }

        Optional<String> name = insurance1.map(Insurance::getName);
        System.out.println(name);
        System.out.println(name.get());

        //System.out.println(name.orElse("unknown."));


        System.out.println("=================================");
//        Optional<Insurance> insurance2 = Optional.ofNullable(null);
//        Optional<String> name2 = insurance2.map(Insurance::getName);
//        System.out.println(name2);
//        System.out.println(name2.get());

        OptionalInt optionalInt = OptionalInt.of(500);
        int asInt = optionalInt.getAsInt();
        System.out.println(asInt);
    }

}
