package ejemplopolimorfismo;

public abstract class Animal implements IAnimal{
    private String nome;
    
    public Animal (String nome){
        this.nome=nome;
    }
    public String getNome(){
       return nome;
    }
    public abstract void falar();
}