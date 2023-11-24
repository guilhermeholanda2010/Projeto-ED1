package filmes;

public class NodePrincipal {
  private NodePrincipal ant;
	private Categoria info;
  private NodePrincipal prox;
    
  public NodePrincipal (Categoria valor) {
      this.info = valor;
  }
    
  public void setInfo (Categoria valor) {
      this.info = valor;
  }
    
   public void setProx (NodePrincipal novoProx) {
      this.prox = novoProx;
  }
    
  public void setAnt (NodePrincipal novoAnt) {
      this.ant = novoAnt;
   }
    
  public Categoria getInfo() {
      return this.info;
  }
    
  public NodePrincipal getProx () {
      return this.prox;
  }
    
  public NodePrincipal getAnt () {
      return this.ant;
  }
}
