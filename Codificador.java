import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ZenitPolar {
    public static void main(String[] args) throws IOException {
        String pathTexto = "temp/aNormalTxt.txt";
        String pathCod = "temp/aEncodedTxt.txt";

        String texto = leitor(pathTexto);
        String textoCodficado = codificar(texto);
        escritor(pathCod, textoCodficado);
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

        while (linha!=null){
            sb.append(linha + "\n");
            linha = br.readLine();

            if (linha != null) {
                String[] parts = linha.split(";");
                for(int i = 0; i < parts.length; i++) {
                    System.out.print("["+parts[i]+"]");
                }
            }
        }
        br.close();
        return sb.toString();
    }

    public static String codificar(String txt){
        String txtCodificado = "";
        for(int i=0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            switch (c) {
                case 'z': txtCodificado += 'p'; break;
                case 'e': txtCodificado += 'o'; break;
                case 'n': txtCodificado += 'l'; break;
                case 'i': txtCodificado += 'a'; break;
                case 't': txtCodificado += 'r'; break;

                case 'Z': txtCodificado += 'P'; break;
                case 'E': txtCodificado += 'O'; break;
                case 'N': txtCodificado += 'L'; break;
                case 'I': txtCodificado += 'A'; break;
                case 'T': txtCodificado += 'R'; break;

                case 'p': txtCodificado += 'z'; break;
                case 'o': txtCodificado += 'e'; break;
                case 'l': txtCodificado += 'n'; break;
                case 'a': txtCodificado += 'i'; break;
                case 'r': txtCodificado += 't'; break;

                case 'P': txtCodificado += 'Z'; break;
                case 'O': txtCodificado += 'E'; break;
                case 'L': txtCodificado += 'N'; break;
                case 'A': txtCodificado += 'I'; break;
                case 'R': txtCodificado += 'T'; break;
                default: txtCodificado += c; break;
            }
        }
        return txtCodificado;
    }
}
