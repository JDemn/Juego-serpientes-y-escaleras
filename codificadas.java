public class cliente{
    //atributos
    private String nombre;
    private String direccion;
    private String rfc;
    private Int idCliente;
    private String telefono;
    //constructores
    //métodos/funciones
    private void setNombre(String my_nombre){
        nombre=my_nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
}

public class Gato{
    public String nombre;
    public String tamaño;
    public String raza;
    public String color;
    //metodos
    public void setNombreGato(String nombreG){
        nombre=nombreG;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTamaño(String tamaño){
        tamaño=tamaño
    }
    public String getTamaño(){
        return tamaño
    }
    public void setRaza(String razaG){
        raza=razaG
    }
    public void getRaza(){
        return raza;
    }
    public void setcolor(String colorG){
        color=colorG;
    }
    public void getColor(){
        return color;
    }
    class Playground{
        public static void main(String[]args){
            Gato miGato = new Gato();
            miGato.setNombre("huesos");
            miGato.setTamaño("20cm");
            miGato.setRaza("danes");
            miGato.setcolor("gris");
            System.out.println("hola"+miGato.getNombre());
            System.out.println("tamaño"+miGato.getTamaño());
            System.out.println("raza"+miGato.getRaza());
            System.out.println("color"+miGato.getColor());
        }

    }
}
class Animal{
    private int patas;
   private int ojos;
    private boolean cola;
    private String sexo;

    public Animal(){
        ojos=2;
    }
    public String comer(){
        return "estoy comiendo";
        }
    public void desplazar(){
        System.out.println("estoy moviendome");
    }
}
class Pajaro extends Animal{
    public void desplazar(){
        System.out.println("estoy volando");
    }
}

class Playground{
        public static void main(String[]args){
               Pajaro miPajaro = new Pajaro();
        miPajaro.desplazar();
        miPajaro.comer();
        }
    }