
public class MetodosCalculadora {

	public String soma(String b1, String b2) {
		char[] arrayB1 = b1.toCharArray();
		char[] arrayB2 = b2.toCharArray();
		char[] resultado = new char[b1.length()];

		int sobe = 0;
		int soma = 0;

		for (int i = arrayB1.length - 1; i >= 0; i--) {

			int v1 = Character.getNumericValue(arrayB1[i]);
			int v2 = Character.getNumericValue(arrayB2[i]);

			soma = sobe + v1 + v2;

			switch (soma) {
			case 1:
				soma = 1;
				sobe = 0;
				break;

			case 2:
				soma = 0;
				sobe = 1;
				break;

			case 3:
				soma = 1;
				sobe = 1;
				break;

			default:
				soma = 0;
				sobe = 0;
			}

			resultado[i] = Character.forDigit(soma, 2);
		}

		String resultadoString = new String(resultado);

		return resultadoString;
	}

	public String subtração(String str, String str2) {
		char[] strArray = str2.toCharArray();

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == '0') {
				strArray[i] = '1';
			} else {
				strArray[i] = '0';
			}
		}

		String StringInvertida = new String(strArray);

		String resultadoNegativo = soma(StringInvertida, "00000001");
		String resultadoSubtração = soma(str, resultadoNegativo);

		return resultadoSubtração;
	}

}
