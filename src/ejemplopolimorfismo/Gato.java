package ejemplopolimorfismo;

public class Gato extends Animal{
    String cor;

    public Gato(String nome,String cor) {
        super(nome);
        this.cor=cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void falar() {
        System.out.println("Meow meow");
    }

    @Override
    public String toString() {
        return "Gato{" +"nome "+this.getNome()+ " cor=" + cor + '}';
    }
    
}