/*
Gabriel Gómez Calderón
Johan Stiven Gonzalez Rativa
Omar Enrique Vivas Eyrich
 */
public class project3 {
    public static void main(String[] args) {
        byte marcadores[][][] =
                {{{3, 4, 0, 3}, {5, 6, 2, 0}, {1, 2, 1, 1}, {7, 8, 2, 1}, {9, 10, 3, 0}, {14, 15, 2, 0}, {11, 12, 1, 1}, {13, 16, 3, 1},
                        {23, 24, 1, 2}, {18, 19, 3, 1}, {17, 20, 2, 2}, {21, 22, 3, 1}, {27, 28, 2, 1}, {31, 32, 2, 1},
                        {29, 30, 4, 1}, {25, 26, 4, 1}, {8, 6, 2, 1}, {1, 3, 0, 1}, {4, 2, 4, 1}, {5, 7, 3, 2}, {15, 16, 0, 2},
                        {12, 10, 1, 0}, {13, 14, 3, 2}, {9, 11, 2, 1}, {19, 20, 1, 3}, {21, 23, 3, 0}, {24, 22, 2, 1}, {17, 18, 0, 3},
                        {28, 26, 1, 1}, {32, 30, 3, 3}, {25, 27, 2, 1}, {29, 31, 1, 1}, {2, 3, 1, 2}, {4, 1, 3, 1}, {6, 7, 2, 3},
                        {8, 5, 2, 3}, {16, 14, 1, 2}, {15, 13, 0, 3}, {12, 9, 0, 2}, {10, 11, 0, 3}, {22, 23, 2, 2}, {24, 21, 0, 2},
                        {20, 18, 1, 2}, {19, 17, 0, 1}, {30, 31, 0, 1}, {32, 29, 1, 2}, {28, 25, 1, 3}, {26, 27, 1, 2}, {4, 7, 3, 1},
                        {9, 14, 3, 2}, {13, 11, 1, 0}, {5, 3, 2, 2}, {18, 24, 2, 1}, {25, 31, 3, 1}, {21, 20, 0, 0}, {29, 27, 0, 0},
                        {18, 25, 1, 2}, {4, 9, 1, 2}, {20, 29, 0, 0}, {13, 5, 3, 0}, {25, 9, 2, 2}, {20, 13, 0, 2}, {9, 20, 3, 0}, {25, 13, 3, 0}},

                        {{3, 4, 0, 2}, {5, 6, 1, 0}, {1, 2, 1, 2}, {7, 8, 1, 0}, {9, 10, 3, 0}, {14, 15, 2, 1}, {11, 12, 1, 1}, {13, 16, 3, 1}, {23, 24, 1, 3}, {18, 19, 2, 1},
                                {17, 20, 2, 0}, {21, 22, 2, 0}, {27, 28, 2, 1}, {31, 32, 2, 1}, {29, 30, 2, 1}, {25, 26, 3, 0}, {8, 6, 3, 2}, {1, 3, 1, 1}, {4, 2, 1, 0},
                                {5, 7, 2, 1}, {15, 16, 1, 2}, {12, 10, 3, 0}, {13, 14, 3, 1}, {9, 11, 2, 0}, {19, 20, 1, 1}, {21, 23, 3, 1}, {24, 22, 2, 1},
                                {17, 18, 2, 2}, {28, 26, 2, 2}, {32, 30, 0, 0}, {25, 27, 3, 1}, {29, 31, 0, 0}, {2, 3, 3, 2}, {4, 1, 3, 1}, {6, 7, 0, 1}, {8, 5, 0, 1},
                                {16, 14, 2, 3}, {15, 13, 0, 2}, {12, 9, 1, 1}, {10, 11, 0, 1}, {22, 23, 2, 1}, {24, 21, 2, 3}, {20, 18, 1, 2}, {19, 17, 1, 3}, {30, 31, 0, 1},
                                {32, 29, 0, 4}, {28, 25, 0, 2}, {26, 27, 1, 2}, {4, 7, 3, 1}, {9, 14, 3, 2}, {13, 12, 3, 1}, {5, 2, 1, 0}, {17, 24, 2, 1}, {25, 31, 3, 1},
                                {21, 18, 2, 3}, {29, 27, 1, 1}, {17, 25, 1, 2}, {4, 9, 3, 3}, {18, 29, 2, 1}, {13, 5, 3, 0}, {25, 9, 2, 2}, {18, 13, 2, 2}, {9, 18, 1, 0}, {25, 13, 1, 1}},

                        {{3, 4, 0, 2}, {5, 6, 1, 0}, {1, 2, 1, 2}, {7, 8, 1, 0}, {9, 10, 3, 0}, {14, 15, 2, 1}, {11, 12, 1, 1},
                                {13, 16, 3, 1}, {23, 24, 1, 3}, {18, 19, 2, 1}, {17, 20, 2, 0}, {21, 22, 2, 0}, {27, 28, 2, 1}, {31, 32, 2, 1},
                                {29, 30, 2, 1}, {25, 26, 3, 0}, {8, 6, 3, 2}, {1, 3, 1, 1}, {4, 2, 1, 0}, {5, 7, 2, 1}, {15, 16, 1, 2},
                                {12, 10, 3, 0}, {13, 14, 3, 1}, {9, 11, 2, 0}, {19, 20, 1, 1}, {21, 23, 3, 1}, {24, 22, 2, 1}, {17, 18, 2, 2},
                                {28, 26, 2, 2}, {32, 30, 0, 0}, {25, 27, 3, 1}, {29, 31, 0, 0}, {2, 3, 3, 2}, {4, 1, 3, 1}, {6, 7, 0, 1},
                                {8, 5, 0, 1}, {16, 14, 2, 3}, {15, 13, 0, 2}, {12, 9, 1, 1}, {10, 11, 0, 1}, {22, 23, 2, 1}, {24, 21, 2, 3},
                                {20, 18, 1, 2}, {19, 17, 1, 3}, {30, 31, 0, 1}, {32, 29, 0, 4}, {28, 25, 0, 2}, {26, 27, 1, 2}, {4, 7, 3, 1},
                                {9, 14, 3, 2}, {13, 11, 3, 1}, {5, 3, 1, 0}, {18, 24, 2, 1}, {25, 31, 3, 1}, {21, 20, 2, 3}, {29, 27, 1, 1},
                                {18, 25, 1, 2}, {4, 9, 3, 3}, {20, 29, 2, 1}, {13, 5, 3, 0}, {25, 9, 2, 2}, {20, 13, 2, 2}, {9, 20, 1, 0}, {25, 13, 2, 1}},

                        {{3, 4, 0, 2}, {5, 6, 1, 0}, {1, 2, 1, 2}, {7, 8, 1, 0}, {9, 10, 3, 0}, {14, 15, 2, 1}, {11, 12, 1, 1},
                                {13, 16, 3, 1}, {23, 24, 1, 3}, {18, 19, 2, 1}, {17, 20, 2, 0}, {21, 22, 2, 0}, {27, 28, 2, 1}, {31, 32, 2, 1},
                                {29, 30, 2, 1}, {25, 26, 3, 0}, {8, 6, 3, 2}, {1, 3, 1, 1}, {4, 2, 1, 0}, {5, 7, 2, 1}, {15, 16, 1, 2},
                                {12, 10, 3, 0}, {13, 14, 3, 1}, {9, 11, 2, 0}, {19, 20, 1, 1}, {21, 23, 3, 1}, {24, 22, 2, 1}, {17, 18, 2, 2},
                                {28, 26, 2, 2}, {32, 30, 0, 0}, {25, 27, 3, 1}, {29, 31, 0, 0}, {2, 3, 3, 2}, {4, 1, 3, 1}, {6, 7, 0, 1},
                                {8, 5, 0, 1}, {16, 14, 2, 3}, {15, 13, 0, 2}, {12, 9, 1, 1}, {10, 11, 0, 1}, {22, 23, 2, 1}, {24, 21, 2, 3},
                                {20, 18, 1, 2}, {19, 17, 1, 3}, {30, 31, 0, 1}, {32, 29, 0, 4}, {28, 25, 0, 2}, {26, 27, 1, 2}, {3, 5, 3, 1},
                                {9, 16, 3, 2}, {13, 12, 3, 1}, {7, 4, 2, 1}, {17, 24, 3, 1}, {25, 31, 1, 0}, {21, 20, 2, 3}, {29, 27, 1, 1},
                                {24, 25, 3, 3}, {3, 9, 1, 2}, {21, 29, 3, 0}, {13, 4, 1, 2}, {25, 9, 2, 2}, {4, 21, 2, 2}, {25, 21, 1, 0}, {9, 4, 2, 1}}};

        String[] selecciones = {"Qatar", "Ecuador", "Senegal", "Países Bajos", "Inglaterra", "Irán", "EEUU", "Gales",
                "Argentina", "Arabia Saudí", "México", "Polonia", "Francia", "Dinamarca", "Túnez", "Australia", "España",
                "Alemania", "Japón", "Costa Rica", "Bélgica", "Canadá", "Marruecos", "Croacia", "Brasil", "Serbia", "Suiza",
                "Camerún", "Portugal", "Ghana", "Uruguay", "Corea del Sur"};

        short[] resultado = calcular_puntajes_todos(marcadores);

        System.out.println("Los resultados son: " + resultado[0]+","+resultado[1]+","+resultado[2]);

        System.out.println("El equipo favorito para la final es: "+determinar_favorito(selecciones, marcadores));

        byte repetido[]=definir_marcador_mas_popular(marcadores);

        System.out.println("El marcador mas repetido es: "+ repetido[0]+"-"+repetido[1]);

    }

