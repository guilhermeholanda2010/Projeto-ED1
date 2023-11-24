package filmes;

public class NodeSecundaria {
  private NodeSecundaria ante;
  private Filme info;
  private NodeSecundaria prox;
  
  public NodeSecundaria(Filme nomeFilme) {
    this.info = nomeFilme;
  }

  public NodeSecundaria getAnte() {
    return this.ante;
  }

  public void setAnte(NodeSecundaria ante) {
    this.ante = ante;
  }

  public Filme getInfo() {
    return this.info;
  }

  public void setInfo(Filme info) {
    this.info = info;
  }

  public NodeSecundaria getProx() {
    return this.prox;
  }

  public void setProx(NodeSecundaria prox) {
    this.prox = prox;
  }

  

}
