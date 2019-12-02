package jsonConductor;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

public class RetonarJSON {

	public static void main(String[] args) {

		CadastroUsuario c1 = new CadastroUsuario(12, "11122244477", "José Bonifácio", "2019-11-26", "987.35", 2);
		//Gson é uma biblioteca Java de código aberto para serializar e desserializar objetos Java para JSON
		Gson gson = new Gson();

		String json = gson.toJson(c1);

		System.out.println(json);

	}

}
