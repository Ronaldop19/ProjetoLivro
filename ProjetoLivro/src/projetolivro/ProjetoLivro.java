package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
      Pessoa[] p = new Pessoa[2];
      Livro[] l = new Livro [3];
      
      p[0] = new Pessoa("Ana", 19, "F");
      p[1] = new Pessoa("Vini", 22, "M");
      
      l[0] = new Livro ("A volta ao mundo em 180 dias", "Julio Verne", 132, p[1]);
      l[1] = new Livro ("A cronica de Narnia", "C. S. Lewis", 891, p[0]);
      l[2] = new Livro ("A falcatrua", "Jose Martins", 309, p[1]);
      
      l[0].abrir();
      l[0].folhear(100);
      l[0].avancarPag();
      
        System.out.println(l[0].detalhes());
    }
    
}
