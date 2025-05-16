package poo.milestone2.model;

public class Paciente {
	
	// Nesta atividade, deve-se implementar:
    // - Atributos de instância: cpf (String), nome (String), idade (int), sexo (char), peso (float), altura (float)
    // - Atributo de classe: totalPacientes (static int)
    // - Construtor: inicializar todos os atributos de instância
	// - Incrementar em 1 totalPacientes a cada instância de Paciente criada
    // - Método: calcularImc() retornando peso/(altura*altura), 
	// - Método: calcularMetabolismo() - Cálculo presente no slide #69, Aula 1 - Apresentação da Disciplina
	// - Método: toString (formato padrão do eclipse)
	
	private String cpf;
	private String nome;
	private int idade;
	private char sexo;
	private float peso;
	private float altura;
	private static int totalPacientes;
	
	public Paciente(String cpf, String nome, int idade, char sexo, float peso, float altura) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		totalPacientes++;
	}
	
	public float calcularImc() {
		return peso/(altura * altura);
	}
	
	public float calcularMetabolismo() {
		if(sexo == 'M' ) {
			if(idade >= 18 && idade < 30) {
				return 15.057f * peso + 679f;
			} else if (idade >= 30 && idade <= 60) {
				return 11.6f * peso + 879f;
			} else if (idade > 60) {
				return 13.5f * peso + 487f;
			}
		} else if(sexo == 'F') {
			if(idade >= 18 && idade < 30) {
				return 14.7f * peso + 486.6f;
			} else if (idade >= 30 && idade <= 60) {
				return 8.7f * peso + 829f;
			} else if (idade > 60) {
				return 10.5f * peso + 596f;
			}
		} 
		
		return 0f;
	}

	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public static int getTotalPacientes() {
		return totalPacientes;
	}
	
	
}
