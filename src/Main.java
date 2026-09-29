import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Ticket ticket = new Ticket();
        HalfPriceTicket halfTicket = new HalfPriceTicket();

        ticket.setPrice(36);
        ticket.setMovieTitle("De volta para o futuro");
        ticket.setSoundTrack("Dublado");

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("=================================");
            System.out.println("Filme: " + ticket.getMovieTitle());
            System.out.println("Audio: " + ticket.getSoundTrack());
            System.out.println("Preço Inteira: R$ " + ticket.getPrice());
            System.out.println("=================================");

            System.out.println("Digite a opção do ingresso: ");
            System.out.println("1 - Inteira");
            System.out.println("2 - Meia Entrada");
            System.out.println("3 - Familia ");
            System.out.println("0 - Sair");

            int option = input.nextInt();

            switch (option) {
                case 1 -> System.out.println("Preço: R$ " + new HalfPriceTicket().getPrice());
                case 2 -> System.out.println("Meia Entrada: R$ " + halfTicket.getPrice());
            }

        }while (true);

    }
}
