package test;
public class Motor {
    int numeroCilindros;
    int registro;
    String tipo;

    void cambiarRegistro(int registro){
        this.registro = registro;
    }
    void asignarTipo(String tipo){
        if (tipo.equals("electrico")){
            this.tipo = "electrico";
        }else if(tipo.equals("gasolina")){
            this.tipo = "gasolina";
        }
    }
}
