/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class MinhasConfiguracoes implements java.io.Serializable{
    
    private static long serialVersionUID = 1L;
    
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    
    private String host;
    private String email;
    private String senha;
    private int porta = 587;
    
    public MinhasConfiguracoes() {
    }

    /** * @param arquivo define qual o caminho do arquivo .txt
     * Seta o objeto MinhasConfiguracoes para novo idioma
     * @return retorna o objeto traducao com o respectivo idioma
     */
    public MinhasConfiguracoes getObjeto(String arquivo) {
        try {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(arquivo)))) {
                MinhasConfiguracoes resultado = (MinhasConfiguracoes) ois.readObject();
                return resultado;
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Erro causado por:" + ex);
            return null;
        }
    }

    /**
     * @param configuracoes objeto para setar tradu��o nova
     * @param idioma nome do arquivo
     * @return mensagem de erro ou nada em caso de sucesso
     */
    public String setObjeto(MinhasConfiguracoes configuracoes) {
        java.io.ObjectOutputStream oos;
        try {
            oos = new java.io.ObjectOutputStream(new FileOutputStream(new File("C:/envio_massa/minhas_configuracoes")));
            oos.writeObject(configuracoes);
            oos.close();            
        } catch (IOException ex) {
            return ""+ ex;
        }
        return "";
    }    

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
    

}
