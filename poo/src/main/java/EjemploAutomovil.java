public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("subaru", "Impreza");


        subaru.setCilindraje(2.8);
        subaru.setColor("Blanco");


        Automovil mazda = new Automovil("mazda", "fg", "verde", 3.0);


        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Mnissan", "navara", "azul", 3.5, 50);
        Automovil nissan2 = new Automovil("Mnissan", "navara", "azul", 3.5, 50);

        System.out.println("son iguales?" + (nissan == nissan2));
        System.out.println("son iguales con equals?" + (nissan.equals(nissan2)));
        System.out.println(subaru.verDetalles());
        System.out.println(mazda.verDetalles());
        System.out.println(nissan.verDetalles());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 60));
        System.out.println("kilometros por litro " + nissan.calcularConsumo(300, 60));



    }
}
