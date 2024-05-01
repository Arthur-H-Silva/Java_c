import java.util.Scanner;

public class AtvCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precoCarro, valFinal = 0,  valParc = 0;
    int qtdeParc;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro:");
		precoCarro = sc.nextDouble();

    System.out.println("Escolha uma quantidade de parcelas entre as opções: 6, 12, 18, 24, 30, 36, 42, 48, 54, 60 (Digite 0 caso a compra seja feita à vista)");
    qtdeParc = sc.nextInt();

        switch(qtdeParc){
      case 0:
        valFinal = precoCarro * 0.80;
            break;
          case 6:
            valFinal = precoCarro * 1.03;
            valParc = valFinal/qtdeParc;
            break;
          case 12:
            valFinal = precoCarro * 1.06;
            valParc = valFinal/qtdeParc;
            break;
          case 18:
            valFinal = precoCarro * 1.09;
            valParc = valFinal/qtdeParc;
            break;
          case 24:
            valFinal = precoCarro * 1.12;
            valParc = valFinal/qtdeParc;
            break;
          case 30:
            valFinal = precoCarro * 1.15;
            valParc = valFinal/qtdeParc;
            break;
          case 36:
            valFinal = precoCarro * 1.18;
            valParc = valFinal/qtdeParc;
            break;
          case 42:
             valFinal = precoCarro * 1.21;
             valParc = valFinal/qtdeParc;
            break;
          case 48:
             valFinal = precoCarro * 1.24;
             valParc = valFinal/qtdeParc;
            break;
          case 54:
             valFinal = precoCarro * 1.27;
             valParc = valFinal/qtdeParc;
            break;
          case 60:
             valFinal = precoCarro * 1.30;
             valParc = valFinal/qtdeParc;
            break;
          default:
            System.out.println("Opção inválida, insira um valor dentre os citados.");
            return;
    }

		
		System.out.println("_____________________________");
		System.out.println("Tabela de formas de pagamento");
		System.out.println("_______________________________");
		System.out.println("À Vista: R$ " + valFinal);
		System.out.println("_______________________________");
		System.out.println("Parcelado: ");
		System.out.println("6x:  R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("12x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("18x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("24x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("30x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("36x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("42x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("48x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("54x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("60x: R$ " + valParc + " com preço final de R$ " + valFinal);
		System.out.println("_______________________________");

    sc.close();

	}
}
