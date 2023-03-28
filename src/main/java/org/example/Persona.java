package org.example;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor @Data
public class Persona {
    @Getter @Setter @NonNull
    private String nombre;
    private int edad;
    @Getter @Setter @NonNull
    private String dni;


}
