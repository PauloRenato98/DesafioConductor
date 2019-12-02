package jsonConductor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LerJSON {

	public static void main(String[] args) throws ParseException {
		
		CadastroUsuario p1 = new CadastroUsuario();
		JSONObject jsonObject;

		JSONParser parser = new JSONParser();
		
	

		long id ;
		String cpf;
		String nome;
		String dataNascimento;
		String renda;
		long numeroDeDependentes;
		
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("C:\\Users\\Paulo\\Desktop\\dados.json"));
			
			id= (Long) jsonObject.get("id");
			cpf= (String) jsonObject.get("cpf");
			nome= (String) jsonObject.get("nome");
			dataNascimento= (String) jsonObject.get("dataNascimento");
			renda= (String) jsonObject.get("renda");
			numeroDeDependentes= (Long) jsonObject.get("numeroDeDependentes");
			p1.setId((int) id);
			p1.setNome(nome);
			p1.setCpf(cpf);
			p1.setNome(nome);
			p1.setDataNascimento(dataNascimento);
			p1.setRenda(renda);
			p1.setNumeroDeDependentes((int) numeroDeDependentes);
			
			System.out.println(p1.toString());
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();}
		catch(org.json.simple.parser.ParseException e){
			System.out.println("teste");
			e.printStackTrace();}
		
	
	}
}
