package com.lpoo.atividade03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsaFormasTest {
    
    public UsaFormasTest() {
    }

    @Test
    public void testCircunferenciaArea() {
        Circunferencia circ = new Circunferencia(3);
        assertEquals(28.2743, circ.area(), 0.0001);
    }

    @Test
    public void testCircunferenciaRaioNegativo() {
        assertThrows(RuntimeException.class, () -> {
            new Circunferencia(-3);
        });
    }

    @Test
    public void testRetanguloArea() {
        Retangulo ret = new Retangulo(4, 5);
        assertEquals(20, ret.area());
    }

    @Test
    public void testRetanguloPerimetro() {
        Retangulo ret = new Retangulo(4, 5);
        assertEquals(18, ret.perimetro());
    }

    @Test
    public void testRetanguloLadosNegativos() {
        assertThrows(RuntimeException.class, () -> {
            new Retangulo(-4, 5);
        });
    }

    @Test
    public void testTrianguloArea() {
        Triangulo tri = new Triangulo(4, 5);
        assertEquals(10, tri.area());
    }

    @Test
    public void testTrianguloBaseAlturaNegativa() {
        assertThrows(RuntimeException.class, () -> {
            new Triangulo(-4, 5);
        });
    }
    
}
