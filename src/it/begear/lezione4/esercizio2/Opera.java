package it.begear.lezione4.esercizio2;

public abstract class Opera {

	private String nomeOp;
	private String artista;

	public Opera(String nomeOp, String nomeArt) {
		this.nomeOp = nomeOp;
		artista = nomeArt;
	}

	public String getNomeOp() {
		return nomeOp;
	}

	public void setNomeOp(String nome) {
		this.nomeOp = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public abstract int getIngombro();

	public String confrontaOpere(Sculture a) {
		if ((Quadri.class.toString()).equals(Sculture.class.toString())) {
			return "le opere sono uguali";
		} else {
			return "le opere confrontate sono diverse ";
		}
	}

	public String toString() {
		return "l'opera si chiama: '" + nomeOp + "'\nil nome dell'artista è: '" + artista + "'";
	}
}
