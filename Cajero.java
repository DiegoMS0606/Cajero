package cajero;

import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String n;
        int saldo_actual;
        int p, pass = 12345, c = 0;
        int opc = 0, s, r;
        int saldo_inicial = 10000;

        System.out.println("Buenos días, bienvenido a su cajero virtual");
        System.out.println("¿Cuál es su nombre?");
        n = entrada.nextLine();

        do {
            System.out.println("----------------------------------------");
            System.out.println("\nEscriba su contraseña");
            p = entrada.nextInt();
            if (p == pass) {
                System.out.println("----------------------------------------");
                System.out.print(n);
                System.out.print(" ACCESO PERMITIDO,");
                System.out.println("  Bienvenido");
                System.out.println("----------------------------------------");
                c = 3;
            } else {
                System.out.println("----------------------------------------");
                System.out.print(n);
                System.out.println(" Contraseña INCORRECTA");
                System.out.println("----------------------------------------");
                c = c + 1;
                if (c == 3) {
                    System.out.println("----------------------------------------");
                    System.out.println("ACCESO RESTRINGIDO");
                    System.out.println("----------------------------------------");
                }
            }
        } while (c != 3);

        if (p == pass) {
            do {
                System.out.println("----------------------------------------");
                System.out.println("Menú");
                System.out.println("    1.- Agregar Saldo");
                System.out.println("    2.- Retiro Saldo");
                System.out.println("    3.- Consulta Saldo");
                System.out.println("    4.- Salir");
                System.out.println("¿Qué acción desea ejecutar?");
                System.out.println("----------------------------------------");
                opc = entrada.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("----------------------------------------");
                        System.out.println("Agregar Saldo");
                        System.out.println("----------------------------------------");
                        System.out.println("¿Cuál es el saldo que quiere agregar?");
                        System.out.print("$");
                        s = entrada.nextInt();
                        saldo_actual = saldo_inicial + s;
                        System.out.println(n+ " Usted ha agregado: $"+s);
                        System.out.println("El saldo ha sido agregado con exito");
                        System.out.println("----------------------------------------");
                        saldo_inicial = saldo_actual;
                        break;
                    case 2:
                        System.out.println("----------------------------------------");
                        System.out.println("Retirar saldo");
                        System.out.println("----------------------------------------");
                        System.out.println("¿Cuánto saldo desea retirar?");
                        System.out.print("$");
                        r = entrada.nextInt();
                        if (r >= 3000) {
                            System.out.println("NO TIENE PERMITIDO RETIRAR ESA CANTIDAD DE EFECTIVO");
                            System.out.println("INTENTELO DE NUEVO");
                            System.out.println("----------------------------------------");

                        } else {

                            saldo_actual = saldo_inicial - r;
                            System.out.println(n+ " Usted ha retirado: $"+r);
                            System.out.println("El saldo ha sido retirado con exito");
                            System.out.println("----------------------------------------");
                            saldo_inicial = saldo_actual;
                        }
                        break;
                    case 3:
                        System.out.println("----------------------------------------");
                        System.out.println("Consultar saldo");
                        System.out.println(n+" Su saldo es de: " + saldo_inicial);
                        System.out.println("----------------------------------------");
                        break;
                    case 4:
                        System.out.println("Gracias por usar este cajero Automatico");
                        System.out.println("¡TENGA UN EXCELENTE DÍA!");
                        opc = 4;
                        break;
                }
            } while (opc != 4);
        }

    }

}
