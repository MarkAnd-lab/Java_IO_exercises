package se.lexicon.mark.main2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MainRegister {
    public static void main(String[] args) {
        List<CarRegister> carRegisterList = Arrays.asList(new CarRegister("ABC123", "Volvo", "V50", LocalDate.parse("2010-03-25"), "Marek Kowalski"),
                new CarRegister("DEF456", "BMW", "530", LocalDate.parse("2007-10-13"), "Carolina Kowalski"));

    }

    List<OwnerRegister> ownerRegisterList = Arrays.asList(new OwnerRegister("Marek Kowalski", LocalDate.parse("1974-03-23")),
            new OwnerRegister("Carolina Kowalski", LocalDate.parse("2008-06-19")));

}
