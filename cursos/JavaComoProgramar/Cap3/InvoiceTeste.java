public class InvoiceTeste{
	public static void main(String args[]){
	   Invoice invoice = new Invoice("1", "Teste de entrada de dados", 10, 110.25);
       
       System.out.println("Numero:............."+ invoice.getNumero());
       System.out.println("Descricao:.........."+ invoice.getDescricao());
       System.out.println("Quantidade:........."+ invoice.getQuantidade());
       System.out.println("Preco:.............."+ invoice.getPreco());
       System.out.println("-----------------------------");
       System.out.println("SubTotal:..........."+ invoice.getInvoiceAmount());  
	}
}