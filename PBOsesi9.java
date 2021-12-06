/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARUL ISMAIL
 */

class Hewan
{
    public void info()
    {
        System.out.println("info makhluk");
    }
}

class Herbivora extends Hewan
{
    @Override
    public void info()
    {
        System.out.println("Hewan Herbivora Yaitu :");
    }
}

class Karbivora extends Hewan
{
    @Override
    public void info()
    {
        System.out.println("Hewan Karbivora Yaitu :");
    }
}

class Omnivora extends Hewan
{
    @Override
    public void info()
    {
        System.out.println("Hewan Omnivora Yaitu :");
    }
}


class Sapi extends Herbivora
{
    @Override
    public void info()
    {
        System.out.println("Sapi ");
    }
}


class Singa extends Karbivora
{
    @Override
    public void info()
    {
        System.out.println("Singa ");
    }
}


class Ayam extends Omnivora
{
    @Override
    public void info()
    {
        System.out.println("Ayam ");
    }
}

public class PBOsesi9
{
    public static void main(String[] args) 
    {
        Hewan tombol;
        Herbivora herbivora=new Herbivora();
        Sapi sapiSumba;
        sapiSumba = new Sapi();
        tombol=herbivora;
        tombol.info();      //polymorphism
        tombol=sapiSumba;
        tombol.info();      //polymorphism

        Karbivora karbivora=new Karbivora();
        Singa singa;
        singa = new Singa();
        tombol=karbivora;
        tombol.info();      //polymorphism
        tombol=singa;
        tombol.info();      //polymorphism
        Hewan Karbivora = null;
        
        Omnivora omnivora=new Omnivora();
        Ayam ayampelung;
        ayampelung = new Ayam();
        tombol=omnivora;
        tombol.info();      //polymorphism
        tombol=ayampelung;
        tombol.info();      //polymorphism
        Hewan Omnivora = null;
    }
  
}


