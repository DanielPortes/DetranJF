/*
GRUPO:
        MATHEUS PEDRO ZANCANELLA BARBOZA 202035005
        DANIEL FAGUNDES PORTES FERNANDES 201965574C
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotocicletaTest
{
    @Test
    void calcularIPVA ()
    {
        Motocicleta motocicleta = new Motocicleta();
        motocicleta.setAno(1000);
        assertEquals(500,motocicleta.calcularIPVA());
    }
}