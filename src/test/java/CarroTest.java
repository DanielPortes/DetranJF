/*
GRUPO:
        MATHEUS PEDRO ZANCANELLA BARBOZA 202035005
        DANIEL FAGUNDES PORTES FERNANDES 201965574C
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest
{
    @Test
    void calcularIPVA ()
    {
        Carro carro = new Carro();
        carro.setAno(1000);
        assertEquals(1000,carro.calcularIPVA());
    }
}