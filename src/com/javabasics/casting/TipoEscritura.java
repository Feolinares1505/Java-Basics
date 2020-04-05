package com.javabasics.casting;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNA("Escritura digital");

    private final String description;

    TipoEscritura(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
