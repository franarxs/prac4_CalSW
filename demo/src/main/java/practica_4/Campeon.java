package practica_4;

public class Campeon {
    String nombre;
    String rol;
    int puntosVida;
    int danoAtaque;
    int defensa;

    public Campeon(String nombre, String rol, int puntosVida, int danoAtaque, int defensa) {
        this.nombre = nombre;
        this.rol = rol;
        this.puntosVida = puntosVida;
        this.danoAtaque = danoAtaque;
        this.defensa = defensa;
    }

    public void atacar(Campeon otro) {
        otro.recibirDano(this.danoAtaque);
    }
    

    public void recibirDano(int dano) {
        int danoEfectivo = Math.max(dano - this.defensa, 0);
        this.puntosVida = Math.max(this.puntosVida - danoEfectivo, 0);
    }

    public boolean estaVivo() {
        return this.puntosVida > 0;
    }
}