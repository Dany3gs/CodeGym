package Ejercicios.Tema10;

/*
En esta tarea, debe realizar la validación de URL.

Un esquema de URL simple se ve así:
<network protocol>://<resource name>.<domain>

El método checkProtocol(String) verifica el protocolo de red (http o https) de la URL pasada como parámetro de entrada
y devuelve el resultado de esta verificación: el nombre del protocolo de red como una cadena.

Y el método checkDomainExtension(String) verifica la extensión de dominio (com, net, org o us) de la URL pasada como
parámetro de entrada y devuelve el resultado de la verificación: la extensión de dominio como una cadena.

Si la URL no comienza con http o https, entonces el resultado será "desconocido".
Si la URL no termina con com, net, org o us, el resultado será "desconocido".

El método main() no interviene en la prueba.

Requisitos:
•	El método checkProtocol(String) debe implementarse según lo indicado en las condiciones de la tarea.
•	El método checkDomainExtension(String) debe implementarse según lo indicado en las condiciones de la tarea.*/

public class URLValidation {
	
	public static void main(String[] args) {
		String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
		for (String url : urls) {
			String protocol = checkProtocol(url);
			String domainExtension = checkDomainExtension(url);
			
			System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
		}
	}
	
	public static String checkProtocol(String url) {
		//escribe aquí tu código
			if (url.startsWith("http://")) {
				return "http";
			}
			if (url.startsWith("https://")) {
				return "https";
			}
			
		return "desconocido";
	}
	
	public static String checkDomainExtension(String url) {
		//escribe aquí tu código
		if (url.endsWith("com")) {
			return "com";
		}
		if (url.endsWith("net")){
			return "net";
		}
		if (url.endsWith("org")){
			return "org";
		}
		if (url.endsWith("us")){
			return "us";
		}
		return "desconocido";
	}
}

// Ok CodeGym
