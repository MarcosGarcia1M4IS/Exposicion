package masaCorporal;

public class corporal {
private String name;
private float weigh, altu, indice;




public corporal(String nombre, float peso, float estat) {
	// TODO Auto-generated constructor stub
	
	this.altu = estat;
	this.name = nombre;
	this.weigh = peso;
}

public void operacion () {
indice = weigh /(altu * altu);
}

public void Imprimir () {
	
	operacion ();
	
	if (indice < 18.5) {
		System.out.println(name + " está en desnutrición, empiece a hacer volumen");
		
	} else if (indice >= 18.5 && indice <= 24.9  ) {
		System.out.println(name + " tiene un peso normal");
	} else if (indice >= 25 && indice <= 29.9) {
		System.out.println(name + " esta en sobrepeso, nada que no se pueda arreglar");

	} else if (indice >= 30 && indice <= 34.9) {
		System.out.println(name + "estas en OBESIDAD I, es mejor empezar a hacer ejercicio");

	} else if (indice >= 35 && indice <= 39.9) {
		System.out.println(name + "esto ya es Obesidad II, ya debes de tener hipertensión");

	} else if (indice >= 40 && indice <= 49.9) {
		System.out.println(name + "estas en OBESIDAD III, ¿Problemas arteriales?");

	} else if (indice >= 50) {
		System.out.println(name + "Es un milagro que camines, OBESIDAD IV");

	}

	
}


}
