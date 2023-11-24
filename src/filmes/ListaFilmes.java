package filmes;

public class ListaFilmes {
	private NodeSecundaria primeiro;
	private int qtd;
	private NodeSecundaria ultimo;

	public ListaFilmes(NodeSecundaria primeiro, int qtd, NodeSecundaria ultimo) {
		this.primeiro = primeiro;
		this.qtd = qtd;
		this.ultimo = ultimo;
	}

	public NodeSecundaria getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NodeSecundaria primeiro) {
		this.primeiro = primeiro;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public NodeSecundaria getUltimo() {
		return ultimo;
	}

	public void setUltimo(NodeSecundaria ultimo) {
		this.ultimo = ultimo;
	}

	public boolean isEmpty() {
		if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void inserirOrdenado(Filme filme) {
		NodeSecundaria novo = new NodeSecundaria(filme);
		NodeSecundaria aux, anterior;

		if (this.isEmpty() == true) {
			this.primeiro = novo;
			this.ultimo = novo;
			this.qtd++;
			System.out.println("Inserção efetuada!");
		} else {
			int comparacao = this.primeiro.getInfo().getTitulo().compareTo(filme.getTitulo());

			if (comparacao > 0) {
				this.primeiro.setAnte(novo);
				novo.setProx(this.primeiro);
				this.primeiro = novo;
				this.qtd++;
				System.out.println("Inserção efetuada!");
			} else if (comparacao == 0) {
				System.out.println("Valor repetido!");
			} else {
				aux = this.primeiro;
				while (aux != null) {
					comparacao = aux.getInfo().getTitulo().compareTo(filme.getTitulo());

					if (comparacao > 0) {
						anterior = aux.getAnte();
						anterior.setProx(novo);
						novo.setAnte(anterior);
						novo.setProx(aux);
						aux.setAnte(novo);
						this.qtd++;
						System.out.println("Inserção efetuada!");
						return;
					} else if (comparacao == 0) {
						System.out.println("Valor repetido!");
						return;
					} else {
						aux = aux.getProx();
					}
				}
			}
		}
	}

	public void remover(String titulo) {
		NodeSecundaria aux = this.primeiro;
		boolean filmeEncontrado = false;

		if (this.qtd == 1) {
			if (aux.getInfo().getTitulo().equals(titulo)) {
				filmeEncontrado = true;
			} else {
				System.out.println("O filme não foi encontrado.");
				return;
			}
		}

		while (true) {
			if (aux.getInfo().getTitulo().equals(titulo)) {
				filmeEncontrado = true;
				break;
			}
			aux = aux.getProx();

			if (aux == this.primeiro) {
				break;
			}
		}

		if (!filmeEncontrado) {
			System.out.println("O filme não foi encontrado.");
			return;
		}

		if (aux.getAnte() != null) {
			aux.getAnte().setProx(aux.getProx());
		} else {
			this.ultimo = aux.getProx();
		}

		if (aux.getProx() != null) {
			aux.getProx().setAnte(aux.getAnte());
		} else {
			this.primeiro = aux.getAnte();
		}

		this.qtd--;
		System.out.println("O filme foi removido com sucesso.");
	}

	public Filme buscarFilme(String titulo) {
		NodeSecundaria aux = this.primeiro;

		do {
			if (aux.getInfo().getTitulo().equals(titulo)) {
				return aux.getInfo();
			}
			aux = aux.getProx();
		} while (aux != this.primeiro);

		return null;
	}

	public void exibirLista() {
		if (this.isEmpty()) {
			System.out.println("A lista está vazia.");
		} else {
			NodeSecundaria aux = this.primeiro;
			System.out.println("Lista de filmes:");

			do {
				System.out.println(aux.getInfo().toString());
				aux = aux.getProx();
			} while (aux != this.primeiro);
		}
	}
}