    static byte determinar_ganador(byte goles_equipo_1, byte goles_equipo_2) {

        if (goles_equipo_1 == goles_equipo_2) {
            return 0;

        } else if (goles_equipo_1 > goles_equipo_2) {
            return 1;

        } else {
            return 2;
        }
    }

    static byte calcular_puntaje_partido(byte equipo_1_real, byte equipo_2_real, byte goles_equipo_1_real,
                                         byte goles_equipo_2_real, byte equipo_1_pronostico, byte equipo_2_pronostico,
                                         byte goles_equipo_1_pronostico, byte goles_equipo_2_pronostico, byte partido) {

        byte acierto_completo = 2, acierto_parcial = 1, no_acierto = 0, puntaje = 0;

        if (partido <= 48) {
            acierto_completo = 2;
            acierto_parcial = 1;

        } else if (partido <= 56) {
            acierto_completo *= 2;
            acierto_parcial *= 2;

        } else if (partido <= 60) {
            acierto_completo *= 4;
            acierto_parcial *= 4;

        } else if (partido <= 63) {
            acierto_completo *= 8;
            acierto_parcial *= 8;

        } else if (partido == 64) {
            acierto_completo *= 16;
            acierto_parcial *= 16;
        }

        if (equipo_1_real == equipo_2_pronostico && equipo_2_real == equipo_1_pronostico) {
            byte aux = equipo_1_pronostico;
            equipo_1_pronostico = equipo_2_pronostico;
            equipo_2_pronostico = aux;

            byte aux2 = goles_equipo_1_pronostico;
            goles_equipo_1_pronostico = goles_equipo_2_pronostico;
            goles_equipo_2_pronostico = aux2;
        }

        if (equipo_1_real == equipo_1_pronostico && equipo_2_real == equipo_2_pronostico
                && equipo_1_real != equipo_2_real) {

            if (goles_equipo_1_real == goles_equipo_1_pronostico && goles_equipo_2_real == goles_equipo_2_pronostico) {
                puntaje = acierto_completo;

            } else if (goles_equipo_1_real > goles_equipo_2_real
                    && goles_equipo_1_pronostico > goles_equipo_2_pronostico) {
                puntaje = acierto_parcial;

            } else if (goles_equipo_1_real < goles_equipo_2_real
                    && goles_equipo_1_pronostico < goles_equipo_2_pronostico) {
                puntaje = acierto_parcial;

            } else if (goles_equipo_1_real == goles_equipo_2_real
                    && goles_equipo_1_pronostico == goles_equipo_2_pronostico
                    && goles_equipo_1_real != goles_equipo_1_pronostico) {
                puntaje = acierto_parcial;

            } else {
                puntaje = no_acierto;
            }
        }
        return puntaje;
    }

