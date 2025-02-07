package com.aber.enums;

public enum MultiplierUSER {
    UNO(0.78),
    DUE(1.23),
    TRE(1.45),
    QUATTRO(0.89),
    CINQUE(1.67),
    SEI(1.12),
    SETTE(0.95),
    OTTO(1.34),
    NOVE(2),
    DIECI(0.72),
    UNDICI(1.49),
    DODICI(1.18),
    TREDICI(0.81),
    QUATTORDICI(1.01),
    QUINDICI(1.05);

    private final double valore;

    // Costruttore dell'enum
    MultiplierUSER(double valore) {
        this.valore = valore;
    }

    public double getValore() {
        return valore;
    }
}

