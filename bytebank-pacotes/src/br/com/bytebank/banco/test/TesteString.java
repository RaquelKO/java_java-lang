package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; // object literal, imutável
		// String outro = new String("Alura");
		System.out.println(nome);
		System.out.println(nome.contains("Alu"));
		
		char x = nome.charAt(2);
		System.out.println(x);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		char c = 'A';
		char d = 'a';
		String outra3 = nome.replace(c,d); // = nome.replace('A','a');
		System.out.println(outra3);
		
		String outra = nome.replace("Al", "aL");
		System.out.println(outra);
		
		String outra2 = nome.toUpperCase();			
		System.out.println(outra2);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = " ";
		String outroVazio = vazio.trim(); // o método trim() remove os espaços no inicio e no fim da string 
		System.out.println(vazio.isEmpty());
		System.out.println(outroVazio.isEmpty());
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
		String nome2 = "ALURA";
		CharSequence cs = new StringBuilder("al");
		nome2 = nome2.replace("AL", cs);
		System.out.println(nome2);
		
		/*
		 * System.out.println()
		 * 
		 * System
		 * - classe, java.lang, acesso publico
		 * out
		 * - atributo, publico, referencia, static
		 * println
		 * - metodo, publico, nao static, sobrecarga, nao joga excecoes do tipo checked
		 * 
		 * public class System {
		 * 		public static ??? out;
		 * }
		 * */
		
	}

}
