package poo.template;

public class LionelMessi  extends JugadoresDeFutbol {

    @Override
    void correr(boolean tieneElBalon){
        System.out.println("Messi corre más rapido");
    }


    public static void main(String[] args) {
        LionelMessi lm10 = new LionelMessi();

        lm10.edad = 34;
        lm10.correr();

        System.out.println(lm10.altura = 1.70);
        System.out.println(lm10.edad = 34);

        lm10.correr(true);

        System.out.println(lm10.getClass());

    }






}
