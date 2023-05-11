package br.com.haldirleao.cursojava.aula56;

public class TesteDocumento {
    public static void main(String[] args) {
        
        System.out.println("-- Gera um documento para cada instância (VALORES) do enum --");
        for (TipoDocumento doc : TipoDocumento.values()) {

            System.out.println(doc + " " + doc.geraNumeroTeste());            
        }
        

        System.out.println("\n-- Instância pessoa física e gera CPF aleatório --");
        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(TipoDocumento.CPF);
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf);
        
        System.out.println("\n-- Instância pessoa jurídica e gera CNPF aleatório --");
        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(TipoDocumento.CNPJ);
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj);
    }
}
