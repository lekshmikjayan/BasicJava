interface Intfc{
    public void sett();
    public void rest();

}
class Pin implements Intfc{
    public void sett(){
        System.out.println("All izz well");
    }
    public void rest(){
        System.out.println("Insha Allah");
    }
}

 class Pqrs{
    public static void main(String[] args){
    Pin p = new Pin();
    p.sett();
    p.rest();
}
}