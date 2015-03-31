/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamentofuncionario;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
		
               String valor;
               int cont = 0;
               System.out.println("Informe o texto: ");
               valor = sc.next();
                
               Pattern p = Pattern.compile("\\d+");
               Matcher m = p.matcher(valor);
                    
                while(m.find()){
                        String aux = m.group();
                        int i = Integer.parseInt(aux);
                       
                        cont+=i;
                }
                System.out.println(cont);  
    }
    
}
