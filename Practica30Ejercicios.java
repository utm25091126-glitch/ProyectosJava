import java.util.Scanner;

public class Practica30Ejercicios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Práctica: Jerarquía de Operadores (30 Ejercicios) ---");

        // Bloque 1: Operaciones Aritméticas Básicas
        System.out.println("\n--- Ejercicio 1: Promedio Ponderado ---");
        {
            System.out.print("Ingrese la primera nota (20%): "); double n1 = teclado.nextDouble();
            System.out.print("Ingrese la segunda nota (30%): "); double n2 = teclado.nextDouble();
            System.out.print("Ingrese la tercera nota (50%): "); double n3 = teclado.nextDouble();
            double promedio = (n1 * 0.20) + (n2 * 0.30) + (n3 * 0.50);
            System.out.println("Promedio ponderado: " + promedio);
        }

        System.out.println("\n--- Ejercicio 2: Conversión Térmica Compleja ---");
        {
            System.out.print("Ingrese temperatura en Celsius: "); double c = teclado.nextDouble();
            double fahrenheit = (c * (9.0 / 5.0)) + 32.0;
            System.out.println("Grados Fahrenheit: " + fahrenheit);
        }

        System.out.println("\n--- Ejercicio 3: Expresión Algebraica Cuadrática ---");
        {
            System.out.print("Ingrese x: "); double x = teclado.nextDouble();
            System.out.print("Ingrese y: "); double y = teclado.nextDouble();
            double resultado = ((x * x) + (2 * x * y) + (y * y)) / (x + y);
            System.out.println("Resultado: " + resultado);
        }

        System.out.println("\n--- Ejercicio 4: Área de un Trapecio ---");
        {
            System.out.print("Base Mayor: "); double bMayor = teclado.nextDouble();
            System.out.print("Base Menor: "); double bMenor = teclado.nextDouble();
            System.out.print("Altura: "); double h = teclado.nextDouble();
            double area = ((bMayor + bMenor) * h) / 2.0;
            System.out.println("Área: " + area);
        }

        System.out.println("\n--- Ejercicio 5: Cálculo de Energía Cinética ---");
        {
            System.out.print("Masa (m): "); double m = teclado.nextDouble();
            System.out.print("Velocidad (v): "); double v = teclado.nextDouble();
            double energia = 0.5 * m * (v * v);
            System.out.println("Energía Cinética: " + energia);
        }

        System.out.println("\n--- Ejercicio 6: Desglose de Segundos a Minutos ---");
        {
            System.out.print("Segundos totales: "); int totalSegundos = teclado.nextInt();
            int minutos = totalSegundos / 60;
            int segundos = totalSegundos % 60;
            System.out.println("Equivale a: " + minutos + " minutos y " + segundos + " segundos.");
        }

        System.out.println("\n--- Ejercicio 7: Interés Compuesto Simple (2 Periodos) ---");
        {
            System.out.print("Capital inicial (c): "); double c = teclado.nextDouble();
            System.out.print("Tasa de interés decimal (i): "); double i = teclado.nextDouble();
            double monto = c * (1 + i) * (1 + i);
            System.out.println("Monto acumulado: " + monto);
        }

        System.out.println("\n--- Ejercicio 8: Ecuación Aritmética Jerarquizada ---");
        {
            System.out.print("Ingrese a (entero): "); int a = teclado.nextInt();
            System.out.print("Ingrese b (entero): "); int b = teclado.nextInt();
            System.out.print("Ingrese c (entero): "); int c = teclado.nextInt();
            int resultado = (a + (b * c)) - (a / b) + (b % c);
            System.out.println("Resultado: " + resultado);
        }

        System.out.println("\n--- Ejercicio 9: Perímetro y Área de Rectángulo ---");
        {
            System.out.print("Base (b): "); double b = teclado.nextDouble();
            System.out.print("Altura (h): "); double h = teclado.nextDouble();
            double perimetro = 2 * b + 2 * h;
            double area = b * h;
            System.out.println("Perímetro: " + perimetro);
            System.out.println("Área: " + area);
        }

        System.out.println("\n--- Ejercicio 10: Polinomio de Segundo Grado ---");
        {
            System.out.print("Coeficiente a: "); double a = teclado.nextDouble();
            System.out.print("Coeficiente b: "); double b = teclado.nextDouble();
            System.out.print("Coeficiente c: "); double c = teclado.nextDouble();
            System.out.print("Valor de x: "); double x = teclado.nextDouble();
            double resultado = (a * (x * x)) + (b * x) + c;
            System.out.println("Resultado del polinomio: " + resultado);
        }

        // Bloque 2: Operadores Relacionales
        System.out.println("\n--- Ejercicio 11: Verificación de Mayoría de Edad ---");
        {
            System.out.print("Edad: "); int edad = teclado.nextInt();
            boolean esMayor = edad >= 18;
            System.out.println("¿Es mayor de edad?: " + esMayor);
        }

        System.out.println("\n--- Ejercicio 12: Comprobación de Número Par ---");
        {
            System.out.print("Número entero: "); int num = teclado.nextInt();
            boolean esPar = (num % 2) == 0;
            System.out.println("¿Es par?: " + esPar);
        }

        System.out.println("\n--- Ejercicio 13: Comprobación de Múltiplo de 5 ---");
        {
            System.out.print("Valor entero: "); int num = teclado.nextInt();
            boolean esMultiplo = (num % 5) == 0;
            System.out.println("¿Es múltiplo de 5?: " + esMultiplo);
        }

        System.out.println("\n--- Ejercicio 14: Comparación Estricta de Desigualdad ---");
        {
            System.out.print("Valor 1: "); double val1 = teclado.nextDouble();
            System.out.print("Valor 2: "); double val2 = teclado.nextDouble();
            boolean distintos = val1 != val2;
            System.out.println("¿Son distintos?: " + distintos);
        }

        System.out.println("\n--- Ejercicio 15: Discriminante de Ecuación Cuadrática ---");
        {
            System.out.print("Valor a: "); double a = teclado.nextDouble();
            System.out.print("Valor b: "); double b = teclado.nextDouble();
            System.out.print("Valor c: "); double c = teclado.nextDouble();
            boolean discriminanteValido = ((b * b) - (4 * a * c)) >= 0;
            System.out.println("¿Discriminante >= 0?: " + discriminanteValido);
        }

        System.out.println("\n--- Ejercicio 16: Evaluación de Límite de Crédito ---");
        {
            System.out.print("Monto de compra: "); double compra = teclado.nextDouble();
            System.out.print("Límite de crédito: "); double limite = teclado.nextDouble();
            boolean excede = compra > limite;
            System.out.println("¿Excede el límite?: " + excede);
        }

        System.out.println("\n--- Ejercicio 17: Comparación de Producto vs Suma ---");
        {
            System.out.print("Número a: "); double a = teclado.nextDouble();
            System.out.print("Número b: "); double b = teclado.nextDouble();
            boolean menor = (a * b) < (a + b);
            System.out.println("¿Producto menor que suma?: " + menor);
        }

        System.out.println("\n--- Ejercicio 18: Verificación de Cero Exacto ---");
        {
            System.out.print("Valor para x: "); double x = teclado.nextDouble();
            boolean esCero = ((3 * x) - 12) == 0;
            System.out.println("¿Da resultado cero?: " + esCero);
        }

        System.out.println("\n--- Ejercicio 19: Diferencia Mínima Centenaria ---");
        {
            System.out.print("Entero n1: "); int n1 = teclado.nextInt();
            System.out.print("Entero n2: "); int n2 = teclado.nextInt();
            boolean alcanza = (n1 - n2) >= 100;
            System.out.println("¿Diferencia >= 100?: " + alcanza);
        }

        System.out.println("\n--- Ejercicio 20: Evaluación de Calificación Deficiente ---");
        {
            System.out.print("Calificación promedio: "); double promedio = teclado.nextDouble();
            boolean deficiente = promedio < 6.0;
            System.out.println("¿Es deficiente?: " + deficiente);
        }

        // Bloque 3: Lógicos Combinados
        System.out.println("\n--- Ejercicio 21: Pertenencia a Rango Cerrado [10, 50] ---");
        {
            System.out.print("Número n: "); double n = teclado.nextDouble();
            boolean enRango = (n >= 10) && (n <= 50);
            System.out.println("¿Está en [10, 50]?: " + enRango);
        }

        System.out.println("\n--- Ejercicio 22: Exclusión de Rango (Fuera de Límites) ---");
        {
            System.out.print("Valor x: "); double x = teclado.nextDouble();
            boolean fueraRango = (x < 0) || (x > 100);
            System.out.println("¿Fuera de [0, 100]?: " + fueraRango);
        }

        System.out.println("\n--- Ejercicio 23: Condición Básica de Año Bisiesto ---");
        {
            System.out.print("Año: "); int anio = teclado.nextInt();
            boolean esBisiesto = (anio % 4 == 0) && (anio % 100 != 0);
            System.out.println("¿Es bisiesto (regla básica)?: " + esBisiesto);
        }

        System.out.println("\n--- Ejercicio 24: Propiedad de Triángulo Válido ---");
        {
            System.out.print("Lado a: "); double a = teclado.nextDouble();
            System.out.print("Lado b: "); double b = teclado.nextDouble();
            System.out.print("Lado c: "); double c = teclado.nextDouble();
            boolean esTriangulo = ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
            System.out.println("¿Es triángulo válido?: " + esTriangulo);
        }

        System.out.println("\n--- Ejercicio 25: Aprobación por Calificación y Asistencia ---");
        {
            System.out.print("Nota final: "); double nota = teclado.nextDouble();
            System.out.print("Porcentaje asistencia: "); double asistencia = teclado.nextDouble();
            boolean aprueba = (nota >= 70) && (asistencia >= 80);
            System.out.println("¿Aprueba?: " + aprueba);
        }

        System.out.println("\n--- Ejercicio 26: Criterio de Descuento Promocional ---");
        {
            System.out.print("Edad del cliente: "); int edad = teclado.nextInt();
            System.out.print("Monto de compra: "); double compra = teclado.nextDouble();
            boolean descuento = (edad >= 60) || (compra > 1000);
            System.out.println("¿Obtiene descuento?: " + descuento);
        }

        System.out.println("\n--- Ejercicio 27: Número Par Positivo ---");
        {
            System.out.print("Entero num: "); int num = teclado.nextInt();
            boolean parPositivo = (num > 0) && ((num % 2) == 0);
            System.out.println("¿Es par positivo?: " + parPositivo);
        }

        System.out.println("\n--- Ejercicio 28: Verificación de Rangos Extremos ---");
        {
            System.out.print("Entero v: "); int v = teclado.nextInt();
            boolean rangoExtremo = ((v >= 1) && (v <= 10)) || ((v >= 90) && (v <= 100));
            System.out.println("¿Está en [1,10] o [90,100]?: " + rangoExtremo);
        }

        System.out.println("\n--- Ejercicio 29: Autenticación por Credenciales Numéricas ---");
        {
            System.out.print("ID: "); int id = teclado.nextInt();
            System.out.print("NIP: "); int nip = teclado.nextInt();
            boolean autenticado = (id == 1234) && (nip == 9999);
            System.out.println("¿Autenticado?: " + autenticado);
        }

        System.out.println("\n--- Ejercicio 30: Condición Combinada Final ---");
        {
            System.out.print("Número a: "); double a = teclado.nextDouble();
            System.out.print("Número b: "); double b = teclado.nextDouble();
            System.out.print("Número c: "); double c = teclado.nextDouble();
            boolean promedioMayor50 = ((a + b + c) / 3.0) > 50;
            boolean algunCero = (a == 0) || (b == 0) || (c == 0);
            boolean resultadoFinal = promedioMayor50 && algunCero;
            System.out.println("¿Cumple condición combinada?: " + resultadoFinal);
        }

        teclado.close();
        System.out.println("\n--- Fin de la práctica ---");
    }
}
