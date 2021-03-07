package t10;

public class ArrayList {
    
    public void addObjeto(Contato contato){
        lista1.add(contato);
    }
    
    public int retornaTamanho(){
        return lista1.size();
    }
    
    public void remover(Contato contato){
        lista1.remove(contato);
    }
    
    public void exibeContatos(){
        for(int i = 0; i <lista1.size(); i++){
            System.out.println("Nome: " + lista1.get(i).getNome());
            System.out.print("\tIdade: " + lista1.get(i).getIdade());
        }
    }
    
    
}
