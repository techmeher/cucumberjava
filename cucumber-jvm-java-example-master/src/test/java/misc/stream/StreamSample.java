package misc.stream;

import java.util.ArrayList;
import java.util.Optional;

public class StreamSample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("AADHYA");
        names.add("SUSHMITA");
        names.add("MEHER");
        names.add("JAIBABA");

        ArrayList<String> eligibility = new ArrayList<>();

        Optional<String> name = names.stream().filter(s -> s.startsWith("A")).findFirst();

        System.out.println("Adorable : " + name.toString());


    }
}
