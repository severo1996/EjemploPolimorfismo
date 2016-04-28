package ejemplopolimorfismo;

public class Can extends Animal{
    private String raza;

    public Can(String nome,String raza) {
        super(nome);
        this.raza=raza;
    }
    
    @Override
    public void falar() {
        System.out.println("GUAU GUAU");
    }
    public void andar(){
        System.out.println("anda o can");
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Can{" + "nome "+this.getNome()+" raza=" + raza + '}';
    }
}