    static byte calcular_puntaje_por_jugador(byte[][] marcadores_reales, byte[][] marcadores_jugador) {
        byte aux = 0;
        byte resultado = 0;

        for (byte i = 0; i < marcadores_jugador.length; i++) {
            byte partido = i;
            partido++;

            resultado = calcular_puntaje_partido(marcadores_reales[i][0], marcadores_reales[i][1],
                    marcadores_reales[i][2], marcadores_reales[i][3], marcadores_jugador[i][0],
                    marcadores_jugador[i][1], marcadores_jugador[i][2], marcadores_jugador[i][3], partido);
            aux += resultado;
        }
        return aux;
    }

    static short[] calcular_puntajes_todos(byte marcadores[][][]) {
        byte[][] partido_real = new byte[marcadores[0].length][marcadores[0][0].length];
        byte[][] jugadores = new byte[marcadores[0].length][marcadores[0][0].length];
        byte[][] jugadores_2 = new byte[marcadores[0].length][marcadores[0][0].length];
        byte[][] jugadores_3 = new byte[marcadores[0].length][marcadores[0][0].length];
        short[] aux = new short[marcadores.length - 1];
        short resultado1 = 0,resultado2=0,resultado3=0;

        for (byte j = 0; j < marcadores[0][0].length; j++) {
            for (byte i = 0; i < marcadores[0].length; i++) {

                partido_real[i][j] = marcadores[0][i][j];
                jugadores[i][j] = marcadores[1][i][j];
                resultado1 = calcular_puntaje_por_jugador(partido_real, jugadores);
                aux[0] = resultado1;
                jugadores_2[i][j] = marcadores[2][i][j];
                resultado2=calcular_puntaje_por_jugador(partido_real,jugadores_2);
                aux[1]= resultado2;
                jugadores_3[i][j] = marcadores[3][i][j];
                resultado3=calcular_puntaje_por_jugador(partido_real,jugadores_3);
                aux[2]= resultado3;
            }
        }
        return aux;
    }

