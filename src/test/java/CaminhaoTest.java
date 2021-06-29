/*
GRUPO:
        MATHEUS PEDRO ZANCANELLA BARBOZA 202035005
        DANIEL FAGUNDES PORTES FERNANDES 201965574C
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaminhaoTest
{
    @Test
    void calcularIPVA ()
    {
        Caminhao caminhao = new Caminhao();
        caminhao.setAno(1000);
        assertEquals(2000,caminhao.calcularIPVA());
    }
}