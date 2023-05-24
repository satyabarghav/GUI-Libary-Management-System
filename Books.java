public class Books {
	int id;
	String name,author;
	float price;
	Books(int id,String n,String a,float pr){
		this.id = id;
		name = n;
		author = a;
		price = pr;
	}
	public String toString() {
		return "Id: "+id+"\nName: "+name+"\nAuthor: "+author+"\nPrice : "+price+"\n";
	}
}
