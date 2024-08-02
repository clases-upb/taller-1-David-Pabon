/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
        public static String Convertir_km_seg(int velocidad_km_s) {

        try {
            double velocidad_m_s = 0;
            double velocidad_m_h = 0;

            final short convertir_ms = 1000;
            final int convertir_mh = 3600000;

            velocidad_m_s = velocidad_km_s * convertir_ms;
            velocidad_m_h = velocidad_km_s * convertir_mh;
            return velocidad_m_s + " m/s - " + velocidad_m_h + " m/h ";

        }

        catch (Exception e) {
            return "Error en la conversion";
        }

    }

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
        public static float Convertir_cm_lt(double cc) {

        try {
            float litros = 0;
            final short div_conversion = 1000;
            litros = (float) (cc / div_conversion);
            return litros;

        } catch (Exception e) {
            return 0;
        }

    }

  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
        public static int Convertir_us_cops(int dolares) {
        // 1. declaracion de variables
        int pesos = 0;
        final int TRM = 4170;

        try {
            // 2. Operaiones
            pesos = dolares * TRM;
            return pesos;
        } catch (Exception e) {
            return -1;
        }

    }
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
        public static float Convertir_cent_far(float Grados_centigrados) {

        try {
            float Fahrenheit = 0;
            Fahrenheit = 32 + (9 * Grados_centigrados / 5);
            return Fahrenheit;

        }

        catch (Exception e) {
            return 0;
        }

    }

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
        public static int Calcular_segs(short dias, short horas, short min, short seg) {

        try {

            if (dias < 0 || horas < 0 || min < 0 || seg < 0) {
                System.out.println("Los valores deben ser positivos");
            }

            int total_seg = 0;
            final short segxmin = 60;
            final byte horaxdias = 24;
            final byte minxhora = 60;
            total_seg = (dias * horaxdias * minxhora * segxmin) + (horas * minxhora * segxmin) + (min * segxmin)
                    + (seg);
            return total_seg;

        }

        catch (Exception e) {
            return -1;
        }

    }

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
        public static String Calcular_peso_carga(float camion_carga_ton, float camion_vacio_ton) {

        try {
            float peso_neto_kg = 0;
            float peso_neto_ton = 0;
            final float conversion_ton_a_kg = 1000.0f;
            peso_neto_ton = camion_carga_ton - camion_vacio_ton;
            peso_neto_kg = peso_neto_ton * conversion_ton_a_kg;
            return peso_neto_kg + " kilos - " + peso_neto_ton + " toneladas ";

        } catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
        }

    }

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
        public static float Calcular_horasxviaje(String horas_destino, short distancia_kms, short velocidad_kh) {

        try {
            float horas_total = 0;
            horas_total = (float) (distancia_kms / velocidad_kh);
            return horas_total;

        }

        catch (Exception e) {
            return -1;
        }

    }
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
        public static float Calcular_combustible(int Ruta1, int Ruta2, int Ruta3, int Ruta4) {

        try {
            float total_combustible = 0;
            final float consumo_km = 0.2f / 60.8f;
            final float consumo_des = 1.2f;
            final float consumo_ate = 0.4f;
            int[] rutas = new int[4];
            rutas[0] = Ruta1;
            rutas[1] = Ruta2;
            rutas[2] = Ruta3;
            rutas[3] = Ruta4;
            for (int ruta : rutas) {
                total_combustible += consumo_des + (ruta * consumo_km) + consumo_ate;

            }
            return total_combustible;
        }

        catch (Exception e) {
            return -1;
        }

    }
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
        public static double Calcular_peso_luna(byte peso_tierra_kg) {

        try {
            double peso_tierra_new = 0;
            double peso_luna_new = 0;
            float peso_kilos = peso_tierra_kg;
            final float conversion_kg_new = 9.81f;
            final float conversion_new_kg = 0.165f;
            peso_tierra_new = peso_kilos * conversion_kg_new;
            peso_luna_new = peso_tierra_new * conversion_new_kg;
            return peso_luna_new;

        }

        catch (Exception e) {
            return 0;
        }

    }
   
}