    static String determinar_favorito(String[] selecciones, byte marcadores[][][]) {
        String[] ganadores = new String[marcadores.length * 2 - 2];
        String ganador = new String();

        for (int k = 1; k < marcadores.length; k++) {
            int goles = determinar_ganador(marcadores[k][63][2], marcadores[k][63][3]);

            if (goles == 0) {
                int ganador_numero = marcadores[k][63][0];
                int ganador2_numero = marcadores[k][63][1];
                ganadores[k - 1] = selecciones[ganador_numero - 1];
                ganadores[marcadores.length * 2 - k - 2] = selecciones[ganador2_numero - 1];

            } else if (goles == 1) {
                int ganador_numero = marcadores[k][63][0];
                ganadores[k - 1] = selecciones[ganador_numero - 1];
            }
            else {
                int ganador2_numero = marcadores[k][63][1];
                ganadores[k - 1] = selecciones[ganador2_numero - 1];
            }
        }

        for (int i = 1; i < ganadores.length; i++) {
            if (ganadores[0].equals(ganadores[i])) {
                ganador = ganadores[0];
            }
            else if (ganadores[1].equals(ganadores[i])) {
                ganador = ganadores[1];
            }
        }
        return ganador;
    }
    static byte[] definir_marcador_mas_popular(byte marcadores[][][]) {
        byte[] partidos = new byte[2];
        byte[] resultado = new byte[2];
        int marcador_0_0 = 0;
        int marcador_1_0 = 0;
        int marcador_1_1 = 0;
        int marcador_2_0 = 0;
        int marcador_2_1 = 0;
        int marcador_2_2 = 0;
        int marcador_3_0 = 0;
        // por improbabilidad que las personas pongan un marcador como 3-1 o 3-2, evaluamos hasta 3-0
        for (int k = 1; k < marcadores.length; k++) {
            for (int i = 0; i < marcadores[0].length; i++) {
                partidos[0] = marcadores[k][i][2];
                partidos[1] = marcadores[k][i][3];
                resultado[0]=0;
                resultado[1]=0;//0 0
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_0_0++;
                }
                resultado[0] = 1; //1 0
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_1_0++;
                }
                resultado[0] = 0;
                resultado[1] = 1; //0 1
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_1_0++;
                }
                resultado[0] = 1; //1 1
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_1_1++;
                }
                resultado[0] = 2;
                resultado[1] = 0; //2 0
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_2_0++;
                }
                resultado[0]=0;
                resultado[1]=2; //0 2
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]){
                   marcador_2_0++;
                }
                resultado[0]=2;
                resultado[1]=1; //2 1
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_2_1++;
                }
                resultado[0]=1;
                resultado[1]=2; //1 2
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_2_1++;
                }
                resultado[1] = 2; //2 2
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_2_2++;
                }
                resultado[0] = 3;
                resultado[1] = 0; //3 0
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_3_0++;
                }
                resultado[0] = 0;
                resultado[1] = 3; //0 3
                if (resultado[0] == partidos[0]&&resultado[1]==partidos[1]) {
                    marcador_3_0++;
            }
        }}
        byte repetido[]=new byte[2];
        if (marcador_0_0 > marcador_1_0 && marcador_0_0 > marcador_1_1 && marcador_0_0 > marcador_2_0 &&
                marcador_0_0 > marcador_2_1 && marcador_0_0 > marcador_2_2 && marcador_0_0 > marcador_3_0) {
            repetido[0]= 0;
            repetido[1]= 0;
        } else if (marcador_1_0 > marcador_1_1 && marcador_1_0 > marcador_2_0 &&
                marcador_1_0 > marcador_2_1 && marcador_1_0 > marcador_2_2 && marcador_1_0 > marcador_3_0) {

            repetido[0]= 1;
        } else if (marcador_1_1 > marcador_2_0 && marcador_1_1 > marcador_2_1 && marcador_1_1 > marcador_2_2
                && marcador_1_1 > marcador_3_0 && marcador_1_1 > marcador_0_0 && marcador_1_1 > marcador_1_0) {
            repetido[0]= 1;
            repetido[1]= 1;
        } else if (marcador_2_0 > marcador_2_1 && marcador_2_0 > marcador_2_2 && marcador_2_0 > marcador_3_0
                && marcador_2_0 > marcador_0_0 && marcador_2_0 > marcador_1_0 && marcador_2_0 > marcador_1_1) {
            repetido[0]= 2;
        } else if (marcador_2_1 > marcador_2_2 && marcador_2_1 > marcador_3_0 && marcador_2_1 > marcador_0_0 &&
                marcador_2_1 > marcador_1_0 && marcador_2_1 > marcador_1_1 && marcador_2_1 > marcador_2_0) {
            repetido[0]= 2;
            repetido[1]= 1;
        } else if (marcador_2_2 > marcador_3_0 && marcador_2_2 > marcador_0_0 &&
                marcador_2_2 > marcador_1_0 && marcador_2_2 > marcador_1_1 && marcador_2_2 > marcador_2_0 && marcador_2_2 > marcador_2_1) {
            repetido[0]= 2;
            repetido[1]= 2;
        } else {
            repetido[0]= 3;
        }
        return repetido;
    }
}





