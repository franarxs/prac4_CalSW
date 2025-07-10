package practica_4;

import org.junit.Test;
import static org.junit.Assert.*;

public class CampeonTest {

    @Test

    public void test_inic_campeones() {
        Campeon talon = new Campeon("Talon", "Asesino", 120, 35, 5, null);
        Campeon jax = new Campeon("Jax", "Bruiser", 140, 29, 9, null);

        assertEquals("Asesino", talon.rol);
        assertEquals("Talon", talon.nombre);
        assertEquals(35, talon.danoAtaque);
        assertEquals(29, jax.danoAtaque);
        assertEquals("Bruiser", jax.rol);
        assertEquals(140, jax.puntosVida);
        assertEquals(9, jax.defensa);

    }

    @Test

    public void test_atacar() {
        Campeon talon = new Campeon("Talon", "Asesino", 120, 35, 5, null);
        Campeon jax = new Campeon("Jax", "Bruiser", 140, 29, 9, null);

        talon.atacar(jax); 
        assertEquals(140-(35-9 ), jax.puntosVida);
        jax.atacar(talon); 
        assertEquals(120-(29-5), talon.puntosVida);

    }

    @Test

    public void test_recibir_dano() {
        Campeon talon = new Campeon("Talon", "Asesino", 120, 35, 5, null);

        talon.recibirDano(50); 
        assertEquals(75, talon.puntosVida);

    }

    @Test

    public void test_esta_vivo() {
        Campeon jax = new Campeon("Jax", "Bruiser", 140, 29, 9, null);
        Campeon talon = new Campeon("Talon", "Asesino", 120, 35, 5, null);

        jax.recibirDano(200); 
        assertFalse(jax.estaVivo());

        talon.recibirDano(30); 
        assertTrue(talon.estaVivo());
    }
  
}