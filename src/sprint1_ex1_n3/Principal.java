package sprint1_ex1_n3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static ArrayList<Redactor> redactors = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sortir = false;
        while (!sortir) {
            int opcio = menu();
            switch (opcio) {
                case 1:
                    introduirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introduirNoticia();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticiesPerRedactor();
                    break;
                case 6:
                    calcularPuntuacioNoticia();
                    break;
                case 7:
                    calcularPreuNoticia();
                    break;
                case 0:
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        }
    }

    public static int menu() {
    	System.out.println("Elegeix una opcio:");
    	
        System.out.println("1.- Introduir redactor.");
        System.out.println("2.- Eliminar redactor.");
        System.out.println("3.- Introduir notícia a un redactor.");
        System.out.println("4.- Eliminar notícia.");
        System.out.println("5.- Mostrar totes les notícies per redactor.");
        System.out.println("6.- Calcular puntuació de la notícia.");
        System.out.println("7.- Calcular preu-notícia.");
        System.out.println("0.- Sortir.");
        return scanner.nextInt();
    }

    public static void introduirRedactor() {
        System.out.println("Nom del redactor:");
        String nom = scanner.next();
        System.out.println("DNI del redactor:");
        String dni = scanner.next();
        redactors.add(new Redactor(nom, dni));
        System.out.println("Redactor afegit correctament.");
    }

    public static void eliminarRedactor() {
        System.out.println("DNI del redactor a eliminar:");
        String dni = scanner.next();
        redactors.removeIf(redactor -> redactor.getDni().equals(dni));
        System.out.println("Redactor eliminat correctament.");
    }

    public static void introduirNoticia() {
        System.out.println("DNI del redactor:");
        String dni = scanner.next();
        Redactor redactor = cercarRedactor(dni);
        if (redactor != null) {
            System.out.println("Tipus de notícia (futbol, basquet, tenis, f1, motociclisme):");
            String tipus = scanner.next().toLowerCase();
            System.out.println("Titular de la notícia:");
            String titular = scanner.next();
            Noticia noticia = null;
            switch (tipus) {
                case "futbol":
                    System.out.println("Competicio:");
                    String competicio = scanner.next();
                    System.out.println("Club:");
                    String club = scanner.next();
                    System.out.println("Jugador:");
                    String jugador = scanner.next();
                    noticia = new NoticiaFutbol(titular, competicio, club, jugador);
                    break;
                case "basquet":
                    System.out.println("Competicio:");
                    String competicioB = scanner.next();
                    System.out.println("Club:");
                    String clubB = scanner.next();
                    noticia = new NoticiaBasquet(titular, competicioB, clubB);
                    break;
                case "tenis":
                    System.out.println("Competicio:");
                    String competicioT = scanner.next();
                    System.out.println("Tenistes:");
                    String tenistes = scanner.next();
                    noticia = new NoticiaTenis(titular, competicioT, tenistes);
                    break;
                case "f1":
                    System.out.println("Escuderia:");
                    String escuderia = scanner.next();
                    noticia = new NoticiaF1(titular, escuderia);
                    break;
                case "motociclisme":
                    System.out.println("Equip:");
                    String equip = scanner.next();
                    noticia = new NoticiaMotociclisme(titular, equip);
                    break;
                default:
                    System.out.println("Tipus de notícia no vàlid.");
            }
            if (noticia != null) {
                redactor.afegirNoticia(noticia);
                System.out.println("Notícia afegida correctament.");
            }
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    public static void eliminarNoticia() {
        System.out.println("DNI del redactor:");
        String dni = scanner.next();
        Redactor redactor = cercarRedactor(dni);
        if (redactor != null) {
            System.out.println("Titular de la notícia a eliminar:");
            String titular = scanner.next();
            redactor.eliminarNoticia(titular);
            System.out.println("Notícia eliminada correctament.");
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    public static void mostrarNoticiesPerRedactor() {
        System.out.println("DNI del redactor:");
        String dni = scanner.next();
        Redactor redactor = cercarRedactor(dni);
        if (redactor != null) {
            for (Noticia noticia : redactor.getNoticies()) {
                System.out.println(noticia);
            }
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    public static void calcularPuntuacioNoticia() {
        System.out.println("DNI del redactor:");
        String dni = scanner.next();
        Redactor redactor = cercarRedactor(dni);
        if (redactor != null) {
            System.out.println("Titular de la notícia:");
            String titular = scanner.next();
            for (Noticia noticia : redactor.getNoticies()) {
                if (noticia.getTitular().equalsIgnoreCase(titular)) {
                    System.out.println("Puntuació de la notícia: " + noticia.getPuntuacio());
                    return;
                }
            }
            System.out.println("Notícia no trobada.");
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    public static void calcularPreuNoticia() {
        System.out.println("DNI del redactor:");
        String dni = scanner.next();
        Redactor redactor = cercarRedactor(dni);
        if (redactor != null) {
            System.out.println("Titular de la notícia:");
            String titular = scanner.next();
            for (Noticia noticia : redactor.getNoticies()) {
                if (noticia.getTitular().equalsIgnoreCase(titular)) {
                    System.out.println("Preu de la notícia: " + noticia.getPreu());
                    return;
                }
            }
            System.out.println("Notícia no trobada.");
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    private static Redactor cercarRedactor(String dni) {
        for (Redactor redactor : redactors) {
            if (redactor.getDni().equalsIgnoreCase(dni)) {
                return redactor;
            }
        }
        return null;
    }
}
