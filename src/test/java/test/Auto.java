package test;
public class Auto {
        String modelo;
        String marca;
        Motor motor;
        int precio;
        int registro;
        static int cantidadCreados;
        Asiento Asientos[];

        void verificarintegridad() {
            int control = this.registro;
            int control2 = 0;
            if(control == this.motor.registro){
                for (int i = 0; i < this.Asientos.length; i++) {
                    if(control != this.Asientos[i].registro) {
                        control2++;
                    }
                }
                if (control2 != 0) {
                    System.out.print("Las piezas no son originales");
                }else System.out.print("Auto original");
            }else System.out.print("Las piezas no son originales");
        }

        int cantidadAsientos(){
            int contador = 0;
            for (int i = 0; i < this.Asientos.length; i++) {
                if (this.Asientos[i] instanceof Asiento){
                    contador++;
                }
            }
            return contador;
        }
}
