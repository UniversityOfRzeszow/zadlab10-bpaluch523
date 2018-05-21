/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Bartek
 */
public class WprowadzZKonsoli {
    
    Scanner input = new Scanner(System.in);
    
    public void wprowadzInt(){
        try{
            System.out.println("Wprowadz Int: ");
            int integer = input.nextInt();
            FileReader fr = new FileReader("integer.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("integer.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(integer);
            bwo.newLine();
            bwo.close();
        }catch (IOException e){
        System.out.println(e);
        }
    }
    
    public void wprowadzString(){
        try{
            System.out.println("Wprowadz String: ");
            String strin = input.nextLine();
            FileReader fr = new FileReader("string.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("string.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(strin);
            bwo.newLine();
            bwo.close();
        }catch (IOException e){
        System.out.println(e);
        }
    }
    
}
