package com.company.package4.debugowanie_static_enum.statics.static_inheritance;

import static com.company.package4.debugowanie_static_enum.statics.static_inheritance.B.*;

public class ImportStaticExample {
    public static void main(String[] args) {

        System.out.println(CONST); //Jeśli ta sama nazwa (CONST = dla A i B) to się przykryją (B przykryło A)
                                   //jesli różne nazwy  (A_CONST = dla A  &  B_CONST = dla B) to można wywołać obie

        System.out.println(CONST_1);
        System.out.println(CONST_2);
        System.out.println(CONST_3);
        System.out.println(CONST_4);

    }
}
