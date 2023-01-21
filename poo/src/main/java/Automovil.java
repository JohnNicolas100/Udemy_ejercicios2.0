public class Automovil {

    private String fabricante;
    private  String modelo;
    private String color = "gris";
    private double cilindraje;
    private int capacidadEstanque = 40;

    public Automovil() {

    }
    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindraje) {
       this(fabricante, modelo, color);
        this.cilindraje = cilindraje;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindraje, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindraje);

        this.capacidadEstanque = capacidadEstanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public String verDetalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante =" + this.getFabricante());
        sb.append("\nauto.modelo =" + this.getModelo());
        sb.append("\nauto.color =" + this.getColor());
        sb.append("\nauto.cilindraje =" + this.getCilindraje());
        return sb.toString();
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerandoa " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + "frenando";

    }

        public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
        }

        public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadEstanque*porcentajeBencina);
        }

        public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadEstanque*(porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }
}
