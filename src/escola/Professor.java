package escola;

public class Professor extends Pessoa {
    private String materia;
    private double salario;
    private boolean valido;

    public boolean getValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
    
    
}
