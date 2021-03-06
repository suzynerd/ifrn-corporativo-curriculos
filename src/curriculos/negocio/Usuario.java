package curriculos.negocio;

public class Usuario {
	// TODO: aplicar validação com anotações (ver Bean Validation)
	private String nome, username, senha, idade, email, estadoCivil;

	public Usuario() {
		super();
	}

	public Usuario(String nome, String username, String senha, String idade,
			String email, String estadoCivil) {
		super();
		this.nome = nome;
		this.username = username;
		this.senha = senha;
		this.idade = idade;
		this.email = email;
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
