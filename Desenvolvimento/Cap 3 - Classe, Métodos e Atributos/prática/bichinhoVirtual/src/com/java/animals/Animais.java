package com.java.animals;
    /*
        Seja um conjunto de animais que possui as características comuns: nome, classe, família, idade, estado (vivo = true e morto = false), caloria (0 a 100) e força (0 a 100).
    */
public class Animais {

    private String nome;
    private String classe;
    private String familia;
    private Integer idade;
    private Boolean estado;
    private Integer caloria;
    private Integer forca;

    public Animais(String nome, String classe, String familia, Integer idade, Boolean estado, Integer caloria, Integer forca) {

        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = idade;
        this.estado = estado;
        this.caloria = caloria;
        this.forca = forca;
    }

    public Animais (String nome, String classe, String familia) {

        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.estado = true;
        this.caloria = 10;
        this.forca = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getCaloria() {
        return caloria;
    }

    public void setCaloria(Integer caloria) {
        this.caloria = caloria;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public String comer() {

        this.caloria += 10;
        this.forca -= 2;

        return "O " + nome + " acabou de comer. Agora sua força é de: " + forca + ". E sua caloria vale: " + caloria + ".";
    }

    public String correr() {
        
        this.forca += 5;
        this.caloria -= 5;

        return "O(a) " + nome + " está correndo! Perdendo " + caloria + " calorias e ganhando " + forca + "!";
    }

    public String dormir() {
        this.forca += 10;
        this.caloria -= 2;

        return "O(a) " + nome + " está dormindo. Sua força aumentou e agora vale: " + forca + " e suas calorias valem " + caloria + ".";
    }

    public String morrer() {
        this.forca = 0;
        this.estado = false; 

        return nome + " morreu :c";
    }

    public String nascer() {
        return "Seu animal se chama " + nome + ". Com a classe " + classe + ", pertencente à familia " + 
		familia + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " +
		idade;
    }
}
