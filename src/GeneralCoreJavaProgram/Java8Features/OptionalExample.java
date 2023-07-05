package GeneralCoreJavaProgram.Java8Features;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = "John Doe";
        Optional<String> optionalName = Optional.ofNullable(name);
        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get());
        } else {
            System.out.println("Name is absent");
        }
    }
}
