
public class Elevador {
	public static void main(String[] args) {
		
		
		Robot obj = new Robot();
		int piso=0;
		int piso2=0;
		String decision="";
		String a="subir";
		String b="bajar";	
		int otravez=0;
		
		
		System.out.println("En que piso esta posicionado usted?");
		piso=(int)obj.Leer();
		while (piso<1 || piso>15) {
			obj.PedirNuevamente=true;
			System.out.println("El edificio tiene solamente 15 pisos!");
			System.out.println("La planta baja es el piso 1");
			System.out.println();
			System.out.println("En que piso esta posicionado usted?:");
			piso=(int)obj.Leer();
			}
		if (piso>=1 && piso<=15) {
			
		System.out.println("Usted esta en el piso " + piso );
		System.out.println();
		System.out.println("Puertas abiertas!");
		System.out.println("¿Desea subir o bajar?");
		decision=obj.LeerTexto();

		if (decision.equalsIgnoreCase(a)){
			System.out.println("¿A que piso deseas subir?");
			piso2=(int)obj.Leer();
			while (piso2<1 || piso2>15) {
				obj.PedirNuevamente=true;
				System.out.println("El edificio tiene solamente 15 pisos!");
				System.out.println("La planta baja es el piso 1");
				System.out.println();
				System.out.println("¿A que piso deseas subir?");
				piso2=(int)obj.Leer();
				}
			
			while (piso2<piso || piso2==piso) {
				obj.PedirNuevamente=true;
				System.out.println("El piso indicado no es mayor al actual");
				System.out.println();
				System.out.println("¿A que piso deseas subir?");
				piso2=(int)obj.Leer();
				}
			System.out.println("Puertas cerradas");
			
			while (piso!=piso2 && piso<piso2){
				piso=piso+1;
				System.out.println("Usted esta en el piso: "+ piso);
				}
			System.out.println();
			System.out.println("Puertas abiertas");
			
		}
		
		if (decision.equalsIgnoreCase(b)){
			System.out.println("¿A que piso deseas bajar?");
			piso2=(int)obj.Leer();
			while (piso2<1 || piso2>15) {
				obj.PedirNuevamente=true;
				System.out.println("El edificio tiene solamente 15 pisos!");
				System.out.println("La planta baja es el piso 1");
				System.out.println();
				System.out.println("¿A que piso deseas bajar?");
				piso2=(int)obj.Leer();
				}
			while (piso2>piso || piso2==piso) {
					obj.PedirNuevamente=true;
					System.out.println("El piso indicado no es menor al actual");
					System.out.println();
					System.out.println("¿A que piso deseas bajar?");
					piso2=(int)obj.Leer();
					}

			
			System.out.println("Puertas cerradas");
			while (piso!=piso2){
				piso=piso-1;
				System.out.println("Usted esta en el piso: "+ piso);
				}
			System.out.println();
			System.out.println("Puertas abiertas");
			
		}
		else
		{
			otravez=1;
			while(otravez==1){
			obj.PedirNuevamente=true;
			System.out.println("Valor erroneo");
			System.out.println("¿Desea subir o bajar?");
			decision=obj.LeerTexto();
			if (decision.equalsIgnoreCase(a)){
				System.out.println("¿A que piso deseas subir?");
				piso2=(int)obj.Leer();
				while (piso2<1 || piso2>15) {
					obj.PedirNuevamente=true;
					System.out.println("El edificio tiene solamente 15 pisos!");
					System.out.println("La planta baja es el piso 1");
					System.out.println();
					System.out.println("¿A que piso deseas subir?");
					piso2=(int)obj.Leer();
					}
				
				while (piso2<piso || piso2==piso) {
					obj.PedirNuevamente=true;
					System.out.println("El piso indicado no es mayor al actual");
					System.out.println();
					System.out.println("¿A que piso deseas subir?");
					piso2=(int)obj.Leer();
					}
				System.out.println("Puertas cerradas");
				
				while (piso!=piso2 && piso<piso2){
					piso=piso+1;
					System.out.println("Usted esta en el piso: "+ piso);
					}
				System.out.println();
				System.out.println("Puertas abiertas");
				otravez=0;
			}
			
			if (decision.equalsIgnoreCase(b)){
				System.out.println("¿A que piso deseas bajar?");
				piso2=(int)obj.Leer();
				while (piso2<1 || piso2>15) {
					obj.PedirNuevamente=true;
					System.out.println("El edificio tiene solamente 15 pisos!");
					System.out.println("La planta baja es el piso 1");
					System.out.println();
					System.out.println("¿A que piso deseas bajar?");
					piso2=(int)obj.Leer();
					}
				while (piso2>piso || piso2==piso) {
						obj.PedirNuevamente=true;
						System.out.println("El piso indicado no es menor al actual");
						System.out.println();
						System.out.println("¿A que piso deseas bajar?");
						piso2=(int)obj.Leer();
						}

				
				System.out.println("Puertas cerradas");
				while (piso!=piso2){
					piso=piso-1;
					System.out.println("Usted esta en el piso: "+ piso);
					}
				System.out.println();
				System.out.println("Puertas abiertas");
				otravez=0;
				
			}
			}
			
		}
		
		
	}
		}

}
