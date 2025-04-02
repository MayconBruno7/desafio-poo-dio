/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiodiopoo;

import com.mycompany.desafiodiopoo.dominio.Bootcamp;
import com.mycompany.desafiodiopoo.dominio.Conteudo;
import com.mycompany.desafiodiopoo.dominio.Curso;
import com.mycompany.desafiodiopoo.dominio.Dev;
import com.mycompany.desafiodiopoo.dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author maycon-linux
 */
public class Main {

    public static void main(String[] args) {
        
        Curso curso1        = new Curso();
        
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição Curso JAVA");
        curso1.setCargaHoraria(20);
        
        Curso curso2         = new Curso();
        curso2.setTitulo("Curso JAVASCRIPT");
        curso2.setDescricao("Descrição Curso JAVASCRIPT");
        curso2.setCargaHoraria(20);
        
        Conteudo conteudo = new Curso();
        
        System.out.println(curso1);
        System.out.println(curso2);
        
        Mentoria mentoria1   = new Mentoria();
       
        mentoria1.setTitulo("Mentoria Curso JAVA");
        mentoria1.setDescricao("Descrição Mentoria Curso JAVA");
        mentoria1.setData(LocalDate.now());
        
        Mentoria mentoria2         = new Mentoria();
        mentoria2.setTitulo("Mentoria Curso JAVASCRIPT");
        mentoria2.setDescricao("Descrição Mentoria Curso JAVASCRIPT");
        mentoria1.setData(LocalDate.now());
        
        System.out.println(mentoria1);
        System.out.println(mentoria2);    
        
        Bootcamp bootcamp = new Bootcamp();
        
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devMaycon = new Dev();
        devMaycon.setNome("Maycon");
        devMaycon.inscreverBootcamp(bootcamp);
        devMaycon.progredir();
        devMaycon.progredir();
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        
        System.out.println("DevMaycon " + devMaycon.getConteudosIncritos());
        System.out.println("DevJoao "+ devJoao.getConteudosIncritos());
        System.out.println("DevMaycon " + devMaycon.getConteudosConcluidos());
        System.out.println("DevJoao "+ devJoao.getConteudosConcluidos());
        System.out.println(devJoao.calcularTotalXp());
        System.out.println(devMaycon.calcularTotalXp());
        
    }
}
