import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b, x, s, suma, resta, multi;
        double  div, raiz, elevado;

        do {

            System.out.println("Ingrese el numero de su eleccion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Elevar al cuadrado");
            System.out.println("6. Raiz Cuadrada");
            x = sc.nextInt();

            switch (x){
                case 1:
                    System.out.println("Ingrese dos numeros:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    suma = a+b;
                    System.out.println(suma);
                    break;
                case 2:
                    System.out.println("Ingrese dos numeros:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    resta = a-b;
                    System.out.println(resta);
                    break;
                case 3:
                    System.out.println("Ingrese dos numeros:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    multi =a*b;
                    System.out.println(multi);
                    break;
                case 4:
                    System.out.println("Ingrese dos numeros:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                        if (b == 0){
                            System.out.println("Elija otro numero diferente a 0");
                            b = sc.nextInt();
                        }
                    div = a/b;
                    System.out.println(div);
                    break;
                case 5:
                    System.out.println("Ingrese un numero:");
                    a = sc.nextInt();
                    elevado = Math.pow(a, 2);
                    System.out.println(elevado);
                    break;
                case 6:
                    System.out.println("Ingrese un numero:");
                    a = sc.nextInt();
                    raiz = Math.sqrt(a);
                    System.out.println(raiz);
                    break;
                default:
                    System.out.println("Numero invalido");
            }

            System.out.println("1. Regresar al menu");
            System.out.println("2. Salir");
            s = sc.nextInt();

        } while (s != 2);
        System.out.println("-----Programa finalizado-----");

    }
}
