package lista6;

public class MainAnimal {

	public static void main(String[] args) {

		Cachorro garfield = new Cachorro();
		garfield.setNome("Garield");
		garfield.setRaca("Husky");
		garfield.setComp(53f);
		garfield.setCor("cinza claro");
		garfield.setNup(4);
		garfield.setEcs("Neve");

		garfield.caminha();
		garfield.late();

		System.out.println(garfield.getNome());
		System.out.println(garfield.getRaca());
		System.out.println(garfield.getComp());
		System.out.println(garfield.getCor());
		System.out.println(garfield.getNup());
		System.out.println(garfield.getEcs());

		Gato mingau = new Gato();
		mingau.setNome("Mingau");
		mingau.setRaca("Persa");
		mingau.setComp(20f);
		mingau.setCor("Preto");
		mingau.setNup(4);
		mingau.setEcs("Comer bastante");

		mingau.caminha();
		mingau.mia();

		System.out.println(mingau.getNome());
		System.out.println(mingau.getRaca());
		System.out.println(mingau.getComp());
		System.out.println(mingau.getCor());
		System.out.println(mingau.getNup());
		System.out.println(mingau.getEcs());

	}

}
