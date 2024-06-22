import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCity {

    public static void main(String[] args) {
        List<City> cidade = new ArrayList<>();
        cidade.add(new City("Maringá", 4115200, 337192, 5927));
        cidade.add(new City("Londrina", 4113700, 440048, 2565));
        cidade.add(new City("Cascavel", 4104808, 282277, 1326));
        cidade.add(new City("Ponta Grossa", 4119905, 247451, 1941));
        cidade.add(new City("Foz do Iguaçu", 4108304, 218094, 2369));

        City cidadeMaiorAcidentes = cidade.get(0);
        City cidadeMenorAcidentes = cidade.get(0);

        double somaAcidentes = 0;
        double somaVeiculos = 0;

        for (City cidade : cidade) {
            if (cidade.getNumeroAcidentes() > cidadeMaiorAcidentes.getNumeroAcidentes()) {
                cidadeMaiorAcidentes = cidade;
            }
            if (cidade.getNumeroAcidentes() < cidadeMenorAcidentes.getNumeroAcidentes()) {
                cidadeMenorAcidentes = cidade;
            }
            somaAcidentes += cidade.getNumeroAcidentes();
            somaVeiculos += cidade.getQuantidadeVeiculos();
        }

        System.out.println("Cidade com o maior número de acidentes: " + cidadeMaiorAcidentes.getNome());
        System.out.println("Cidade com o menor número de acidentes: " + cidadeMenorAcidentes.getNome());

        for (City cidade : cidade) {
            System.out.printf("Média anual de acidentes em %s: %.2f%%\n", cidade.getNome(), cidade.calcularMediaAcidentes() * 100);
        }

        double mediaTotalAcidentes = somaAcidentes / somaVeiculos;
        System.out.printf("Média total de acidentes das cidades pesquisadas: %.2f%%\n", mediaTotalAcidentes * 100);
    }
              }
