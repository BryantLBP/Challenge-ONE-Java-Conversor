
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Conversor {
	
	public static void main(String[] args) throws Exception {
		
		//Tipos de cambio del dia 22 de marzo de 2023 para el sol peruano
		double dolar = 0.26;
		double euro = 0.24;
		double libra =  0.22;
		double yen = 34.78;
		double won = 343.17;
		double cantidad = 0;
		
		//DecimalFormat para reducir los decimales de los posibles resultados a solo centésimas
		DecimalFormat df = new DecimalFormat("##.##");
		
		//Ejecución del programa
		boolean inicio = true;
		while(inicio) { 
			
			//Opciones a disposición
			Object[] conversor = {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Longitud"};
			Object conversion = JOptionPane.showInputDialog(
					null,
					"Seleccione una opción de conversión",
					"Conversor de Unidades",
					JOptionPane.QUESTION_MESSAGE,
					null,
					conversor,
					conversor[0]);
		
			//En caso de ser haber salido de la aplicación
			if (conversion == null) {
				JOptionPane.showMessageDialog(null, "Error");
				return;
			}
		
			//Opcion elegida: Conversor de Monedas
			if (conversion.equals("Conversor de Monedas")) {
				Object[] tipoDivisa = {"De Sol Peruano a Dólar estadounidense", "De Sol Peruano a Euro", "De Sol Peruano a Libra Esterlina", "De Sol Peruano a Yen Japonés", "De Sol Peruano a Won sul-coreano", "De Dólar estadounidense a Sol Peruano", "De Euro a Sol Peruano", "De Libra Esterlina a Sol Peruano", "De Yen Japonés a Sol Peruano", "De Won sul-coreano a Sol Peruano"};
				String divisas = JOptionPane.showInputDialog(
						null,
						"Elija la moneda a la que deseas convertir tu dinero",
						"Conversor de Unidades",
						JOptionPane.QUESTION_MESSAGE,
						null,
						tipoDivisa,
						null).toString();
				
				//Mensaje para que el usuario coloque la debida información
				String inputDivisas = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
			
				//try/catch para que no se introduzcan letras o caracteres especiales
				try {
					cantidad = Double.parseDouble(inputDivisas);
				} catch (NumberFormatException | NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				};
			
				//Todas las opciones de conversión de monedas desplegadas, con su respectivo mensaje 
				switch (divisas) {                              
		
					case "De Sol Peruano a Dólar estadounidense": {
						JOptionPane.showMessageDialog(null, "Tienes $" + df.format(cantidad * dolar) + " Dólares");
						break;
					}
					
					case "De Sol Peruano a Euro": {
						JOptionPane.showMessageDialog(null, "Tienes €" + df.format(cantidad * euro) + " Euros");
						break;
					}
				
					case "De Sol Peruano a Libra Esterlina": {
						JOptionPane.showMessageDialog(null, "Tienes £" + df.format(cantidad * libra) + " Libras");
						break;
					}
				
					case "De Sol Peruano a Yen Japonés": {
						JOptionPane.showMessageDialog(null, "Tienes ¥" + df.format(cantidad * yen) + " Yenes");
						break;
					}
				
					case "De Sol Peruano a Won sul-coreano": {
						JOptionPane.showMessageDialog(null, "Tienes ₩" + df.format(cantidad * won) + " Wones");
						break;
					}
				
					case "De Dólar estadounidense a Sol Peruano": {
						JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(cantidad * 3.78) + " Soles");
						break;
					}
				
					case "De Euro a Sol Peruano": {
						JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(cantidad * 4.10) + " Soles");
						break;
					}
				
					case "De Libra Esterlina a Sol Peruano": {
						JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(cantidad * 4.64) + " Soles");
						break;
					}
				
					case "De Yen Japonés a Sol Peruano": {
						JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(cantidad * 0.029) + " Soles");
						break;
					}
				
					case "De Won sul-coreano a Sol Peruano": {
						JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(cantidad * 0.0029) + " Soles");
						break;
					}
					
					default:
						JOptionPane.showMessageDialog(null, "Error");
				}
			
			}
			
			//Opción elegida: Conversor de Temperatura
			if (conversion.equals("Conversor de Temperatura")) {
				Object[] tipoTemperatura = {"De Celsius (°C) a Fahrenheit (°F)", "De Celsius (°C) a Kelvin (K)", "De Fahrenheit (°F) a Celsius (°C)", "De Fahrenheit (°F) a Kelvin (K)", "De Kelvin (K) a Celsius (°C)", "De Kelvin (K) a Fahrenheit (°F)"};
				String temperatura = JOptionPane.showInputDialog(
						null,
						"Elija la temperatura que deseas convertir",
						"Conversor de Unidades",
						JOptionPane.QUESTION_MESSAGE,
						null,
						tipoTemperatura,
						null).toString();
				
				String inputTemperatura  = JOptionPane.showInputDialog("Ingresa la cantidad de grados que deseas convertir");
			
				try {
					cantidad = Double.parseDouble(inputTemperatura);
				} catch (NumberFormatException | NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				};
			
				switch (temperatura) {                              
			
					case "De Celsius (°C) a Fahrenheit (°F)": {
						JOptionPane.showMessageDialog(null, cantidad + " °C" + " son " + df.format((cantidad * 1.8) + 32) + " °F");
						break;
					}
				
					case "De Celsius (°C) a Kelvin (K)": {
						JOptionPane.showMessageDialog(null, cantidad + " °C" + " son " + df.format(cantidad + 273.15) + " K");
						break;
					}
			
					case "De Fahrenheit (°F) a Celsius (°C)": {
						JOptionPane.showMessageDialog(null, cantidad + " °F" + " son " + df.format((cantidad - 32) / 1.8) + " °C");
						break;
					}
			
					case "De Fahrenheit (°F) a Kelvin (K)": {
						JOptionPane.showMessageDialog(null, cantidad + " °F" + " son " + df.format(((cantidad - 32) * 5/9) + 273.15) + " K");
						break;
					}
			
					case "De Kelvin (K) a Celsius (°C)": {
						JOptionPane.showMessageDialog(null, cantidad + " K" + " son " + df.format(cantidad - 273.15) + " °C");
						break;
					}
			
					case "De Kelvin (K) a Fahrenheit (°F)": {
						JOptionPane.showMessageDialog(null, cantidad + " K" + " son " + df.format(((cantidad - 273.15) * 9/5) + 32) + " °F");
						break;
					}
			
					default:
						JOptionPane.showMessageDialog(null, "Error");
				
				}
				
			}
			
			//Opción elegida: Conversor de Longitud
			if (conversion.equals("Conversor de Longitud")) {
				Object[] tipoLongitud = {"De Milimetros a Centimetros", "De Milimetros a Metros", "De Milimetros a Kilometros", "De Centimetros a Milimetros", "De Centimetros a Metros", "De Centimetros a Kilometros", "De Metros a Milimetros", "De Metros a Centimetros", "De Metros a Kilometros", "De Kilometros a Milimetros", "De Kilometros a Centimetros", "De Kilometros a Metros"};
				String longitud = JOptionPane.showInputDialog(
						null,
						"Elija la unidad que deseas convertir",
						"Conversor de Unidades",
						JOptionPane.QUESTION_MESSAGE,
						null,
						tipoLongitud,
						null).toString();
				
				String inputLongitud  = JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir");
			
				try {
					cantidad = Double.parseDouble(inputLongitud);
				} catch (NumberFormatException | NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				};
			
				switch (longitud) {                              
			
					case "De Milimetros a Centimetros": {
						JOptionPane.showMessageDialog(null, cantidad + " mm" + " son " + (cantidad / 10) + " cm");
						break;
					}
				
					case "De Milimetros a Metros": {
						JOptionPane.showMessageDialog(null, cantidad + " mm" + " son " + (cantidad / 1000) + " m");
						break;
					}
			
					case "De Milimetros a Kilometros": {
						JOptionPane.showMessageDialog(null, cantidad + " mm" + " son " + (cantidad / 1000000) + " km");
						break;
					}
			
					case "De Centimetros a Milimetros": {
						JOptionPane.showMessageDialog(null, cantidad + " cm" + " son " + (cantidad * 10) + " mm");
						break;
					}
			
					case "De Centimetros a Metros": {
						JOptionPane.showMessageDialog(null, cantidad + " cm" + " son " + (cantidad / 100) + " m");
						break;
					}
			
					case "De Centimetros a Kilometros": {
						JOptionPane.showMessageDialog(null, cantidad + " cm" + " son " + (cantidad / 100000) + " km");
						break;
					}
					
					case "De Metros a Milimetros": {
						JOptionPane.showMessageDialog(null, cantidad + " m" + " son " + (cantidad * 1000) + " mm");
						break;
					}
					
					case "De Metros a Centimetros": {
						JOptionPane.showMessageDialog(null, cantidad + " m" + " son " + (cantidad * 100) + " cm");
						break;
					}
					
					case "De Metros a Kilometros": {
						JOptionPane.showMessageDialog(null, cantidad + " m" + " son " + (cantidad / 1000) + " km");
						break;
					}
					
					case "De Kilometros a Milimetros": {
						JOptionPane.showMessageDialog(null, cantidad + " km" + " son " + (cantidad * 1000000) + " mm");
						break;
					}
					
					case "De Kilometros a Centimetros": {
						JOptionPane.showMessageDialog(null, cantidad + " km" + " son " + (cantidad * 100000) + " cm");
						break;
					}
					
					case "De Kilometros a Metros": {
						JOptionPane.showMessageDialog(null, cantidad + " km" + " son " + (cantidad * 1000) + " m");
						break;
					}
			
					default:
						JOptionPane.showMessageDialog(null, "Error");
				
				}
				
			}
			
			//Mensaje para que se pregunte al usuario si quiere hacer alguna otra conversion o simplemente finalizar el programa
			double continuar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			
			if (JOptionPane.YES_OPTION == continuar) {
					System.out.println("Afirmativo");
			} else {
				//Retorna nuevamente al menú principal de la aplicación
				inicio = false;
				JOptionPane.showMessageDialog(null, "Programa terminado");
			}
			
		}
		
	}

}	
