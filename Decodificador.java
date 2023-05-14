import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class PolarZenit {
    public static void main(String[] args) throws IOException {  
        String pathCod = "temp/aEncodedTxt.txt";
        String pathTextoDecod = "temp/aNormalTxt.txt";

        String textoCodificado = leitor(pathCod);
        String textoDecodificado = decodificar(textoCodificado);
        escritor(pathTextoDecod, textoDecodificado);
    }

    public static void escritor(String path, String texto) throws IOException {
        BufferedWriter bw = new BufferedWriter( new FileWriter(path) );
        bw.append(texto);
        bw.close();
    }

    public static String leitor(String path) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader(path) );
        StringBuffer sb = new StringBuffer();
        String linha = "";

        while ((linha = br.readLine()) != null) {
            sb.append(linha);
            sb.append("\n");
        }
        br.close();
        return sb.toString();
    }

    public static String decodificar(String txtCodificado) {
        String txtDecodificado = "";
        for(int i=0; i < txtCodificado.length(); i++) {
            char c = txtCodificado.charAt(i);
            switch (c) {
                case 'p': txtDecodificado += 'z'; break;
                case 'o': txtDecodificado += 'e'; break;
                case 'l': txtDecodificado += 'n'; break;
                case 'a': txtDecodificado += 'i'; break;
                case 'r': txtDecodificado += 't'; break;

                case 'P': txtDecodificado += 'Z'; break;
                case 'O': txtDecodificado += 'E'; break;
                case 'L': txtDecodificado += 'N'; break;
                case 'A': txtDecodificado += 'I'; break;
                case 'R': txtDecodificado += 'T'; break;

                case 'z': txtDecodificado += 'p'; break;
                case 'e': txtDecodificado += 'o'; break;
                case 'n': txtDecodificado += 'l'; break;
                case 'i': txtDecodificado += 'a'; break;
                case 't': txtDecodificado += 'r'; break;

                case 'Z': txtDecodificado += 'P'; break;
                case 'E': txtDecodificado += 'O'; break;
                case 'N': txtDecodificado += 'L'; break;
                case 'I': txtDecodificado += 'A'; break;
                case 'T': txtDecodificado += 'R'; break;
                default: txtDecodificado += c; break;
            }
        }
        return txtDecodificado;
    }
}
