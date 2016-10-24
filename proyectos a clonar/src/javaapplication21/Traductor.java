/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;


public class Traductor {    
    private char[] letraEsp={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','0','1','2','3','4','5','6','7','8','9','#','\'','-','.','!','?',','};
    private String[] letraBraile={"a.jpg","b.jpg","c.jpg","d.jpg","e.jpg","f.jpg","g.jpg","h.jpg","i.jpg","j.jpg","k.jpg","l.jpg","m.jpg","n.jpg","o.jpg","p.jpg","q.jpg","r.jpg","s.jpg","t.jpg","u.jpg","v.jpg","w.jpg","x.jpg","y.jpg","z.jpg","esp.jpg","0.jpg","1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg","7.jpg","8.jpg","9.jpg","numeral.jpg","\'.jpg","-.jpg","..jpg","admiracion.jpg","interrogacion.jpg",",.jpg"};
    private char[] textoAConvertir=new char[10000];
    private String[] traducidas=new String[10000];
    
    public Traductor(char[] textoAConvertir) {
        this.textoAConvertir = textoAConvertir;
    }
    
    public char[] getLetraEsp() {
        return letraEsp;
    }

    public void setLetraEsp(char[] letraEsp) {
        this.letraEsp = letraEsp;
    }

    public String[] getLetraBraile() {
        return letraBraile;
    }

    public void setLetraBraile(String[] letraBraile) {
        this.letraBraile = letraBraile;
    }

    public char[] getTextoAConvertir() {
        return textoAConvertir;
    }

    public void setTextoAConvertir(char[] textoAConvertir) {
        this.textoAConvertir = textoAConvertir;
    }

    public String[] getTraducidas() {
        String palabras[]=new String[10000];
        int contador=0;
        char txtC[]=new char[10000];
        txtC=getTextoAConvertir();
        for (int i = 0; i < txtC.length; i++) {
            for(int j=0; j< letraEsp.length;j++){
                String c= ""+txtC[i];
                if(txtC[i]==letraEsp[j] && c!=null && c!=""){
                        palabras[contador]=letraBraile[j];   
                        contador++;
                }
            }
        }
        return palabras;
    }

    public void setTraducidas(String[] traducidas) {
        this.traducidas = traducidas;
    }

    
}
