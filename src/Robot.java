import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Robot {

		public void lineahorizontal(int a){
			for (int i = 0; i < a; i++) {
				System.out.print(" *");
			}
		}
		
		public void lineavertical(int a){
			for (int i = 0; i < a; i++) {
				System.out.println();
			
			for (int y = 0; y < a; y++) {
					if (y==0||(y+1==a)) {
					System.out.print("*");
					}
					else 
					System.out.print("   ");
					}
				}
		}
		
		public void cuadrado(int a){
		
			lineahorizontal(a);
			lineavertical(a);
			System.out.println();
			lineahorizontal( a);
		}
		
		boolean  PedirNuevamente = true;
		public float Leer() {
			String ValorLeido = "";
			float ValorConvertido = 0;
			try { InputStreamReader io = new InputStreamReader(System.in);
				  BufferedReader leer = new BufferedReader(io);
				  ValorLeido = leer . readLine();
				  ValorConvertido = Float.parseFloat(ValorLeido);
				  PedirNuevamente = false;
				  
						
			} catch (NumberFormatException nf) {
				// TODO: handle exception
				System.out.println("Disculpe usted ha colocado un valor erroneo");
				PedirNuevamente = true;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ha ocurrido un error general");
				PedirNuevamente = true;
			}
				return ValorConvertido;
		}
		public String LeerTexto() {
			String ValorLeido = "";
			try { InputStreamReader io = new InputStreamReader(System.in);
				  BufferedReader leer = new BufferedReader(io);
				  ValorLeido = leer . readLine();
				  PedirNuevamente = false;
				  
						
			} catch (IOException objexcepcion) {
				// TODO: handle exception
				System.out.println("Disculpe ocurrio un error");
				PedirNuevamente = true;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ha ocurrido un error general");
				PedirNuevamente = true;
			}
				return ValorLeido;
		}
	}


