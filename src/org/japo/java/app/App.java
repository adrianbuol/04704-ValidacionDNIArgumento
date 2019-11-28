/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.japo.java.app;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class App {
    
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int DNI_NUM = 12345678;
    public static final char DNI_CTR = 'W';
    
    public static final int calcular(int num, char ctr) {
        int resultado;
//        Variable que validará los numeros del DNI
        double dniNumero = num % 23;
//        Variable que validará la letra del DNI
        char letraOK = LETRAS.charAt((int) dniNumero);
        if (DNI_CTR == letraOK) {
            resultado = 1;
        } else {
            resultado = 0;
        }
       return resultado;
    }
    
    public static final String validar(int num) {
        String validez = "";
        switch (num) {
            case 1:
                validez = "Validez ..: Correcto";
                break;
            case 0:
                validez = "Validez ..: Incorrecto";
                break;
        }
        return validez;
    }
    
    public final void launchApp() {
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");
        System.out.println("DNI .......: " + DNI_NUM + DNI_CTR);
        System.out.println("---");
        int resultado = calcular(DNI_NUM, DNI_CTR);
        System.out.println(validar(resultado));
    }
}
