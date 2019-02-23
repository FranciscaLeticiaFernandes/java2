package view;

public class Cadastro {
	public static void main (String args[]) {
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome("Leticia");
		System.out.println(pf.getNome());
	   
		
		
		PessoaJuridica pj= new PessoaJuridica();
		pj.setNome("Francisca");
		pj.setBairro("Beira do rio");
		System.out.println(pj.getNome());
		System.out.println(pj.getBairro());
	}

}
