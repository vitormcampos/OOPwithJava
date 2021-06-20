public class Lutador {
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    /// Constructor method

    public Lutador () {}

    public Lutador 
    (String nome, 
    String nacionalidade, 
    Integer idade, 
    Double altura, 
    Double peso, 
    Integer vitorias, 
    Integer derrotas, 
    Integer empates
    ) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }

    /// Getters

    public String getNome() {
        return nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public Integer getIdade() {
        return idade;
    }
    public Double getAltura() {
        return altura;
    }
    public Double getPeso() {
        return peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public Integer getVitorias() {
        return vitorias;
    }
    public Integer getDerrotas() {
        return derrotas;
    }
    public Integer getEmpates() {
        return empates;
    }

    /// Setters

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria();
    }
    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if (peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if (peso <=120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
    }
    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }
    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }
    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    /// Methods

    public void apresentar() {
        System.out.println("----------------------------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "mts de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getDerrotas());
        System.out.println("----------------------------------------------");
    }

    public void status() {
        System.out.println("----------------------------------------------");
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
        System.out.println("----------------------------------------------");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() +1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}

    
