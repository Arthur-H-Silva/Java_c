import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  public class City {
    private String nome;
    private int identificador;
    private int qtdeVeiculos;
    private int numAcidentes;

    public City nome, int identificador, int qtdeVeiculos, int numAcidentes) {
        this.nome = nome;
        this.identificador = identificador;
        this.qtdeVeiculos = qtdeVeiculos;
        this.numAcidentes = numAcidentes;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getQuantidadeVeiculos() {
        return qtdeVeiculos;
    }

    public int getNumeroAcidentes() {
        return numAcidentes;
    }

    public double MediaAcidentes() {
        return (double) numAcidentes / qtdeVeiculos;
    }
}
