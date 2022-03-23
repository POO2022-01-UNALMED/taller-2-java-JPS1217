package test;
public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String color){
        if (color == "rojo"){
            this.color = "rojo";
        }else if(color == "verde"){
            this.color = "verde";
        }else if(color == "amarillo"){
            this.color = "amarillo";
        }else if(color == "blanco"){
            this.color = "blanco";
        }else if(color == "negro"){
            this.color = "negro";
        }
    }
}
