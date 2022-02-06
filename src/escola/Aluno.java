package escola;


public class Aluno extends Pessoa{
    private String curso;
    private boolean valido;

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSexo() {
        return super.getSexo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIdade() {
        return super.getIdade(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}


