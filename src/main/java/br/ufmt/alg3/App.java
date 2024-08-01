package br.ufmt.alg3;

import br.ufmt.alg3.curso.Curso;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Curso curso = new Curso();
        Curso curso2 = new Curso();
        curso.setNome("Nome Teste");
        curso2.setNome("SI");
        curso2 = curso;
        curso2.setNome("mudando nome 1");
    
        System.out.println(curso.getNome());
        System.out.println(curso2.getNome());
        
}
